package day11.question.q7;

public class MonetaryCoin extends Coin{
  private int value; //동전의 액면 금액

  public MonetaryCoin(int value) {
    super();
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += "\t,값 = " + value;
    return result;
  }
}