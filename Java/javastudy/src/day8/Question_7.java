package day8;
/*
  문자열과 문자를 매개변수로 받아 문자열에서
  해당 문자의 개수를 세어 반환하는 메소드를 작성하시오
  (단, 메소드의 실행결과는 main메소드에서 확인하시오)
  ex) "apply", 'p' => 2
 */
public class Question_7 {
  public static int countOfChar(String str, char ch) {
    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if( str.charAt(i) == ch){
        cnt++;
      }
    }
    return cnt;
  }
  public static void main(String[] args) {
    int cnt = countOfChar("school", 's');
    System.out.println("cnt = " + cnt);
  }
}
