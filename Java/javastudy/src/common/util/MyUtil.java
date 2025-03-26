package common.util;

public class MyUtil {
  // 구분선을 출력하는 메서드
  public void printLine(char c, int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(c);
    }
    System.out.println();
  }
}