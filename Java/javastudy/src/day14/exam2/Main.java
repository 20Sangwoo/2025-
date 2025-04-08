package day14.exam2;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    double y = x;
    int z = (int)y;

    Person person = new HighStudent();
    person.eat();
    person.smile();
    person.walk();

    Student student = (Student) person;
    student.eat();
    student.smile();
    student.study();
    student.walk();

    HighStudent highStudent = (HighStudent) student;
    highStudent.eat();
    highStudent.smile();
    highStudent.study();
    highStudent.taekTheEntranceExam();
    highStudent.walk();

    student = highStudent;
    student.study();

    Walkable walkable = person;
    walkable.walk();

    System.out.println("==");
    Walkable walkableStudent = new Student();
    System.out.println(walkableStudent instanceof Walkable);
    System.out.println(walkableStudent instanceof Person);
    System.out.println(walkableStudent instanceof Student);
    System.out.println(walkableStudent instanceof HighStudent);
    System.out.println(walkableStudent instanceof Object);

    method(person);           // 실체 : HighStudent
    method(walkableStudent);  // 실체 : Student
  }

  private static void method(Walkable walkable) {
    walkable.walk();

    // 객체의 타입
    if (walkable instanceof HighStudent) {
      HighStudent highStudent = (HighStudent) walkable;
      highStudent.taekTheEntranceExam();
    }
  }
}
