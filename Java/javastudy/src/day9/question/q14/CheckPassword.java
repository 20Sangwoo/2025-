package day9.question.q14;

public class CheckPassword {
  int countNumber(String s) {
    int count = 0;

    for(int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if ( '0' <= c && c <= '9' ) {
        count++;
      }
    }
    return count;
  }

  int countAlphabet(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    char firstChar = s.charAt(0);
    if ((Character.isLetter(firstChar))) {
      return (countAlphabet(s.substring(1)) + 1);
    }
      return countAlphabet(s.substring(1));
    }
  }