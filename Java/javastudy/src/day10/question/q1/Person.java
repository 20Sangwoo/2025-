package day10.question.q1;

public class Person {
  String lastName;
  String firstName;

  public Person() {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getLength() {
    return lastName.length() + firstName.length();
  }
}
