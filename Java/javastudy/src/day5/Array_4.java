package day5;

public class Array_4 {
  public static void main(String[] args) {
    int[] numbers = new int[]{10, 20, 30, 40, 50}; //  배열 선언 + 값 할당
    System.out.println(numbers.length);

    for(int i=0; i<numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    int[] numbers2 = {10, 20, 30, 40, 50};

    int[] numbers3;
//    numbers3 = {10, 20, 30, 40, 50};    new int[] 생략 불가 = 줄 나눠서 작성시
  }
}
