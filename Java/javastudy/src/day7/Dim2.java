package day7;

import java.util.Arrays;

/*
  2차원 배열
 */
public class Dim2 {
  public static void main(String[] args) {
    int[] array;
    array = new int[2];
    System.out.println("array = " + array);
    System.out.println("array[0] = " + array[0]);
    System.out.println("array[1] = " + array[1]);

    int[][] array2; //2차원 배열 선언
    array2 = new int[2][3];
    System.out.println(array2);
    System.out.println(array2[0]);
    System.out.println(array2[0][0]);
    System.out.println(array2[0][1]);
    System.out.println(array2[0][2]);

    System.out.println(array2[1]);
    System.out.println(array2[1][0]);
    System.out.println(array2[1][1]);
    System.out.println(array2[1][2]);
  }
}
