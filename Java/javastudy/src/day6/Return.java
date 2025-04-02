package day6;

public class Return {
  public static void main(String[] args) {
//    method1(10);
    method1(-10);
  }

  // 양수값만 입력을 받을수 있다
  public static void method1(int num) {
    if( num < 1){
      return;   // 1. 메소드 종료  2. rturn뒤에 표현식이 오면 평가결과를 반환
    }
    System.out.println("양수입니다.");
  }
}
