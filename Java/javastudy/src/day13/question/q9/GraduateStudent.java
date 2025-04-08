package day13.question.q9;

public class GraduateStudent extends Student{

  public GraduateStudent(String name) {
    super(name);
  }

  @Override
  public void computeGrade() {
    switch (getScore() / 10) {
      case 10 :
      case 9 :
      case 8 :
        grade = 'A';
        break;
      case 7 :
        grade = 'B';
        break;
      case 6 :
        grade = 'C';
        break;
      case 5 :
        grade = 'D';
        break;
      default:
        grade = 'F';
    }
  }
}