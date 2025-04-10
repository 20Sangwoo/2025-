package day10.question.q5;

public class RectangleDriver {
  public static void main(String[] args) {
//    (1) Rectangle 객체를 만들어 rec가 가리키게 한다.
    Rectangle rec = new Rectangle();
//    (2) rec의 가로를 3.0으로 변경한다.
    rec.setWidth(3.0);
//    (3) rec의 세로를 5.0으로 변경한다.
    rec.setLength(5.0);
//    (4) rec의 면적을 구하여 area에 저장한다.
    double area = rec.calculateArea();
//    (5) rec의 둘레를 구하여 perm에 저장한다.
    double perm = rec.calculatePerimeter();
//    (6) rec의 가로, 세로, area와 perm을 출력한다.
    System.out.printf("%.1f %.1f %.1f %.1f", rec.getWidth(), rec.getLength(), area, perm);
  }
}
