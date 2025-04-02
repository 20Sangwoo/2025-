package day5;

public class VariableScope {
  public static void main(String[] args) {
    int x = 10;
    {
      int y = 20;
      System.out.println(x);  // 상위 블럭에서 선언된 변수는 하위 블럭에서 접근 가능

//    double y = 30;   동일한 변수명은 같은 블럭 내 또는 하위 블럭에서 사용 불가
//      int x = 30;
    }
//    System.out.println(y);  하위 블럭에서 선언된 변수는 상위 블럭에서 접근 불가
    int y = 20;
  }
}
