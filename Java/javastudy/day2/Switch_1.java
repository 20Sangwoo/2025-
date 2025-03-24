package day2;

public class Switch_1 {
  public static void main(String[] args) {
    int value;    //변수 선언(타입 + 변수명) :
                  // 타입(숫자형,문자형,문자열형(String),논리형,참조형) : 값의 유형을 정의하고 메모리 크기를 결정
                  // 변수명 : 메모리 특정 공간에 하나의 값을 저장하기 위해 붙인 이름

    value = 10;   //변수 초기화 : 변수 선언후 최초로 값을 저장하는 행위
    value = 30;   //변수 재할당 : 변수 초기화 후 값을 수정하는 행위

    switch( value ){ //30
      case 5:
        System.out.println("value=" + 5);
        break; // switch문 빠져나가기
      case 10:
        System.out.println("value=" + 10);
        break;
      case 20:
        System.out.println("value=" + 20);
        break;
      default:
        System.out.println("기타");
    }
  }

}
