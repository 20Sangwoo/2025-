package day9.question.q14_2;

public class CheckPassword {

  int countNumber(String password){
    int cnt = 0;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if ( ch >= '0' && ch <= '9') {
        cnt++;
      }
    }
    return cnt;
  }

  int countNumber2(String password){
    int cnt = 0, i = 0;
    while ( i < password.length()) {
      char ch = password.charAt(i);
      if ( ch >= '0' && ch <= '9') {
        cnt++;
      }
      i++;
    }
    return cnt;
  }

  int countAlphabet(String password){
    int cnt = 0;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if ( (ch >= 'a' && ch <= 'z') ||
              (ch >= 'A' && ch <= 'Z') ) {
        cnt++;
      }
    }
    return cnt;
  }
  int countAlphabet2(String s){
    if(s.length() == 0) return 0;
    if(isAlphabet(s.charAt(0))){
      return countAlphabet2(s.substring(1)) + 1;
    }else{
      return countAlphabet2(s.substring(1));
    }
  }

  private boolean isAlphabet(char ch) {
    if ( (ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z') ) {
      return true;
    }else{
      return false;
    }
  }
}