package day2;

public class ForBreak {
  public static void main(String[] args) {
    method1();
    System.out.println("===========");
    method2();
  }

  public static void method1(){
    for (int i = 0; i < 5; i = i + 1) {
      if( i == 3) {
        break; // 가장 가까운 반복문을 빠져나간다.
      }
      System.out.println(i);
    }
  }

  public static void method2(){
    for (int i = 0; i < 5; i++) {
      if (i != 3){
        continue; // 가장 가까운 반복문의 다음 차수로 진행
      }
      System.out.println(i);
    }
  }

}
