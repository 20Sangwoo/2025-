package day13.question.q11;

public class SUV extends AbstractCar {

  public SUV(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void start() {
    System.out.println("Starting SUV " + brand + " " + model);
  }

  @Override
  public void stop() {
    System.out.println("Stopping SUV " + brand + " " + model);
  }

  @Override
  public void fillUp() {
    System.out.println("Filling Up SUV " + brand + " " + model);
  }
}
