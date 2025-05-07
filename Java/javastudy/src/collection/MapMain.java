package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길서", 30);
    Person p3 = new Person("홍길남", 40);
    Person p4 = new Person("홍길북", 50);

    Map<String, Person> persons = new HashMap<>();
    persons.put("key1", p1);
    persons.put("key2", p2);
    persons.put("key3", p3);
    System.out.println(persons);

    System.out.println(persons.containsKey("key3"));
    System.out.println(persons.containsKey("key4"));

    System.out.println(persons.containsValue(p1));
    Set<Map.Entry<String, Person>> entries = persons.entrySet();
    for (Map.Entry<String, Person> entry : entries) {
      String key = entry.getKey();
      Person value = entry.getValue();
      System.out.println(key);
      System.out.println(value);
    }

    Person person = persons.get("key1");
    System.out.println(person);

    Set<String> strings = persons.keySet();
    for (String string : strings) {
      System.out.println(string);
    }

    Collection<Person> values = persons.values();
    for (Person value : values) {
      System.out.println(value);
    }

    System.out.println(persons.size());
    persons.remove("key3");
    System.out.println(persons.size());
  }
}
