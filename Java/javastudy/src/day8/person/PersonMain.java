package day8.person;

public class PersonMain {
  public static void main(String[] args) {
    Person person = new Person(); //인스턴스화(=객체화)

    person.eat();
    person.smile();

    person.name = "홍길동";
    person.age = 20;

    System.out.println(person.name);
    System.out.println(person.age);

    Person[] persons = new Person[3];
    persons[0] = new Person();
    persons[1] = new Person();
    persons[2] = new Person();

    persons[0].name = "홍길동";
    persons[0].age = 20;

    persons[1].name = "홍길서";
    persons[1].age = 30;

    persons[2].name = "홍길남";
    persons[2].age = 40;

    persons[0].smile();
    persons[1].smile();
    persons[2].smile();

  }
}
