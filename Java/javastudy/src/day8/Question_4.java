package day8;
/*
  메소드 오버로딩(메소드 다중정의) : 메소드 이름은 같고 매개변수가 다른(매개변수의 갯수, 매개변수의 타입) 메소드
  같은 이름의 메소드를 오버로딩하여 정수 두 개 또는 실수 두 개를
  받아 곱한 결과를 반환하는 메소드를 작성하시오.
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
 */
public class Question_4 {
  public static int multiply(int num1, int num2){
    System.out.println("multiply(int num1, int num2) 호출됨");
    return num1 * num2;
  }
  public static double multiply(double num1, double num2){
    System.out.println("multiply(double num1, double num2) 호출됨");
    return num1 * num2;
  }

  public static void main(String[] args) {
    int result = multiply(10,20);
    System.out.println("result = " + result);

    double result2 = multiply(10.5,20);
    System.out.println("result2 = " + result2);
  }
}
