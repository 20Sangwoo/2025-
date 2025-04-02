package day8;
/*
  이름을 매개변수로 받아 "안녕하세요, [이름]님!"을
  출력하는 메소드를 작성하시오.
   (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_2 {
  public static void greet(String name){
    System.out.println("안녕하세요, [" + name + "]님!");
  }
  public static void main(String[] args) {
    greet("홍길동");
  }
}
