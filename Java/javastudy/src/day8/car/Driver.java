package day8.car;

public class Driver {
  String name; //운전자 이름
  int age; //나이

  // 운전하다
  void drive(Car car) {
    car.accelerate(30);
  }

  // 멈추다.
  void stop(Car car) {
    car.brake(30);
  }

  void displayInfo(){
    System.out.println("운전자 이름 : " + name);
    System.out.println("운전자 나이 : " + age);
  }
}
