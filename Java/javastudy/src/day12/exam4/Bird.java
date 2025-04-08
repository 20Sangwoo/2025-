package day12.exam4;

public class Bird extends Animal implements Flyable,Landable{
  @Override
  public void land() {
    System.out.println("땅에 내려 앉다.");
  }

  @Override
  public void fly(){
    System.out.println("날다");
  }
  void sing(){
    System.out.println("소리내다");
  }
}