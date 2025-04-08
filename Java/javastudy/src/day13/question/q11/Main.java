package day13.question.q11;

public class Main {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[2];
    vehicles[0] = new Sedan("Audi", "A6");
    vehicles[1] = new SUV("Genesis", "GV80");

    for (Vehicle vehicle : vehicles) {
      vehicle.start();
      vehicle.stop();
    }

    System.out.println("Max speed of Vehicles : " + Vehicle.MAX_SPEED);
    System.out.println("Number of wheels in a car : " + AbstractCar.numberOfWheels);
  }
}
