package day13.question.q9;

class UndergraduateStudent extends Student{

  public UndergraduateStudent(String name) {
    super(name); // 부모생성자 호출
  }

  @Override
  public void computeGrade() {
    switch (getScore() / 10) {
      case 10 :
      case 9 :
        grade = 'A';
        break;
      case 8 :
        grade = 'B';
        break;
      case 7 :
        grade = 'C';
        break;
      case 6 :
        grade = 'D';
        break;
      default:
        grade = 'F';
    }
  }
}