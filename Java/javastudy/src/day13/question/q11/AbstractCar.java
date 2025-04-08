package day13.question.q11;

abstract public class AbstractCar implements Vehicle, Fuelable{
  protected String brand;
  protected String model;
  protected static int numberOfWheels = 4;

  public AbstractCar(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  abstract public void start();

  @Override
  public void stop() {
    System.out.println("Stopping " + brand + " " + model);
  }

  @Override
  public void fillUp() {
    System.out.println("Filling Up " + brand + " " + model);
  }
}
