package day2;
/*
  문) 1~10 사이의 정수중 짝수의 합과 홀수의 합을 각각 구하는 프로그램을 구현하시오.(for문 사용)
 */
public class Question_8 {
  public static void main(String[] args) {
    int even = 0; // 짝수 누적 변수
    int odd = 0;  // 홀수 누적 변수
    for (int i = 1; i <= 10 ; i = i + 1) {
//      System.out.println(i);
      if( i % 2 == 0){
        even = even + i;
//        System.out.println("짝수=" + i);
      }else {
        odd = odd + i;
//        System.out.println("홀수=" + i);
      }
    }
    System.out.println("1~10 사이의 짝수의 합 = " + even);
    System.out.println("1~10 사이의 홀수의 합 = " + odd);
  }
}
