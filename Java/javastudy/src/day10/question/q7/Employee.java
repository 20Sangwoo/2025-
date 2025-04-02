package day10.question.q7;

public class Employee {
  String name;
  String jdn;
  String position;
  double hourlyWages;

  double getPay(int hour) {
    return hour * hourlyWages;
  }

  void raise(double add) {
    this.hourlyWages += add;
  }
}

