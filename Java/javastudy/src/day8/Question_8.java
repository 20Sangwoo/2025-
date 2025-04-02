package day8;
/*
  정수형 배열을 매개변수로 받아서 역순으로 재배열해서
  반환하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_8 {
  public static int[] reverseArray(int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while( start < end) {
      int tmp = arr[start];
      arr[start] = arr[end];
      arr[end] = tmp;

      start++;
      end--;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5};
    int[] reverseArry = reverseArray(arr);
    for (int ele : reverseArry) {
      System.out.printf("%d ", ele);
    }
  }
}
