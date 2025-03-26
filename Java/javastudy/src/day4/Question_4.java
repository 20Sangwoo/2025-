package day4;

import java.util.Scanner;

/*
    도형의 넓이 구하기
    -------------------------
    메뉴 : 1.사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 1
    가로 : 20
    세로 : 30
    넓이 : 600

    -------------------------
    메뉴 : 1.사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 2
    반지름 : 5
    넓이 : ****

    -------------------------
    메뉴 : 1.사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 3

    프로그램 종료!!

 */
public class Question_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean stop = false;
    while (!stop) {
      System.out.println("-------------------------");
      System.out.println("메 뉴 : 1.사각형 2.원 3.종료");
      System.out.println("-------------------------");
      System.out.print("구하고자하는 도형 : ");
      int menu = scanner.nextInt();

      switch(menu) {
        case 1: // 사각형의 넓이
          System.out.print("가로 : ");
          double wide = scanner.nextDouble();
          System.out.print("세로 : ");
          double vertical = scanner.nextDouble();
          System.out.println("넓이 : " + (wide * vertical));
          break;
        case 2: // 원의 넓이
          System.out.print("반지름 : ");
          double radius = scanner.nextDouble();
          System.out.println("넓이 : " + (radius * radius * 3.14));
          break;
        case 3: // 종료
          stop = true;
          continue;
      }
    }
  }
}
