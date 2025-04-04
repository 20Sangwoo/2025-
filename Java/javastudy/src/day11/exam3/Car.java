package day11.exam3;
/*
  static field :  동일 타입의 객체가 공유하는 변수
 */

public class Car {
  static int serial = 0;

  public Car() {
    this.serial++;
  }

  @Override
  public String toString() {
    return "Car" + serial + " : " + serial;
  }
}
