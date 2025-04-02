package day7;

public class StringMethod2 {
  public static void main(String[] args) {
    String str = "love orange";
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(1));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(3));

    System.out.println("=========");
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }

    System.out.println("=========");
    System.out.println(str.substring(2));
    System.out.println(str.substring(1,3));

    System.out.println("=========");
    int index = str.indexOf("o");
    System.out.println("index = " + index);
    int index2 = str.indexOf("x");
    System.out.println("index2 = " + index2);

    System.out.println("=========");
    int index3 = str.lastIndexOf("o");
    System.out.println("index3 = " + index3);
  }
}
