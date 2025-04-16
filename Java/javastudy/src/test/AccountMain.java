package test;

import java.util.Scanner;

public class AccountMain {
  private static final int MAX_ACCOUNTS = 3;  // 총 계좌 개설 한도
  private static Account[] accounts = new Account[MAX_ACCOUNTS];  // 계좌 저장할 배열
  private static int accountCount = 0;  // 계좌 개설 수를 세는 변수

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Scanner 객체
    int menu; // 메뉴 (정수 값으로 구분)

//    do-while 문을 이용해 처음은 메뉴를 무조건 출력하도록 하고
//    7(종료) 버튼을 누르면 종료되도록 함
    do {
      System.out.println("\n메뉴 : 1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
      System.out.print("선택 : ");
      menu = sc.nextInt();
      sc.nextLine();

//      switch 문으로 입력받은 값에 따라 실행할 기능 메소드 구분
      switch (menu) {
        case 1 -> createAccount(sc);  // 신규
        case 2 -> deleteAccount(sc);  // 폐지
        case 3 -> deposit(sc);        // 입금
        case 4 -> withdraw(sc);       // 출금
        case 5 -> viewAccount(sc);    // 계좌 조회 (개별)
        case 6 -> viewAllAccounts();  // 계좌 조회 (전체)
        case 7 -> System.out.println("프로그램을 종료합니다."); // 종료
        default -> System.out.println("잘못된 선택입니다.");   // 오류
      }
    } while (menu != 7);
    sc.close();
  }

//  신규 기능 메소드
  private static void createAccount(Scanner sc) {
    if (accountCount >= MAX_ACCOUNTS) { // 이번 개설이 총 계좌 개설 한도(5) 이상인 경우
      System.out.println("계좌 개설 한도 초과(최대 3개)"); // 오류 문구와 함께 메뉴로 돌아감
      return;
    }

    System.out.print("예금주 이름: ");
    String name = sc.nextLine();

    for (Account ac : accounts) { // 배열에 들어있는 항목들 검사
      if (ac != null && ac.getName().equals(name)) {  // ac가 null이 아닌지, 이름이 같은 계좌 있는지
        System.out.println("이미 소유 계좌가 존재합니다. (동명이인 불가)");
        return;
      }
    }

    String accountNumber = "ABCD" + (1001 + accountCount);  // ABCD + 1001부터 1씩 올라감
    accounts[accountCount++] = new Account(name, accountNumber);  // 새 계좌 생성
    System.out.println("계좌 개설 완료. 계좌번호: " + accountNumber); // 완료 문구 출력
  }

//  폐지 기능 메소드
  private static void deleteAccount(Scanner sc) {
    System.out.print("폐지할 계좌번호: ");
    String number = sc.nextLine();

    for (int i = 0; i < accountCount; i++) {  // index를 통해 배열의 항목들을 검사
      if (accounts[i].getAccountNumber().equals(number)) {  // 입력 받은 계좌 번호와 비교하며 찾음
        if (accounts[i].getBalance() > 0) { // 계좌 잔액이 남아있을 경우
          System.out.println("잔액이 남아 있어 계좌를 폐지할 수 없습니다.");
          return;
        } else {
          accounts[i] = accounts[accountCount - 1]; // 배열의 마지막 계좌를 현재 위치로 덮어씌움
          accounts[accountCount - 1] = null;  // 원래의 마지막 계좌는 null(삭제)
          accountCount--; // 계좌 개설 수 -1
          System.out.println("계좌가 폐지되었습니다."); // 완료 문구 출력
          return;
        }
      }
    }
    System.out.println("해당 계좌를 찾을 수 없습니다.");  // 계좌 번호에 맞는 계좌를 찾지 못했을 경우
  }

//  입금 기능 메소드
  private static void deposit(Scanner sc) {
    System.out.print("입금할 계좌번호: ");
    String number = sc.nextLine();
    Account acc = findAccount(number);  // 입력 받은 계좌 번호를 통해 계좌를 찾음

    if (acc == null) {  // 해당 계좌 번호가 없을 경우
      System.out.println("계좌를 찾을 수 없습니다.");
      return;
    }

    System.out.print("입금할 금액: ");
    int amount = sc.nextInt();
    sc.nextLine();

    if (amount > 40000) { // 입금액이 4만원 이상일 경우
      System.out.println("1회 입금 한도는 4만원입니다.");
      return;
    }

    if (acc.getBalance() + amount > 100000) { // 예치 금액이 총 10만원이 초과될 경우
      System.out.println("예치 금액은 최대 10만원을 초과할 수 없습니다.");
      return;
    }

    acc.deposit(amount);  // 둘 다 해당되지 않으면 입금 처리
    System.out.println("입금 완료. 현재 잔액: " + acc.getBalance());  // 완료 문구 + 잔액 출력
  }

//  출금 기능 메소드
  private static void withdraw(Scanner sc) {
    System.out.print("출금할 계좌번호: ");
    String number = sc.nextLine();
    Account acc = findAccount(number);

    if (acc == null) {
      System.out.println("계좌를 찾을 수 없습니다.");
      return;
    }

    System.out.print("출금할 금액: ");
    int amount = sc.nextInt();
    sc.nextLine();

    if (amount > 40000) {
      System.out.println("1회 출금 한도는 4만원입니다.");
      return;
    }

    if (!acc.withdraw(amount)) {  // 계좌 잔액보다 출금액이 높을 경우 (마이너트 통장 불가)
      System.out.println("잔액 부족으로 출금할 수 없습니다.");
    } else {
      System.out.println("출금 완료되었습니다.");
      System.out.println("현재 잔액: " + acc.getBalance());
    }
  }

//  조회 기능 메소드
  private static void viewAccount(Scanner sc) {
    System.out.print("조회할 계좌번호: ");
    String number = sc.nextLine();
    Account acc = findAccount(number);

    if (acc != null) {
      System.out.println(acc);
    } else {
      System.out.println("계좌를 찾을 수 없습니다.");
    }
  }

  private static void viewAllAccounts() {
    System.out.println("전체 계좌 조회:");
    for (Account acc : accounts) {  // 배열에 들어있는 항목들 검사
      if (acc != null) System.out.println(acc);  // 값이 있으면 조회 메소드 통해 정보 출력
    }
    System.out.println("사용중인 계좌 수: " + accountCount);
    System.out.println("잔여 계좌 수: " + (MAX_ACCOUNTS - accountCount));
  }

//  계좌 번호로 계좌 정보를 찾는 기능 메소드
  private static Account findAccount(String number) {
    for (Account acc : accounts) {  // 배열에 들어있는 항목들 검사
//  배열 안에 입력받은 번호에 해당하는 계좌가 있는 경우
      if (acc != null && acc.getAccountNumber().equals(number)) {
        return acc;
      }
    }
    return null;
  }
}

