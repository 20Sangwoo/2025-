package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();

    // 추가
    persons.add(new Person("홍길동", 20));
    persons.add(new Person("홍길서", 30));
    persons.add(new Person("홍길남", 40));
    System.out.println(persons);

    // 요소 갯수
    System.out.println(persons.size());
    
    // 목록 -1
    for (int i = 0; i < persons.size(); i++) {
      Person person = persons.get(i);
      System.out.println(person);
    }
    // 목록 -2
    for (Person person : persons) {
      System.out.println(person);
    }

    System.out.println("===");

    // 수정
    persons.set(1, new Person("홍길순", 20));
    for (Person person : persons) {
      System.out.println(person);
    }

    // 삭제
    persons.remove(1);
    System.out.println("===");
    for (Person person : persons) {
      System.out.println(person);
    }

    Person p1 = new Person("홍길동", 20);
    persons.remove(p1);
    System.out.println("===");
    for (Person person : persons) {
      System.out.println(person);
    }
  }
}
