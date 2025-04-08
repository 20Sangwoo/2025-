package day12.exam4;

public class Plane implements FlyableAndLandable{
  @Override
  public void land() {
    System.out.println("착륙하다.");
  }

  @Override
  public void fly() {
    System.out.println("비행하다");
  }

  void fillOil(){
    System.out.println("주유하다");
  }
}