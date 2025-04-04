package day11.question.q2345;

//   2차원 공간의 원을 나타낸다
public class Circle extends Point {
  double radius;  // 반지름

  // Circle 객체를 기본 값(x_coordinate = y_coordinate = radius = 0)으로 초기화한다.
  public Circle() {
    super(0.0, 0.0); // 이것은 없어도 된다.
    radius = 0.0;
  }

  // Circle 객체를 주어진 중심의 x 좌표 값과 y 좌표 값과 특정 반지름 값으로 초기화한다.
  public Circle(double xval, double yval, double radius) {
    super(xval, yval);
    this.radius = radius;
  }

  // 현 Circle 객체의 반지름을 반환한다.
  public double getRadius() {
    return radius;
  }

  // 면적을 계산한다.
  public double getArea() {
    return Math.PI * getRadius() * getRadius();
  }

  // 원의 중심과 반지름을 출력한다.
  public void printCircle() {
    System.out.println("원의 중심 = [" + getX() + ", " + getY() + "], 반지름 = " + getRadius());
  }

}