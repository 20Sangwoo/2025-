package day8;
/*
  구구단의 단수를 매개변수로 받아 그 단수의 구구단을
  출력하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_9 {
  public static void gugudan(int dansu){
    System.out.printf("%d단 출력 \n", dansu);
    for (int i = 1; i <= 9 ; i++) {
      System.out.println( dansu + " * " + i + " = " + (dansu * i));
    }
  }
  public static void main(String[] args) {
    gugudan(2);
    gugudan(3);
  }
}
