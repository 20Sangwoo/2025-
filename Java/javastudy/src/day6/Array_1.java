package day6;

public class Array_1 {
  public static void main(String[] args) {
    int x = 10;   // 변수 선언 + 초기화
    System.out.println("x = " + x); 
    
    int[] y = new int[3];  // 배열 선언 + 배열 생성 + 초기화
    System.out.println("y = " + y);

    //일반 for문
    for (int i = 0; i < y.length; i++) {
      System.out.println("y[" + i + "] = " + y[i]);
    }

    //향상된 for문 : 배열 or 컬렉션의 요소를 처음부터 끝까지 순차적으로 탐색할때
    for( int n : y) {
      System.out.println("n = " + n);
    }
      
    
  }
}
