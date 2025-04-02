package day10.question.q3;

public class Circle {
  double radius;

  double getRadius() {
    return radius;
  }

  double computeArea() {
   return 3.14 * (radius*radius);
  }

  double computePerimeter() {
    return 2 * 3.14 * radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
