package day10.question.q1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    String firstName = person.getFirstName();
    System.out.println("firstName = " + firstName);

    System.out.println(person.getLastName());
    System.out.println(person.getLength());

    Person person2 = new Person();
    Person person3 = new Person();

    System.out.println(person2.getFirstName());
    System.out.println(person3.getFirstName());
  }
}
