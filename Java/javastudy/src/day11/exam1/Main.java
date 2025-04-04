package day11.exam1;

public class Main {
  public static void main(String[] args) {
    int sum, multi;
    int x, y;

    x = Integer.parseInt(args[0]);
    y = Integer.parseInt(args[1]);

    Exam ob1 = new Exam();
    Exam ob2 = new Exam();

    sum = ob1.add(x, y);
    multi = ob2.multi(x, y);

    System.out.println("sum = " + sum);
    System.out.println("multi = " + multi);
  }
}
