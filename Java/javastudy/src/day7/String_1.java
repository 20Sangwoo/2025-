package day7;
/*
    "문자열" : 힙메모리에 동일한 문자열이 있으면 신규로 생성하지 않음
    new String("문자열") : 힙메모리에 문자열을 무조건 새로이 생성
 */
public class String_1 {
  public static void main(String[] args) {
    String name = "홍길동";
    String name2 = new String("홍길동");

    System.out.println(name);
    System.out.println(System.identityHashCode(name));
    System.out.println(System.identityHashCode(name2));

    String name3 = "홍길동";
    String name4 = new String("홍길동");
    System.out.println(System.identityHashCode(name3));
    System.out.println(System.identityHashCode(name4));

    // 참조 타입 변수에서 == 는 주소값 비교
    if(name == name2) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    if(name == name3) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    if(name2 == name4) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    //문자열 비교시에는 String.equals()
    if (name.equals(name2)) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    if (name.equals(name4)) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

  }
}
