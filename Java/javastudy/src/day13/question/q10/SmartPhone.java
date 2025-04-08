package day13.question.q10;

public class SmartPhone extends AbstractPhone{

  public SmartPhone(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void call() {
    System.out.println("Calling from SmartPhone " + brand + " " + model);
  }

  @Override
  public void sendMessage() {
    System.out.println("Sending message from Smartphone " + brand + " " + model);
  }
}
