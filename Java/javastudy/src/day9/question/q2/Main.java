package day9.question.q2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SumOfSquares sum = new SumOfSquares();

    System.out.println("양의 정수 입력 : ");
    int N = sc.nextInt();

    System.out.println(sum.SumWhile(N));
    System.out.println(sum.SumRecursive(N));

    sc.close();
  }
}
