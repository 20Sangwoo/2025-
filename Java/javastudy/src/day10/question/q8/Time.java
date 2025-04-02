package day10.question.q8;

public class Time {
  int hour;
  int minute;
  int second;

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  void adjustHour(int adjust) {
    this.hour += adjust;
  }

  void adjustMinute(int adjust) {
    this.minute += adjust;
  }

  void adjustSecond(int adjust) {
    this.second += adjust;
  }

  void printTime() {
    System.out.printf("현재 시각 %d시 %d분 %d초 입니다. \n", hour, minute, second);
  }

}
