package day3;
/*
  증감연산자 (2) : ++, --
  
  단독 사용 : 피연산자를 1 증가 혹은 감소
  식에 참여 : 
      전위 - 피연산자 1 증감 후 식 참여
      후위 - 식 참여 후 피연산자 1 증감
 */

public class Operator_3 {
  public static void main(String[] args) {
    int var = 10;

    var++;  // var = var + 1 동일
    System.out.println("var = " + var);

    ++var;
    System.out.println("var = " + var);

    int result = 0;

    result = var++;
    System.out.printf("result = %d, var = %d\n", result, var);
    
    result = ++var;
    System.out.printf("result = %d, var = %d\n", result, var);

    result =  ++var + 10;
    System.out.printf("result = %d, var = %d\n", result, var);

    result = var++ + 10;
    System.out.printf("result = %d, var = %d\n", result, var);

    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
      System.out.println("sum = " + sum);
    }
  }
