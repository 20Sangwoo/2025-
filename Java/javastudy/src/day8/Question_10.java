package day8;

import java.util.Scanner;

/*
  4칙연산이 가능한 계산기 구현하기
  각, 연산에 대해 개별 메소드를 작성하여 구현하시오.
  --------------------------------------
  메뉴: 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 0.종료
  -------------------------------------
  연산 : 1
  피연산자1 : 10
  피연산자2 : 20
  결과 : 30

 */
public class Question_10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    while (!stop) {
      System.out.println("--------------------------------------");
      System.out.println("메뉴: 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 0.종료");
      System.out.println("--------------------------------------");
      System.out.printf("연산 : ");
      int menu = scanner.nextInt();
      if(menu == 0) {
        stop = true;
        continue;
      }
      if( menu < 0 || menu > 4) {
        System.out.println("메뉴(1~4) 중 선택 바랍니다!");
        continue;
      }

      System.out.printf("피연산자1 : ");
      int op1 = scanner.nextInt();
      System.out.printf("피연산자2 : ");
      int op2 = scanner.nextInt();

      double result = 0;
      switch (menu) {
        case 1 :  // 덧셈
          result = add(op1,op2);
          break;
        case 2 : // 뺄셈
          result = minus(op1, op2);
          break;
        case 3 : // 곱셈
          result = multiply(op1, op2);
          break;
        case 4 : // 나눗셈
          result = devide(op1, op2);
          break;
      }
      System.out.println("결과 : " + result);
    }
  }

  private static double devide(int op1, int op2) {
    return (double)op1 / op2;
  }

  private static double multiply(int op1, int op2) {
    return op1 * op2;
  }

  private static double minus(int op1, int op2) {
    return op1 - op2;
  }

  private static double add(int op1, int op2) {
    return op1 + op2;
  }
}
