package day9.exam1.person;

public class Main {
  public static void main(String[] args) {
  Person person = new Person("홍길동");
  person.smile();
  person.eat();
    System.out.println(person);
    System.out.println(person.getName());
  person.setNickname("안녕");
    System.out.println(person.getNickame());
    
//  Person person2 = new Person("홍길동");
//  person2.smile();
//  person2.eat();
//    System.out.println(person2.age);
//    System.out.println(person2.name);
//
//  Person person3 = new Person("PA", 30);
//  person3.smile();
//  person3.eat();
//    System.out.println(person3.age);
//    System.out.println(person3.name);
//
//  person.age = 20;
//  person.name = "홍길순";
//
//    System.out.println(person.age);
//    System.out.println(person.name);
  }
  }
