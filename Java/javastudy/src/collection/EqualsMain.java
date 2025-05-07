package collection;

import java.util.ArrayList;
import java.util.List;

public class EqualsMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동1", 20);
    Person p2 = new Person("홍길동2", 20);

    System.out.println(p1);
    System.out.println(p2);

    if(p1 == p2) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }

    if(p1.equals(p2)) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(persons);

    System.out.println("===");

    Person p3 = new Person("홍길동2" , 30);
    persons.remove(p3);
    System.out.println(persons);
  }
}
