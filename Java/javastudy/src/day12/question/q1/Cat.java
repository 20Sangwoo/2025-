package day12.question.q1;

public class Cat extends Mammal{
  @Override
  void giveBith() {
    System.out.println(" 고양이 새끼를 낳다");
  }

  @Override
  void sound() {
    System.out.println("야옹!");
  }
}