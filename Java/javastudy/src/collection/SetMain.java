package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길서", 30);
    Person p3 = new Person("홍길남", 40);
    Person p4 = new Person("홍길남", 40);

    Set<Person> persons = new HashSet<>();

    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);

//    요소 순회
    for (Person person : persons) {
      person.smile();
    }
    
    System.out.println(persons);
    System.out.println(persons.contains(p1));
    System.out.println(persons.isEmpty());
    System.out.println(persons.size());
    System.out.println(persons.remove(p1));
    System.out.println(persons.size());
    
//    모든 요소 제거
    persons.clear();
    System.out.println(persons.size());
    System.out.println(persons.isEmpty());

  }
}