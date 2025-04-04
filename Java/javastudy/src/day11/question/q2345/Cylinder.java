package day11.question.q2345;

public class Cylinder extends Circle {
  private double height;  // 원기둥의 높이

  // Cylinder 객체를 기본 값(x_coordinate = y_coordinate = radius = height= 0)으로 초기화한다.
  public Cylinder() {
    super();
    height = 0.0;
  }

  // Cylinder 객체를 아래 원을 주어진 중심의 x 좌표 값과 y 좌표 값과 특정 반지름 값으로 초기화하고
  // 원기둥의 높이를 주어진 값으로 초기화한다.
  public Cylinder(double x, double y, double z, double h) {
    super(x, y, z);
    height = h;
  }

  // 원기둥의 높이를 반환한다.
  public double getHeight() {
    return height;
  }

  // 원기둥의 표면적을 계산한다.
  public double calculateSurfaceArea() {
    return 2.0 * Math.PI * super.getRadius() * height + super.getArea() * 2;
  }

  // 원기둥의 부피를 계산한다.
  public double calculateVolume() {
    return super.getArea() * height;
  }

  // 원기둥의 현 상태를 출력한다.
  public void printCylinder() {
    super.printCircle();
    System.out.println("원기둥의 높이 = " + height);
  }

}