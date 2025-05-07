package collection;
import java.lang.*;
import java.util.Objects;

public class Person extends Object {
  private String name;
  private int age;

//  public Person() {
//    super();
//  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void smile() {
    System.out.println("웃다");
  }

  public void eat() {
    System.out.println("먹다");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
