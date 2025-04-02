package day7;
/*
  기본타입의 값을 문자열로 변경하기
  1. String.valueOf()
  2. + "" : 빈문자열로 더해주기
 */
public class String_2 {
  public static void main(String[] args) {
    int x = 10;

    String str = x + "";   // "10"
    String str2 = String.valueOf(x);  // "10"

    System.out.println( str + "," + str2);

    String str3 = str + str2;
    System.out.println(str3);
  }
}
