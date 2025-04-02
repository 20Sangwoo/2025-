package day8.car;

public class Main {
  public static void main(String[] args) {
    // car객체 생성
    Car car = new Car("현대","그랜저",2025,"검정");
    car.displayInfo();

    // driver 객체 생성
    Driver driver = new Driver();
    driver.displayInfo();

    // 자동차 운전 시작
    driver.drive(car);
    car.displayInfo();

    // 자동차 멈추기
    driver.stop(car);
    car.displayInfo();
  }
}
