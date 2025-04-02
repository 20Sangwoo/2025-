package day8;
/*
  정수 배열을 받아서 배열의 모든 요소의 평균을 계산하여
  반환하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_3 {
  public static double average(int[] numbers){
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    double result = (double)sum / numbers.length;
    return result;
  }
  public static void main(String[] args) {
    int[] numbers = {10,20,30};
    double result = average(numbers);
    System.out.println("result = " + result);
  }
}
