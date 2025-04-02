package day8.car;

public class Car {
  // 필드(속성) : 명사
  String make; // 제조사
  String model; //모델
  int year;    //년도
  String color; //색상
  int speed;  //현재 속도

  //디폴트 생성자 메소드
  Car() {
    super();
  }
  Car(String make, String model, int year, String color){
    super();
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  // 행위, 역할, 동작
  // 속도 증가
  void accelerate(int increment) {
    speed += increment;
  }
  // 속도 감소
  void brake(int increment) {
    speed -= increment;
  }

  // 현재속도 반환
  int getSpeed(){
    return speed;
  }

  // 자동차의 정보를 출력
  void displayInfo(){
    System.out.println("제조사 : " + make);
    System.out.println("모델 : " + model);
    System.out.println("연도 : " + year);
    System.out.println("색상 : " + color);
    System.out.println("현재 속도 : " + speed);
  }

}
