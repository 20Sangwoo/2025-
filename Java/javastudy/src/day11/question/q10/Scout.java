package day11.question.q10;

public class Scout {
  private String name;
  private int boxesSold;

  public Scout(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void updateSales(int box) {
    boxesSold = box;
  }

  @Override
  public String toString() {
    return name + ", " + boxesSold;
  }
}
