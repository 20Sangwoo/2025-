package day8.person2;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.name);
    System.out.println(person.age);

    Person person2 = new Person("홍길동");
    System.out.println(person2.name);
    System.out.println(person2.age);

    Person person3 = new Person("홍길서",20);
    System.out.println(person3.name);
    System.out.println(person3.age);

    person.eat();
    person2.eat();
    person3.eat();
  }
}
