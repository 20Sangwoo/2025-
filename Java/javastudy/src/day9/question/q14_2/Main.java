package day9.question.q14_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String password;  // 입력 받은 암호
    String message;   // 암호가 유효하지 않은 이유
    boolean valid;    // 암호의 유효 여부를 알려 주는 부울 형 변수
    Scanner scan; // 객체 참조변수

    scan = new Scanner(System.in);
    CheckPassword checkPassword = new CheckPassword();


    System.out.printf("암호를 입력하세요: ");
    password = scan.nextLine(); //콘솔에서 엔터입력 전까지의 라인을 읽어 문자열로 반환
    System.out.println("password = " + password);

    valid = true;
    message = "";

    if(password.length() < 10){
      valid = false;
      message += "이유: 암호의 길이가 10보다 작다\t";
    }

    if(checkPassword.countNumber(password) < 1){
      valid = false;
      message += "이유: 암호 내에 숫자가 없다\t";
    }

    if(checkPassword.countAlphabet(password) < 1){
      valid = false;
      message += "이유: 암호 내에 영문자가 없다\t";
    }

    if(valid) {
      System.out.println("암호가 유효하다.");
    }else{
      System.out.println("암호가 유효하지 않다." + message );
    }
  }
}