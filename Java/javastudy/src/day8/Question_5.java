package day8;
/*
  재귀 메소드 : 자기 자신을 호출하는 메소드
  팩토리얼을 계산하는 재귀 메소드를 작성하시오.
 */
public class Question_5 {
  public static int factorial(int num){
    if( num <= 1) return 1;
    return num * factorial(  num-1);
  }

  public static void main(String[] args) {
    int result = factorial(3);
    System.out.println("result = " + result);
  }
}
