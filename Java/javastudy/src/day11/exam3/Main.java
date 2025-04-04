package day11.exam3;

import day9.access.pack2.C;

/*
  Car 객체를 생성하고 생성할 때마다 일련 번호를 부여하는 코드를 작성하시오
  단, Car 객체는 일련 번호를 멤버로 갖고 있어야한다.
  car1 : 1
  car2 : 2
  car3 : 3
 */
public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println(car1.toString());
    Car car2 = new Car();
    System.out.println(car2.toString());
    Car car3 = new Car();
    System.out.println(car3.toString());
  }
}
