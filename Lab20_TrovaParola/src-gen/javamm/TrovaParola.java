package javamm;

@SuppressWarnings("all")
public class TrovaParola {
  public static boolean trovaParolaDiagonale(char[][] M, char[] p) {
    int m = M.length;
    int n = M[0].length;
    for (int i = 0; (i < m); i++) {
      for (int j = 0; (j < n); j++) {
        boolean _tripleEquals = (M[i][j] == p[0]);
        if (_tripleEquals) {
          if (((((TrovaParola.cercaDiag1(M, p, i, j) == p.length) || (TrovaParola.cercaDiag2(M, p, i, j) == p.length)) || 
            (TrovaParola.cercaDiag3(M, p, i, j) == p.length)) || (TrovaParola.cercaDiag4(M, p, i, j) == p.length))) {
            return true;
          }
        }
      }
    }
    return false;
  }

  public static int cercaDiag1(char[][] M, char[] p, int i, int j) {
    int count = 0;
    int m = M.length;
    int n = M[0].length;
    for (int k = 0; (k < p.length); k++) {
      if (((((i + k) < m) && ((j + k) < n)) && (M[(i + k)][(j + k)] == p[k]))) {
        count++;
      }
    }
    return count;
  }

  public static int cercaDiag2(char[][] M, char[] p, int i, int j) {
    int count = 0;
    int n = M[0].length;
    for (int k = 0; (k < p.length); k++) {
      if (((((i - k) >= 0) && ((j + k) < n)) && (M[(i - k)][(j + k)] == p[k]))) {
        count++;
      }
    }
    return count;
  }

  public static int cercaDiag3(char[][] M, char[] p, int i, int j) {
    int count = 0;
    for (int k = 0; (k < p.length); k++) {
      if (((((i - k) >= 0) && ((j - k) >= 0)) && (M[(i - k)][(j - k)] == p[k]))) {
        count++;
      }
    }
    return count;
  }

  public static int cercaDiag4(char[][] M, char[] p, int i, int j) {
    int count = 0;
    int n = M[0].length;
    int m = M.length;
    for (int k = 0; (k < p.length); k++) {
      if (((((i + k) < m) && ((j - k) >= 0)) && (M[(i + k)][(j - k)] == p[k]))) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
  }
}
