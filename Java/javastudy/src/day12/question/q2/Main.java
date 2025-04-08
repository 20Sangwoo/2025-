package day12.question.q2;
/*
  행맨 게임 구현하기
  사용자가 단어를 추측하는 방식으로 진행

  1. 흰트 : 단어의 길이 만큼 언더바로 출력하여 보여준다.
  2. 맞춘 문자는 지정된 위치에 표시한다. ex) _t___n_    남은횟수 : 7
  3. 시도횟수 : 단어길이 + 3
  4. 시도횟수 내에 맞추면 "축하합니다!" 메시지 출력하고 실패하면 "다음기회로.." 출력

  현재단어 : _______
  남은 시도 회수 : 10
  글자를 입력하세요[1글자(a~z)] : t

  현재단어 : _t_____
  남은 시도 회수 :9
  글자를 입력하세요[1글자(a~z)] :

  ...
  현재단어 : student
  남은 시도 회수 :1
  축하합니다.
 */
public class Main {
  public static void main(String[] args) {
    String[] words = {
            "program", "freedom", "believe", "thought", "company",
            "love", "student", "teacher", "chair", "culture"
    };
    HangMan hangMan = new HangMan(words);
    hangMan.run();
  }
}