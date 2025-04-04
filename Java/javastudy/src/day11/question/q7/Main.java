package day11.question.q7;

import day9.access.pack2.C;

public class Main {
  public static void main(String[] args) {
    Coin coin1 = new Coin();
    Coin coin2 = new Coin();

    System.out.println("동전 던지기");
    System.out.println("=========================");

    coin1.flip();
    System.out.println("1번 코인 : " + coin1.toString());
    coin2.flip();
    System.out.println("2번 코인 : " + coin2.toString());

    System.out.println("종료");
  }
}
