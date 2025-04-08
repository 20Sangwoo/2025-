package day13.question.q9;

public abstract class Student {
  protected String name;    //이름
  protected int score;      //점수
  protected char grade;     //학점

  protected Student(){
    super();
  }

  protected Student(String name) {
    this.name = name;
  }

  public abstract void computeGrade();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public char getGrade() {
    return grade;
  }
}