package day10.question.q9;

import day9.access.pack2.D;

public class Student {
  String Name;
  String Number;
  String Department;

  public String getName() {
    return Name;
  }

  public String getNumber() {
    return Number;
  }

  public String getDepartment() {
    return Department;
  }

  public void setName(String name) {
    this.Name = name;
  }

  public void setNumber(String number) {
    this.Number = number;
  }

  public void setDepartment(String department) {
    this.Department = department;
  }

  public String toString() {
    return Name + ", " + Number + " , " + Department;
  }
}
