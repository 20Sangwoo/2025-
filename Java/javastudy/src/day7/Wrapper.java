package day7;
/*
  Wrapper 클래스 : 문자열을 기본타입으로 변경할때 사용

 */
public class Wrapper {
  public static void main(String[] args) {
    String str = "10";
    String str2 = "20";

    String result = str + str2;
    System.out.println("result = " + result);

    int value = Integer.parseInt(str);
    int value2 = Integer.parseInt(str2);
    int result2 = value + value2;
    System.out.println("result2 = " + result2);

    double v1 = Double.parseDouble(str);
    double v2 = Double.parseDouble(str2);
    double result3 = v1 + v2;
    System.out.println("result3 = " + result3);
    
  }
}
