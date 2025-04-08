package day13.question.q11;

public class Sedan extends AbstractCar {

  public Sedan(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void start() {
    System.out.println("Starting Sedan " + brand + " " + model);
  }

  @Override
  public void stop() {
    System.out.println("Stopping Sedan " + brand + " " + model);
  }

  @Override
  public void fillUp() {
    System.out.println("Filling Up Sedan " + brand + " " + model);
  }
}
