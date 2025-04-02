package day7;

import java.util.Scanner;

public class StringMethod {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("문자열을 입력하세요 : ");
    String str = scanner.nextLine();//한줄 입력
    System.out.println("문자열길이 : " + str.length());
  }
}
