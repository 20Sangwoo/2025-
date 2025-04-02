package day9.question.q2;

public class SumOfSquares {
  int SumWhile(int N) {
    int i = 0;
    int result = 0;

    while (i <= N) {
      result = result + i * i;
      i++;
    }

    return result;
  }

  int SumRecursive(int N) {
    if( N == 1 ) {
      return 1;
    }
    else { return SumRecursive(N-1) + N * N;
    }
  }
}
