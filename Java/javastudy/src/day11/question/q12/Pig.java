package day11.question.q12;

public class Pig
{
   private int goal;
   private PairOfDice dice;
   private PigPlayer computer, human, currentPlayer;

   //  목표 점수를 포함하여 게임 시작 전에 초기화한다
   public Pig(int target)
   {
      goal = target;

      dice = new PairOfDice();

      computer = new PigPlayer (20);
      human = new PigPlayer (PigPlayer.ASK);
   }

   //  게임의 핵심 반복문이다. 한 선수가 이겼을 때만 끝난다
   public void play()
   {
      boolean noWinnerYet = true;
      currentPlayer = computer;

      do
      {
         takeTurn();

         // 승자를 확인한다. 승자가 없으면 선수를 바꾸고 게임을 계속한다
         if (currentPlayer.getPoints() >= goal)
            noWinnerYet = false;
         else
         if (currentPlayer == computer)
            currentPlayer = human;
         else
            currentPlayer = computer;
      }
      while (noWinnerYet);

      announceWinner();
   }

   // 한 선수의 순서에 대한 게임을 한다. 선수가 주사위 쌍을 여러 번 던질 수 있다
   private void takeTurn ()
   {
      boolean stillRolling = true;

      System.out.println ("****************************************");

      if (currentPlayer == computer)
         System.out.println ("컴퓨터 차례...\n");
      else
         System.out.println ("당신 차례...\n");

      System.out.println ("현 점수:");
      System.out.println ("   컴퓨터: " + computer.getPoints());
      System.out.println ("   당신: " + human.getPoints());

      while (stillRolling)
         stillRolling = currentPlayer.roll (dice, goal);
   }

   //  승자를 발표하고 결과를 출력한다
   private void announceWinner ()
   {
      System.out.println();

      if (currentPlayer == computer)
         System.out.println ("컴퓨터가 이겼습니다!");
      else
         System.out.println ("축하합니다. 당신이 이겼습니다!");

      System.out.println();
      System.out.println ("최종 결과:");
      System.out.println ("   컴퓨터 점수: " + computer.getPoints());
      System.out.println ("   당신 점수: " + human.getPoints());
   }

   public static void main (String[] args)
   {
      Pig game = new Pig(100);

      game.play();
   }
}