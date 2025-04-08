package day12.question.q1;

public class Eagle extends Bird{
  @Override
  void fly() {
    System.out.println("독수리가 날다.");
  }

  @Override
  void sound() {
    System.out.println("삐익~");
  }
}