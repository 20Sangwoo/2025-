package collection;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길순", 30);
    Person p3 = new Person("홍길남", 40);

    p1.eat();
    p1.smile();
    System.out.println(p1);

    p2.eat();
    p2.smile();
    System.out.println(p2);

    Person[] persons = new Person[2];
    persons[0] = p1;
    persons[1] = p2;

    for (Person person : persons) {
      System.out.println(person);
    }

  }
}
