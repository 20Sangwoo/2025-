package day7;

public class StringMethod4 {
  public static void main(String[] args) {
    String tel = "010-1234-5678";
    String[] split = tel.split("-");

    for (String s : split) {
      System.out.println("s = " + s);
    }
  }
}
