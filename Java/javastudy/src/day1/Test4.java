package day1;

public class Test4 {
  public static void main(String[] args) {
//    변수 : 메모리 공간에 하나의 값을 저장하기 위해 붙인 이름
    int kor = 90; // 정수형 변수 선언 및 값 초기화
    System.out.println(kor);
    kor = 95; // 변수 값 재할당
    System.out.println(kor);

    int eng = 80;
    System.out.println("eng = " + eng);

    int math = 70;
    System.out.println("math = " + math);

    int sum = kor + eng + math;
    System.out.println("sum = " + sum);

    int avg = sum / 3;
    System.out.println("avg = " + avg);

    double avg2 = (double) sum / 3;
    System.out.println("avg2 = " + avg2);

    double avg3 = avg2;
    System.out.println("avg3 = " + avg3);

    int value = sum(10, 20);
    System.out.println("value = " + value);

    int value2 = sum(30, 40);
    System.out.println("value2 = " + value2);

    int value3 = sum(60, 70);
    System.out.println("value3 = " + value3);
  }

    public static int sum(int n, int m){
      return n + m;
    }
  }
