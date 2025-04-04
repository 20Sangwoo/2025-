package day11.question.q7;

public class MonetaryCoinDriver {
  public static void main(String[] args) {
    MonetaryCoin[] coins = null;
    int sum = 0;

    coins = new MonetaryCoin[4];
    coins[0] = new MonetaryCoin(10);
    coins[1] = new MonetaryCoin(50);
    coins[2] = new MonetaryCoin(100);
    coins[3] = new MonetaryCoin(500);

    for (int i = 0; i < coins.length; i++) {
      coins[i].flip();
      System.out.println(coins[i]);
    }

    sum = 0;
    for (int i = 0; i < coins.length; i++) {
      sum += coins[i].getValue();
    }

    System.out.println("동전의 합계 = " + sum);

  }
}