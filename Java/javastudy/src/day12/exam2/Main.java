package day12.exam2;

public class Main {
  public static void main(String[] args) {
    final int x;
    x = 10;
//    x = 20;  재할당(X)

//    Final f = new Final(10);
//    f.x = 20;  //재할당(X)

    Final f2 = new Final();
    Final f3 = new Final();

//      f2.y = 30;

    System.out.println(Final.x);
  }
}