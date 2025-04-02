package day7;

public class StringMethod5 {
  public static void main(String[] args) {
    String str = "I love you";
    if(str.contains("love")){
      System.out.println("있다");
    }else{
      System.out.println("없다");
    }

    System.out.println("====");

    System.out.println(str.concat("you love me"));
  }
}
