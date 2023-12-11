package javamm;

@SuppressWarnings("all")
public class cacciaTesoro {
  public static boolean tesoroTrovato(char[][] M, int r, int c, int i) {
    int m = M.length;
    int n = M[0].length;
    int rigaP = (((r + m) - 1) % m);
    int rigaS = ((r + 1) % m);
    int colP = (((c + n) - 1) % n);
    int colS = ((c + 1) % n);
    char ris = M[r][c];
    if ((i >= (n * m))) {
      return false;
    }
    switch (ris) {
      case 'X':
        return true;
      case 'T':
        return false;
      case 'A':
        return cacciaTesoro.tesoroTrovato(M, rigaP, c, (i + 1));
      case 'B':
        return cacciaTesoro.tesoroTrovato(M, rigaS, c, (i + 1));
      case 'S':
        return cacciaTesoro.tesoroTrovato(M, r, colP, (i + 1));
      case 'D':
        return cacciaTesoro.tesoroTrovato(M, r, colS, (i + 1));
      case '?':
        return (((cacciaTesoro.tesoroTrovato(M, r, colS, (i + 1)) || cacciaTesoro.tesoroTrovato(M, r, colP, (i + 1))) || 
          cacciaTesoro.tesoroTrovato(M, rigaS, c, (i + 1))) || cacciaTesoro.tesoroTrovato(M, rigaP, c, (i + 1)));
      default:
        return false;
    }
  }

  public static void main(String[] args) {
    char[][] M = { new char[] { 'B', 'D', 'A' }, new char[] { '?', 'S', 'S' } };
    System.out.println(cacciaTesoro.tesoroTrovato(M, 0, 0, 0));
  }
}
