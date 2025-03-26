package day3;

public class Operator_4 {
  public static void main(String[] args) {
    int number = 10;
    if(number % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  // 위와 동일
    System.out.println((number % 2 == 0) ? "짝수" :  "홀수");

    String result = (number % 2 == 0) ? "짝수" : "홀수";
    System.out.println("result = " + result);

  }
}
