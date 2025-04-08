package day13.anonymous2;

public class Main {
  public static void main(String[] args) {
    AbstractFly abstractFly = new Fly();
    abstractFly.fly();

    AbstractFly abstractFly2 = new Fly();
    abstractFly2.fly();

    System.out.println("==");
    
//    익명 클래스
    AbstractFly abstractFly3 = new AbstractFly() {
      @Override
      void fly() {
        System.out.println("날다.");
      }
    };
    abstractFly3.fly();

    AbstractFly abstractFly4 = new AbstractFly() {
      @Override
      void fly() {
        System.out.println("날다.");
      }
    };
    abstractFly4.fly();
  }
}
