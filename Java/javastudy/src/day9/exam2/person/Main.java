package day9.exam2.person;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("홍길동", 30);
    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getNickname());

    person.setNickname("별칭1");
    System.out.println(person.getNickname());
  }
}
