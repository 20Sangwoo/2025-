package day1;

public class If_1 {
  public static void main(String[] args) {
    int x = 10;
    double pi = 3.14;
    String name = "";
    char a = ' ';
    boolean flag = true;

    if(x % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }

    int score = 55;
    if(score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
