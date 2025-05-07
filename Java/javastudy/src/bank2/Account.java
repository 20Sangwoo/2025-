package bank2;

public class Account {
  //속성
  private String accountName;     // 예금주명
  private int balance;            // 잔액
  private String accountNumber;   // 계좌번호

  private static int accountNum;  // 계좌번호 카운트
  private static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호자리수

  /**
   * 생성자
   * @param accountName 예금주명
   */
  public Account(String accountName) {
    // super();
    this.accountName = accountName;
    //계좌번호 생성
    accountNumber = makeAccountNumber();
  }

  /**
   * 입급
   * @param money 입금액
   */
  public void deposit(int money){
    //1) 1회 입금한도 체크
    if(money > 40_000){
      System.out.println("1회 입금한도 초과!");
      return;
    }
    //2) 예치금 10만원 체크
    if(money + balance > 100_000){
      System.out.println("예치금 한도 초과!");
      return;
    }
    //3) 입금처리
    balance += money;

    System.out.printf("입금액 : %d, 잔액: %d", money,balance);
    System.out.println();
  }

  /**
   * 출금
   * @param money 출금액
   */
  public void withdraw(int money) {
    //1) 1회 출금한도 체크
    if(money > 40_000){
      System.out.println("1회 출금한도 초과!");
      return;
    }
    //2) 잔액 체크
    if( balance - money < 0){
      System.out.println("잔액 부족!");
      return;
    }
    //3) 출금처리
    balance -= money;

    System.out.printf("출금액 : %d, 잔액: %d", money,balance);
    System.out.println();
  }

  /**
   * 계좌조회(개별)
   * @return 계좌 정보
   */
  public String getAccountInfo() {
    return "예금주명 : " + accountName + "," +
            "잔고 : " + balance + "," +
            "계좌번호 " + accountNumber;
  }

  /**
   * 예금주명 반환
   * @return 예금주명
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * 계좌번호 반환
   * @return 계좌번호
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * 잔액 반환
   * @return 잔액
   */
  public int getBalance() {
    return balance;
  }


  // 계좌번호 생성
  private String makeAccountNumber() {
    String str = String.valueOf(++accountNum);    // "11"
    int zeroCnt = ACCOUNT_NUM_SIZE - str.length(); // 1 -> "011"
    for (int i = 0; i < zeroCnt; i++) {
      str = "0" + str;
    }
    return str;
  }
}