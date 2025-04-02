package day5;

public class Array_2 {
  public static void main(String[] args) {
    int[] array;    // 배열 선언
    array = new int[3];   // 정수형 값 3개 저장할 메모리 공간

    for(int i=0; i<array.length; i++) {
      System.out.println(array[i]);
    }

    array[0] = 10;
    array[1] = 20;
    array[2] = 30;

    for(int i=0; i<array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
