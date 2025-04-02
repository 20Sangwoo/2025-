package day5;

public class Array_1 {
  public static void main(String[] args) {
//    정수형 배열 subjects, 인덱스 공간 3 ([2]) 선언
    int[] subjects = new int[3];
    subjects[0] = 90;
    subjects[1] = 80;
    subjects[2] = 70;

    int sum = 0;
    System.out.println(subjects.length);  // 배열의 크기 = .length

    for(int i=0; i<subjects.length; i++) {
      sum += subjects[i];   // sum = sum + subjects[i]
    }

    double avg = (double)sum / subjects.length;

    System.out.printf("총점 : %d\n", sum);
    System.out.printf("총점 : %.1f\n", avg);
  }
}
