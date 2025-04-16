package test;

public class Account {
  private String name;  // 예금주 이름
  private String accountNumber; // 계좌 번호
  private int balance;  // 계좌 잔액

//  생성자 메소드
  public Account(String name, String accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = 0; // 초기 계좌 잔액은 0원으로 설정
  }

//  Getter, Setter
  public String getName() {
    return name;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

//  입금 기능 메소드
  public void deposit(int amount) {
    balance += amount;
  }
  
//  출금 기능 메소드
  public boolean withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

//  조회 기능 (출력) 메소드
  @Override
  public String toString() {
    return "예금주: " + name + ", 계좌번호: " + accountNumber + ", 잔액: " + balance;
  }
}
