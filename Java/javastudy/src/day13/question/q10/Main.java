package day13.question.q10;

public class Main {
  public static void main(String[] args) {
    Phone[] phones = new Phone[2];
    phones[0] = new SmartPhone("Samsung", "Galaxy S25");
    phones[1] = new FeaturePhone("Apple", "Iphone 16");

    for (Phone phone : phones) {
      phone.call();
      phone.sendMessage();
    }
  }
}
