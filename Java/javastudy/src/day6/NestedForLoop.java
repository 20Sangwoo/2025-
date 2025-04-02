package day6;

import common.util.MyUtil;

/*
  중첩된 반복문을 빠져나오는 방법?  3가지..
  1. flag
  2. return
  3. label
 */
public class NestedForLoop {
  public static void main(String[] args) {
    MyUtil myUtil = new MyUtil();

    method1();  // flag
    myUtil.printLine('*', 20);

    method2();  // return
    myUtil.printLine('*', 20);

    method3();  // label

  }

  private static void method1() {
    boolean flag = false;
    // outer
    for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);

      // inner
      for (int j = 0; j < 3; j++) {
        // j = 1일때 outer for문을 빠져나오게하려면?
        if( j == 1 ){
          flag = true;
          break;
        }
        System.out.printf("i = %d, j = %d \n", i, j);

      }

      if(flag) {
        break;
      }

    }
  }

  private static void method2() {

    // outer
    for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);

      // inner
      for (int j = 0; j < 3; j++) {
        // j = 1일때 outer for문을 빠져나오게하려면?
        if( j == 1 ){
          return;
        }
        System.out.printf("i = %d, j = %d \n", i, j);

      }

    }
  }

  private static void method3() {

    // outer
    outer : // 라벨명
    for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);

      // inner
      inner :
      for (int j = 0; j < 3; j++) {
        // j = 1일때 outer for문을 빠져나오게하려면?
        if( j == 1 ){
          break outer;
        }
        System.out.printf("i = %d, j = %d \n", i, j);

      }
    }
  }
}
