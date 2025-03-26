package day3;

public class Operator_1 {
  public static void main(String[] args) {
//  int sum = 0;
//  for(int i = 1; i <= 10; i++) {
//    sum = sum + i;
//  }
//  System.out.println("sum = " + sum);
    int var = 10; //정수형 변수 선언
    var = 10;     // 변수 초기화
    var = 20;     // 재할당
    System.out.println("var = " + var); // 20

    var = var + 1;
    System.out.println("var = " + var); // 21

//  대입 연산자 : =, +=, -=, +=, /=. %=
    var += 1;     // var = var + 1  동일
    System.out.println("var = " + var); // 22
    
    var %= 2;     // var = var % 2 동일
    System.out.println("var = " + var); // 0
    
    var -= 10;    // var = var - 10 동일
    System.out.println("var = " + var); // -10
    
    var *= -2;     // var * -2 동일
    System.out.println("var = " + var); //  20

    var /= 2;     // var / 2 동일
    System.out.println("var = " + var); //  10


}
}
