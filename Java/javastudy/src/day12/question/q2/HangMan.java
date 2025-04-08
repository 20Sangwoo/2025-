package day12.question.q2;

import java.util.Random;
import java.util.Scanner;

public class HangMan {
  String[] words;     // 단어장
  char[] guessedWord; //힌트
  int attempts;       // 시도 횟수

  public HangMan(String[] words) {
    this.words = words;
  }

  public void run() {
    Random random = new Random();
    int idx = random.nextInt(words.length);
    String word = words[idx];
//    System.out.println("word = " + word);
    attempts = words.length + 3; //시도횟수
    guessedWord = makeUnderLine(word.length());

    Scanner scanner = new Scanner(System.in);
    while (attempts > 0) {
      System.out.println("현재 단어 : " + String.valueOf(guessedWord));
      System.out.println("남은 시도 회수 : " + attempts);

      // 한문자 입력받기
      String str = "";
      while (true) {
        System.out.printf("글자를 입력하세요 [1글자(a-z)] : ");
        str = scanner.nextLine();
        if (str.length() != 1) {
          System.out.println("잘못된 입력입니다. 1글자 영문자를 입력하세요");
          continue;
        }
        if ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') ||
                (str.charAt(0) >= 'A' && str.charAt(0) <= 'B')) {
          str = str.toLowerCase(); // 소문자 변환
          break;
        }
      }

      char ch = str.charAt(0);
      boolean isCorrectGuess = false;   //맞춘 글자인지 여부 판단
      // 글자 맞추기
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == ch) {
          guessedWord[i] = ch;  //맞춘 글자 업데이트
          isCorrectGuess = true; //맞춘 글자 표시
        }
      }// end of while
      // 단어를 모두 맞춘 경우
      if (String.valueOf(guessedWord).equals(word)) {
        System.out.printf("축하합니다! " + word);
        return;
      }
      // 단어를 맞추지 못한 경우
      if (!isCorrectGuess) {
        attempts--; //시도횟수 감소
        System.out.println("틀렸습니다. 남은 시도 횟수 : " + attempts);
      }
    }// end of while
    // 게임종료 메세지
    System.out.println("다음기회로... 정답은 " + word + "입니다.");
  }

  //언더라인 메서드 생성
  private char[] makeUnderLine(int length) {
    char[] underLine = new char[length];
    for (int i = 0; i < length; i++) {
      underLine[i] = '_';
    }
    return underLine;
  }


}