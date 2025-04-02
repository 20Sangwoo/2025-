package day7;

import java.util.Random;

/*
  반장, 부반장 선출(단, 중복 허용 금지)
 */
public class Dim2_2 {
  public static void main(String[] args) {
//    String[][] arr = new String[5][];
//    arr[0] = new String[]{"이현준","김민정","허진희","임준영"};
//    arr[1] = new String[]{"김동수","박정용","박수연","정찬호","김연주","김동현","박민창"};
//    arr[2] = new String[]{"정승윤","방준영","명제호","정영제","하경목","김두혁","오대현"};
//    arr[3] = new String[]{"신원석","김나리","정진선"};
//    arr[4] = new String[]{"김지혜"};
    String[][] arr = {
        {"이현준", "김민정", "허진희", "임준영"},
        {"김동수", "박정용", "박수연", "정찬호", "김연주", "김동현", "박민창"},
        {"정승윤", "방준영", "명제호", "정영제", "하경목", "김두혁", "오대현"},
        {"신원석", "김나리", "정진선"},
        {"김지혜"}
    };

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%5s",arr[i][j]);
      }
      System.out.println();
    }
    Random random = new Random();
    //1)반장 선출
    //1-1) 행선택
    int row = random.nextInt(arr.length); // 0~4
    //2-2) 열선택
    int col = random.nextInt(arr[row].length);
    //2)부반장 선출
    int row2, col2;
    while(true) {
      //2-1) 행선택
      row2 = random.nextInt(arr.length); // 0~4
      //2-2) 열선택
      col2 = random.nextInt(arr[row2].length);

      //3) 반장, 부반장 위치가 같으면 다시 다른 위치 선택
      if (row == row2 && col == col2) {
        continue;
      }else{
        break;
      }
    }
    System.out.println("반장 : " + arr[row][col]);
    System.out.println("부반장 : " + arr[row2][col2]);
  }
}
