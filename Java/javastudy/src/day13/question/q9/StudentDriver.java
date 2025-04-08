package day13.question.q9;

import java.util.Scanner;

public class StudentDriver {
  public static void main(String[] args) {
    Scanner scan;              // Scanner 객체의 참조변수
    Student[] roster;         // 학생들의 배열
    final int maxnumber = 20; // 최대 수강생수 ( =20 )
    int number;               // 실제 수강생수
    String name;              // 입력받은 이름
    int score;                // 입력받은 점수
    int level;                // 학생의 수준 (1:대학생, 2:대학원생)
    String flag;              // 계속여부

    roster = new Student[maxnumber];
    number = 0;
    scan = new Scanner(System.in);

    do {
      System.out.printf("학생의 수준 (1:대학생, 2:대학원생) : "); // 1 + "enter"
      level = scan.nextInt(); // 1
      scan.nextLine();        // "enter"

      System.out.printf("학생의 이름 : ");
      name = scan.nextLine();

      if (level == 1) {
        roster[number] = new UndergraduateStudent(name);
      } else if (level == 2) {
        roster[number] = new GraduateStudent(name);
      }

      System.out.printf("학생의 점수 : ");
      score = scan.nextInt();  // 90 + "enter"
      scan.nextLine();
      roster[number].setScore(score);

      roster[number].computeGrade();
      number++;

      System.out.printf("학생이 더 있는가 ?(예/아니오) ");
      flag = scan.nextLine();
    }while(flag.equals("예") && number < maxnumber);

    // 학생 정보 출력
    for (Student student : roster) {
      if(student != null ) {
        System.out.printf("학생명:%s, 점수:%d, 학점:%c \n",
                student.getName(), student.getScore(), student.getGrade());
      }
    }
  }
}