package javamm;

@SuppressWarnings("all")
public class Circolare_sol {
  public static boolean circolare(char[][] M, boolean inversa) {
    int conta = 0;
    int r = 0;
    int c = 0;
    while (((conta < (M.length * M[0].length)) && (M[r][c] != ' '))) {
      {
        char app = M[r][c];
        M[r][c] = ' ';
        boolean _not = (!inversa);
        if (_not) {
          switch (app) {
            case 'B':
              int _length = M.length;
              int _modulo = ((r + 1) % _length);
              r = _modulo;
              break;
            case 'A':
              int _length_1 = M.length;
              int _plus = (_length_1 + r);
              int _minus = (_plus - 1);
              int _length_2 = M.length;
              int _modulo_1 = (_minus % _length_2);
              r = _modulo_1;
              break;
            case 'D':
              int _length_3 = M[0].length;
              int _modulo_2 = ((c + 1) % _length_3);
              c = _modulo_2;
              break;
            case 'S':
              int _length_4 = M[0].length;
              int _plus_1 = (_length_4 + c);
              int _minus_1 = (_plus_1 - 1);
              int _length_5 = M[0].length;
              int _modulo_3 = (_minus_1 % _length_5);
              c = _modulo_3;
              break;
          }
        } else {
          switch (app) {
            case 'A':
              int _length_6 = M.length;
              int _modulo_4 = ((r + 1) % _length_6);
              r = _modulo_4;
              break;
            case 'B':
              int _length_7 = M.length;
              int _plus_2 = (_length_7 + r);
              int _minus_2 = (_plus_2 - 1);
              int _length_8 = M.length;
              int _modulo_5 = (_minus_2 % _length_8);
              r = _modulo_5;
              break;
            case 'S':
              int _length_9 = M[0].length;
              int _modulo_6 = ((c + 1) % _length_9);
              c = _modulo_6;
              break;
            case 'D':
              int _length_10 = M[0].length;
              int _plus_3 = (_length_10 + c);
              int _minus_3 = (_plus_3 - 1);
              int _length_11 = M[0].length;
              int _modulo_7 = (_minus_3 % _length_11);
              c = _modulo_7;
              break;
          }
        }
        conta++;
      }
    }
    return (((conta == (M.length * M[0].length)) && (r == 0)) && (c == 0));
  }

  public static boolean circolare(char[][] M) {
    return Circolare_sol.circolare(M, false);
  }

  public static boolean circolareInversa(char[][] M) {
    return Circolare_sol.circolare(M, true);
  }

  public static void main(String[] args) {
  }
}
