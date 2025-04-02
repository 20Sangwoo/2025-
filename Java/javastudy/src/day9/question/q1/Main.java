package day9.question.q1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    CalculateProduct cal = new CalculateProduct();


    System.out.println("첫 번째 자연수 : ");
    int a = scan.nextInt();

    System.out.println("두 번째 자연수 : ");
    int b = scan.nextInt();

    int prod1 = cal.product1(a, b);
    int prod2 = cal.product2(a, b);
    int prod3 = cal.product3(a, b);

    System.out.printf("%d  %d  %d", prod1, prod2, prod3);
    System.out.println();

    scan.close();
  }
}
