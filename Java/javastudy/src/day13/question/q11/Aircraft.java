package day13.question.q11;

public interface Aircraft extends Flyable, Fuelable {
  void takeOff();   // 이륙
  void land();      // 착륙
}
