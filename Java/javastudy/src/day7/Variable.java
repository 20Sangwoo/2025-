package day7;

import java.util.Arrays;

public class Variable {
  public static void main(String[] args) {
    System.out.println(sum("a",10,20));
    System.out.println(sum("b",10,20,30));
    System.out.println(sum("c",20,30,40));
    System.out.println(sum("d",10,20,30,40,50));
  }

  // 2개의 정수를 입력받아서 합을 구하는 메소드를 정의하시오
//  public static int sum(int num1, int num2) {
//    return num1+ num2;
//  }

  // n개의 정수를 입력받아서 합을 구하는 메소드를 정의하시오
  public static int sum(String str, int... var) {
    int sum = 0;
//    System.out.println(Arrays.toString(var));
    for (int i : var) {
      sum += i;
    }
    return sum;

  }
}
