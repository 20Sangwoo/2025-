package day11.question.q2345;

//   2차원 공간의 점을 나타낸다
public class Point {
  protected double x_coordinate;  // 점의 x 좌표
  protected double y_coordinate;  // 점의 y 좌표

  // Point 객체를 기본 값(x_coordinate = y_coordinate = 0)으로 초기화한다.
  public Point() {
    setX(0);
    setY(0);
  }

  // Point 객체를 특정 x 좌표 값과 특정 y 좌표 값으로 초기화한다.
  public Point(double xval, double yval) {
    setX(xval);
    setY(yval);
  }

  // 현 Point 객체의 x 좌표를 반환한다.
  public double getX() {
    return x_coordinate;
  }

  // 현 Point 객체의 y 좌표를 반환한다
  public double getY() {
    return y_coordinate;
  }

  // 현 Point 객체의 x 좌표를 주어진 값으로 변경한다.
  public void setX(double xval) {
    x_coordinate = xval;
  }

  // 현 Point 객체의 y 좌표를 주어진 값으로 변경한다.
  public void setY(double yval) {
    y_coordinate = yval;
  }

  // 현 Point 객체의 좌표 = [x, y]의 형태로 출력한다.
  public void printPoint() {
    System.out.println("좌표 = " + "[" + x_coordinate + ", " + y_coordinate + "]");
  }
}