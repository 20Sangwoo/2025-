package day9.exam3;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.eat();
    System.out.println("========================");

    Student student = new Student();
    student.eat();
    student.study();
    System.out.println("========================");

    HighStudent highStudent = new HighStudent();
    highStudent.eat();
    highStudent.study();
    highStudent.examEntrance();
  }
}
