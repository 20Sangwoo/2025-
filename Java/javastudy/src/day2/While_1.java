package day2;

public class While_1 {
  public static void main(String[] args) {
    method1();
    System.out.println("=======");
    method2();
    System.out.println("=======");
    method3();
  }
  
  public static void method1(){
    int sum = 0;
    for (int i = 1; i <= 10; i = i + 1) {
      sum = sum + i;
    }
    System.out.println("sum = " + sum);
  }
  
  public static void method2(){
    int i = 1;
    int sum = 0;
    while( i <= 10 ){
      sum = sum + i;
      i = i + 1;
    }
    System.out.println("sum = " + sum);
  }

  public static void method3() {
    int i = 1;
    int sum = 0;
    do{
      sum = sum + i;
      i = i + 1;
    }while( i <= 10 );
    System.out.println("sum = " + sum);
  }
}
