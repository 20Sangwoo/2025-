package day9.question.q1;

public class CalculateProduct {
  int product1(int a, int b) {
    int product = 0;

    while (b != 0) {
      product += a;
      b -= 1;
    }

    return product;
  }

  int product2(int a, int b) {
    int product = 0;

    for (; b>0; b-=1) {
      product += a;
    }

    return product;
  }

  int product3(int a, int b) {
    if( b == 0 ) {
      return 0;
    }
    else { return product3(a, b-1) + a;
    }
  }
}
