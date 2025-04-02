package day10.question.q5;

public class Rectangle {
  double length;
  double width;

  double calculateArea() {
    return length * width;
  }

  double calculatePerimeter() {
    return (length + width) * 2;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }
}
