package day10.question2.q6;

public class Triangle {
  int side1;
  int side2;
  int side3;

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  boolean is_right() {
    int[] sides = {this.side1, this.side2, this.side3};
    java.util.Arrays.sort(sides);

    if(sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
      return true;
    }
    return false;
  }

  boolean is_isosceles() {
    int sid1 = this.side1;
    int sid2 = this.side2;
    int sid3 = this.side3;

    if (sid1 == sid2 || sid1 == sid3 || sid2 == sid3) {
      return true;
    }
    return false;
  }
}
