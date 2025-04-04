package day11.question.q11;

public class ComplexDriver {
  public static void main(String[] args) {
//    1. 2 + 3i 를 나타내는 복소수 객체 x 를 생성한다.
    Complex x = new Complex(2, 3);
//    2. -3 + 7i 를 나타내는 복소수 객체 y 를 생성한다.
    Complex y = new Complex(-3, 7);
//    3. z = x – y
    Complex z = x.subtract(y);
//    4. x, y, z 를 출력한다
    System.out.print("x = ");
    x.print();

    System.out.print("y = ");
    y.print();

    System.out.print("z = ");
    z.print();
  }
}
