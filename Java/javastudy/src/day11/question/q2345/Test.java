package day11.question.q2345;
//Point, Circle, Cylinder 겍체를 만들어 시험한다

public class Test {
  public static void main(String[] args) {
    Point p = new Point(7.2, 11.5);
    Circle cir = new Circle(3.7, 4.3, 2.5);
    Cylinder cyl = new Cylinder(1.2, 2.3, 2.5, 5.7);

    System.out.print("점: ");
    p.printPoint();

    cir.printCircle();
    System.out.print("원의 면적 = ");
    System.out.println(cir.getArea());

    cyl.printCylinder();
    System.out.print("원기둥의 표면적 = ");
    System.out.println(cyl.calculateSurfaceArea());
    System.out.print("원기둥의 부피 = ");
    System.out.println(cyl.calculateVolume());
  }
}