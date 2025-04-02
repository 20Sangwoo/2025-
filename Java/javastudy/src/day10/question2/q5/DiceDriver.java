package day10.question2.q5;

import day9.access.pack2.D;

public class DiceDriver {
  public static void main(String[] args) {
//    1. count = 0
    int count = 0;
//    2. d1 = 첫 번째 Die 객체
    Dice d1 = new Dice();
//    3. d2 = 두 번째 Die 객체
    Dice d2 = new Dice();
//    4. 다음을 100 번 반복한다:
    for (int i=0; i<100; i++) {
//① face1 = 첫 번째 Die 객체를 던진 후 나온 값
      d1.roll();
      int face1 = d1.getFaceValue();
//② face2 = 두 번째 Die 객체를 던진 후 나온 값
      d2.roll();
      int face2 = d2.getFaceValue();
//③ sum = face1 + face2
      int sum = face1 + face2;
//④ sum 이 7 이거나 11 이면 count 값을 1 만큼 증가시킨다
      if (sum == 7 || sum == 11) {
        count++;
      }
    }
//    5. count 값을 출력한다
    System.out.println(count);
  }
}
