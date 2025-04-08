package day12.question.q1;

public class Dolphin extends Mammal implements Aquatic{
  @Override
  public void dive() {
    System.out.println("수중활동하다.");
  }

  @Override
  void giveBith() {
    System.out.println("새끼 돌고래를 낳다");
  }

  @Override
  void sound() {
    System.out.println("초음파를 내다");
  }

  @Override
  public void swim() {
    System.out.println("수영하다.");
  }
}