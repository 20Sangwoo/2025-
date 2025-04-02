package day10.question2.q1;

public class Student {
  private String studentNumber;
  private String name;
  private int testscore1;
  private int testscore2;
  private int testscore3;

  public Student(String studentNumber, String name, int testscore1, int testscore2, int testscore3) {
    this.studentNumber = studentNumber;
    this.name = name;
    this.testscore1 = testscore1;
    this.testscore2 = testscore2;
    this.testscore3 = testscore3;
  }

  public void setScore(int testNumber, int score) {
    switch (testNumber) {
      case 1:
        this.testscore1 = score;
        break;
      case 2:
        this.testscore2 = score;
        break;
      case 3:
        this.testscore3 = score;
        break;

      default:
        System.out.println("해당하는 번호의 과목 없음");
        break;
    }
  }

  public int getScore(int testNumber) {
    int score = 0;
    switch (testNumber) {
      case 1:
        score = this.testscore1;
        break;
      case 2:
        score = this.testscore2;
        break;
      case 3:
        score = this.testscore3;
        break;

      default:
        break;
    }
    return score;
  }

  double getAverage(int score1, int score2, int score3) {
    return (int) Math.round((double)(score1 + score2 + score3) / 3);

  }

  @Override
  public String toString() {
    return studentNumber + " / " + name + " / " + testscore1 + " / " +
            testscore2 + " / " + testscore3 + " / " +
            getAverage(testscore1, testscore2, testscore3);
  }
}
