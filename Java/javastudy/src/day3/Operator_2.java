package day3;
/*
  논리연산자(4) : &&, ||, !, ^
 */
public class Operator_2 {
  public static void main(String[] args) {
    boolean result = 10 > 5;
    System.out.println("result = " + result);

    System.out.println(10 > 5);   // true
    System.out.println(10 < 5);   // false

    System.out.println("===========================");
    // && (그리고) : 피연산자가 모두 true일 때 나머지는 false
    System.out.println( true && true);    //true
    System.out.println( true && false);
    System.out.println( false && true);
    System.out.println( false && false);
    System.out.println("===========================");
    // || (또는) : 피연산자가 하나라도 true일 때 나머지는 false
    System.out.println( true || true );   //true
    System.out.println( true || false );  //true
    System.out.println( false || true );  //true
    System.out.println( false || false );
    System.out.println("===========================");
    //  ! (부정)  : 피연산자가 false 일 때 true
    System.out.println(!true);
    System.out.println(!false);   // ture
    System.out.println(!!true);   // 부정의 부정은 자신
    System.out.println("===========================");
    //  ^ (베타적 논리합) : 피연산자가 서로 다를 때 true, 나머지 false
    System.out.println( true ^ true );
    System.out.println( true ^ false );
    System.out.println( false ^ true );   // true
    System.out.println( false ^ false );  // true
  }
}
