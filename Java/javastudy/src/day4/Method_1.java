package day4;

import java.util.Random;

public class Method_1 {
  //1. 반환타입(x), 매개변수(x)
  public static void doSomething(){
    System.out.println("작업 수행");
  }
  //2. 반환타입(x), 매개변수(O)
  public static void printMessage( String message){
    System.out.println(message);
  }
  //3. 반환타입(O), 매개변수(X)
  public static int getRandomNumber() {
    Random random = new Random();
    int number = random.nextInt();
    return number;
  }
  //4. 반환타입(O), 매개변수(O)
  public static int sum(int num1, int num2){
    int sum = 0;
    sum = num1 + num2;
    return sum;
  }

  public static void main(String[] args) {
    doSomething(); //메소드 호출

    String msg = "hi~";
    String name = "홍길동";

    printMessage("hi~"); // 표현식 : 리터럴(값)
    printMessage(msg);   // 표현식 : 변수
    printMessage(msg + name); // 표현식 : 연산식
    printMessage("result = " + sum(10,20) ); // 표현식 : 메소드 호출()

    int number = getRandomNumber() + 10;
    System.out.println("number = " + number);

    System.out.println("프로그램 종료!");
  }
}
