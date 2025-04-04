package day11.question.q9;

public class BaseballPlayer {
  private String name;
  private String position;
  private int numHits;
  private int numWalks;

  public BaseballPlayer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public int getNumHits() {
    return numHits;
  }

  public int getNumWalks() {
    return numWalks;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setNumHits(int numHits) {
    this.numHits = numHits;
  }

  public void setNumWalks(int numWalks) {
    this.numWalks = numWalks;
  }

  @Override
  public String toString() {
    return name + " " + position + " " + ", 안타 수=" + numHits +
            ", 4구 수=" + numWalks;
  }
}
