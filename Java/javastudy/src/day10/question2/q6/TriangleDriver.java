package day10.question2.q6;

public class TriangleDriver {
  public static void main(String[] args) {
//    1. triangle1 = 세 변의 길이가 각각 3, 5, 7 인 Triangle 객체
    Triangle triangle1 = new Triangle(3, 5, 7);
//    2. triangle2 = 세 변의 길이가 각각 3, 4, 5 인 Triangle 객체
    Triangle triangle2 = new Triangle(3, 4, 5);
//    3. triangle3 = 세 변의 길이가 각각 7, 10, 7 인 Triangle 객체
    Triangle triangle3 = new Triangle(7, 10, 7);
//    4. triangle1 이 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다.
    if (triangle1.is_right()) {
      System.out.println("직각삼각형이다.");
    } else if (triangle1.is_isosceles()) {
//    아니면 이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘
      System.out.println("이등변삼각형이다.");
//    다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
    } else {  System.out.println("직각삼각형도 이등변삼각형도 아니다."); }
//    5. Triangle2 가 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다.
    if (triangle2.is_right()) {
      System.out.println("직각삼각형이다.");
    } else if (triangle2.is_isosceles()) {
//    아니면 이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘
      System.out.println("이등변삼각형이다.");
//    다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
    } else {  System.out.println("직각삼각형도 이등변삼각형도 아니다."); }
//    6. Triangle3 가 직각삼각형이라면 ‘직각삼각형이다’라고 출력한다.
    if (triangle3.is_right()) {
      System.out.println("직각삼각형이다.");
    } else if (triangle3.is_isosceles()) {
//    아니면 이등변삼각형이라면 ‘이등변삼각형이다’ 라고 출력한다. 둘
      System.out.println("이등변삼각형이다.");
//    다 아니면 ‘직각삼각형도 이등변삼각형도 아니다.’ 라고 출력한다.
    } else {  System.out.println("직각삼각형도 이등변삼각형도 아니다."); }
  }
}
