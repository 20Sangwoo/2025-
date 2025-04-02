package day10.question.q1;

import java.util.Scanner;

public class PersonDriver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // (1) "성을 입력하세요 : " 라는 메시지 출력
    System.out.printf("성을 입력하세요 : ");
    // (2) 성을 읽어 lName에 저장
    String lName = sc.nextLine();
    // (3) "이름을 입력하세요 : " 라는 메시지 출력
    System.out.printf("이름을 입력하세요 : ");
    // (4) 이름을 읽어 fName에 저장
    String fName= sc.nextLine();
    // (5) Person 객체를 생성하여 person1이 가리키게 한다
    Person person1 = new Person();
    // (6) person1 객체의 성을 lName으로 한다
    person1.lastName = lName;
    // (7) person1 객체의 이름을 fName으로 한다
    person1.firstName = fName;
    // (8) person1 객체의 성, 이름과 길이를 출력
    System.out.printf("%s %s %d \n", person1.getLastName(),
                      person1.getFirstName(), person1.getLength());
    // (9) "성을 입력하세요" 라는 메시지 출력
    System.out.printf("성을 입력하세요 : ");
    // (10) 성을 읽어 lName에 저장
    lName = sc.nextLine();
    // (11) "이름을 입력하세요 : " 라는 메시지 출력
    System.out.printf("이름을 입력하세요 : ");
    // (12) 이름을 읽어 fName에 저장
    fName = sc.nextLine();
    // (13) Person 객체를 생성하여 person2가 가리키게 한다
    Person person2 = new Person();
    // (14) person2 객체의 성을 lName으로 한다
    person2.lastName = lName;
    // (15) person2 객체의 이름을 fName으로 한다
    person2.firstName = fName;
    // (16) person2 객체의 성, 이름과 길이를 출력
    System.out.printf("%s %s %d \n", person2.getLastName(),
            person2.getFirstName(), person2.getLength());
  }
}
