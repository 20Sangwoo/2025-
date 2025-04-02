package day10.question.q9;

public class StudentDriver {
  public static void main(String[] args) {
//    1. Student 객체를 생성하여 student1이 가리키게 한다.
    Student student1 = new Student();
//    2. 객체 student1의 이름을 ‘갑돌’로 변경한다.
    student1.setName("갑돌");
//    3. 객체 student1의 학번을 100으로 변경한다.
    student1.setNumber("100");
//    4. 객체 student1의 소속학과를 컴퓨터공학과로 변경한다.
    student1.setDepartment("컴퓨터공학과");
//    5. 객체 student1의 이름, 학번과 소속학과를 출력한다.
    System.out.printf(student1.toString());
    System.out.println();
//    6. Student 객체를 생성하여 student2가 가리키게 한다.
    Student student2 = new Student();
//    7. 객체 student2의 이름을 ‘갑순’으로 변경한다.
    student2.setName("갑순");
//    8. 객체 student2의 학번을 200으로 변경한다.
    student2.setNumber("200");
//    9. 객체 student2의 소속학과를 건축학과로 변경한다.
    student2.setDepartment("건축학과");
//    10. 객체 student2의 이름, 학번과 소속학과를 출력한다.
    System.out.printf(student2.toString());
    System.out.println();
//    11. 객체 student2의 소속학과를 수학과로 변경한다.
    student2.setDepartment("수학과");
//    12. 객체 student2의 이름, 학번과 소속학과를 출력한다.
    System.out.printf(student2.toString());
    System.out.println();
  }
}
