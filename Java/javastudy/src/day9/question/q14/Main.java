package day9.question.q14;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CheckPassword check = new CheckPassword();
    Scanner sc = new Scanner(System.in);

    while(true) {
      boolean valid = true;
      String message = "";

      System.out.println("암호를 입력하세요. : ");
      String password = sc.nextLine();
      System.out.println("입력한 password = " + password);


      if (password.length() < 10) {
        valid = false;
        message += "이유: 암호의 길이가 10보다 작다.\n";
      }

      if (check.countNumber(password) < 1) {
        valid = false;
        message += "이유: 암호 내에 숫자가 없다.\n";
      }

      if (check.countAlphabet(password) < 1) {
        valid = false;
        message += "이유: 암호 내에 영문자가 없다.\n";
      }

      if (!valid) {
        System.out.println("암호가 유효하지 않다.\n" + message);
      } else {
        System.out.println("암호가 유효하다.");
        break;
      }
    }
    sc.close();
  }
}