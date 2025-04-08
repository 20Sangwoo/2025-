package day12.exam4;

public class Main {
  public static void main(String[] args) {
//    System.out.println(Flyable.field);
//    System.out.println(Flyable.field2);

    Plane plane = new Plane();

    Flyable flyable = new Plane();
    flyable.fly();  // 비행하다

    flyable = new Bird();
    flyable.fly(); // 날다

    method(new Plane());
    method(new Bird());
  }

  public static void method(Flyable flyable) {
    flyable.fly();
  }
}