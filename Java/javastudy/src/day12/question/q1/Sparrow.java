package day12.question.q1;

public class Sparrow extends Bird{
  @Override
  void fly() {
    System.out.println("참새가 날다");
  }

  @Override
  void sound() {
    System.out.println("짹짹~");
  }
}