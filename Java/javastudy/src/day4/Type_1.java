package day4;

public class Type_1 {
  public static void main(String[] args) {
    byte value = -128;
    value = 127;
    value++; // value = value + 1
    System.out.println("value = " + value);  // -128

    
    int value2 = value + 1;
    System.out.println("value2 = " + value2);
    
    
    char ch = 'a';
    System.out.println("ch = " + ch);
    
    char ch2 = 97; // unicode 97 => 'a'
    System.out.println("ch2 = " + ch2);

    char ch3 = 0;
    System.out.println("ch2 = " + ch3);

//    char ch4 = -1;  char 타입은 음수를 가질수 없다.

    int value3 = 10;
    long value4 = 10L;

    double value5 = 3.14;
    float value6 = 3.14f;
    double value7 = 3.14f;
//    float value8 = 3.14; double타입의 값을 float타입의 변수에 저장불가

    float value9 = (float)3.14;


    //문자열
    String name = "홍길동";
    String name2 = new String("홍길동");
    String name3 = "홍길동";

    //문자열 비교 == (수치비교 or 주소값비교)
    if ( name == name2){
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }

    if ( name == name3){
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }

    //문자열 비교 equals()
    if ( name.equals(name2)){
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }
    if ( name.equals(name3)){
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }

  }
}
