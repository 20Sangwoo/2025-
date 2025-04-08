package day12.question.q1;

public class Dog extends Mammal{
  @Override
  void giveBith() {
    System.out.println("멍멍이 새끼를 낳다.");
  }

  @Override
  void sound() {
    System.out.println("멍멍!");
  }
}