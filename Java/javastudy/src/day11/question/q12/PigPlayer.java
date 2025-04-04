package day11.question.q12;

import java.util.*;

//  게임의 선수를 나타낸다. 선수는 사람이거나 컴퓨터이다.
//  각 선수는 총점수와 현 회차에서 얻은 점수들을  추적 관리한다.
//  선수의 한도는 다른 선수에게 순서를 넘겨 주기전에 한 회차에서 얻을 수 있는 최대 점수이다.
//  사람은 제한이 없다.
class PigPlayer
{
   public final static int ASK = -1;  // 회차 종료를 위한 메시지

   private int total;  // 게임에서 얻은 총 점수
   private int round;  // 현 회차에서 얻은 점수
   private int limit;  // 한 회차에서 얻을 수 있는 최대 점수

   //  점수들을 0으로 초기화하고 최대 획득 점수를 주어진 값으로 한다.
   public PigPlayer (int max)
   {
      total = 0;
      round = 0;
      limit = max;
   }

   //  주사위 쌍을 던지고 결과를 다룬다.
   //  선수가 다시 던져야 한다면 true를 반환하고 아니라면 false를 반환한다.
   //  선수는 1이 나오거나 이기거나 회차 한도 점수에 도달하면 다시 던지지 않는다.
   public boolean roll (PairOfDice dice, int goal)
   {
      boolean rollAgain = true;
      Scanner scan = new Scanner(System.in);

      dice.roll();
      int die1 = dice.getDie1();
      int die2 = dice.getDie2();

      System.out.println ();
      System.out.println ("Dice: " + die1 + " + " + die2 +
              " = " + (die1+die2));

      if (die1 == 1 || die2 == 1)
      {
         System.out.println ("꽝입니다!!!");
         rollAgain = false;
         round = 0;
         if (die1 == 1 && die2 == 1)
            total = 0;
      }
      else
      {
         round += die1 + die2;
         System.out.println ("현 회차 점수: " + round);
         System.out.println ("총점: " + (total+round));

         if ((total+round) >= goal)
            rollAgain = false;
         else
         if (limit == ASK)
         {
            System.out.print ("계속 던지시겠습니까 (y/n)? ");
            String again = scan.next();
            rollAgain = again.equalsIgnoreCase("y");
         }
         else
         if (round >= limit)
            rollAgain = false;

         if (! rollAgain)
         {
            total += round;
            round = 0;
         }
      }

      return rollAgain;
   }

   //  선수가 얻은 총점을 반환한다.
   public int getPoints()
   {
      return total;
   }
}