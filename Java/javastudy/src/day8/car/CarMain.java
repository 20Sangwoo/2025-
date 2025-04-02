package day8.car;

public class CarMain {
  public static void main(String[] args) {
    Car car = new Car();
    car.displayInfo();

    car.make = "현대";
    car.model = "그랜저";
    car.year = 2025;
    car.color = "검정";
    car.displayInfo();

    car.accelerate(10);
    int speed = car.getSpeed();
    car.displayInfo();

    car.accelerate(10);
    car.displayInfo();

    car.brake(5);
    car.displayInfo();
  }
}
