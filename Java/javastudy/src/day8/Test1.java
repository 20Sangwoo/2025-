package day8;
/*
  x,y 값 교환하기
  x = 10 , y = 20
  y = 10 , x = 20
 */
public class Test1 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.printf("%d %d", x, y);
    System.out.println();

    int tmp;
    tmp = x;
    x = y;
    y = tmp;

    System.out.printf("%d %d", x, y);
  }
}
