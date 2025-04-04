package day11.question.q11;

public class Complex {
  private double realPart;
  private double imaginaryPart;

  public Complex() {
    this.realPart = 0.0;
    this.imaginaryPart = 0.0;
  }

  public Complex(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  public void print() {
    System.out.println("(" + realPart + ", " + imaginaryPart + "i)");
  }

  public Complex subtract(Complex other) {
    double newReal = this.realPart - other.getRealPart();
    double newImaginary = this.imaginaryPart - other.getImaginaryPart();
    return new Complex(newReal, newImaginary);
  }

  public double getRealPart() {
    return realPart;
  }

  public double getImaginaryPart() {
    return imaginaryPart;
  }
}
