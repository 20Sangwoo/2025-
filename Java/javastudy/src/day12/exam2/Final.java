package day12.exam2;

import java.util.Random;

/*
 final
1. 정의 : **최종,마지막**
2. final + 변수 : 변수 초기화 후 재할당 불가능
3. static + final + 변수  :  상수
4. final + 메소드 :   final로 지정된 메소드는 하위클래스에서 재정의 불가
5. final + 클래스 :    하위 개념(자식 클래스)를 만들 수 없다.
*/
public class Final {
  static final int x = 10; // 인스턴스가 공유하는 상수
  final int y = 20;       // 인스턴스별로 사용되는 상수
//  static { // static 블럭 : static필드 초기화
//    Random random = new Random();
//    x = random.nextInt(10)+1;
//  }

//  Final(int x) {
//    this.x = x;
//  }

  void method(){

  }
  final void method2(){

  }
}