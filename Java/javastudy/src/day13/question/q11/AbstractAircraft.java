package day13.question.q11;

abstract public class AbstractAircraft implements Aircraft,Vehicle {
  String Manufacture;   // 제조사
  String model;         // 모델

  public AbstractAircraft(String manufacture, String model) {
    this.Manufacture = manufacture;
    this.model = model;
  }
  @Override
  public void fly() {
    System.out.println("Taking Off " + Manufacture + " " + model);
  }

  @Override
  public void fillUp() {
    System.out.println("Taking Off " + Manufacture + " " + model);
  }
}
