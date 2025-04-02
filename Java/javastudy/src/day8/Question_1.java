package day8;
/*
  두 정수를 받아서 그합을 반환하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_1 {
  public static int sum(int num1, int num2) {
    return num1 + num2;
  }
  public static void main(String[] args) {
    int result = sum(20,50);
    System.out.println("result = " + result);
  }
}
