package day8;
/*
  정수 배열의 최대값을 반환하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_6 {
  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] arr = {30, 20, 40};
    int max = max(arr);
    System.out.println("max = " + max);
  }
}
