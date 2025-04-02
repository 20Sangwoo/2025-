package day6;
/*
학생들의 성적 배열이 주어졌을 때, 다음 통계를 계산하는 프로그램을 작성하세요.

  학생 성적 : 85 92 78 90 88 95 76 81

  1.전체 성적의 합계를 계산하세요.
  2.평균 성적을 소수점 2자리까지 계산하세요.
  3.평균 이상의 성적을 가진 학생 수를 계산하세요.
  4.최고 성적과 최저 성적을 찾으세요.

  == 출력 예시 ==
  총점: 685
  평균: 85.63
  평균 이상 학생 수: 4명
  최고 성적: 95
  최저 성적: 76
*/
public class Question_3 {
  public static void main(String[] args) {
    int[] scores = {85, 92, 78, 90, 88, 95, 76, 81};
    
    //1. 총점
    System.out.println("총점 : " + getTotal(scores));

    //2. 평균
    double avg = getTotal(scores) / (double)scores.length;
    System.out.printf("평균 : %.2f" , avg);
    System.out.println();

    //3. 평균이상의 학생수
    System.out.println("평균 이상 학생수 : " + getNumberOfStudentsAboveAverage(scores,avg));

    //4. 최고 성적
    System.out.println("최고 성적 : " + getHighestGrade(scores));

    //4. 최저 성적
    System.out.println("최저 성적 : " + getLowestGrade(scores));
  }

  public static int getTotal(int[] scores){
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    return sum;
  }

  public static int getNumberOfStudentsAboveAverage(int[] scores, double avg){
    int cnt = 0;
    for (int i = 0; i < scores.length; i++) {
      if(avg < scores[i]){
        cnt++;
      }
    }
    return cnt;
  }

  public static int getHighestGrade(int[] scores) {
    int max = scores[0];
    for (int i = 0; i < scores.length; i++) {
      if ( max < scores[i]) {
        max = scores[i];
      }
    }
    return max;
  }

  public static int getLowestGrade(int[] scores) {
    int min = scores[0];
    for (int i = 0; i < scores.length; i++) {
      if ( min > scores[i]) {
        min = scores[i];
      }
    }
    return min;
  }
}
