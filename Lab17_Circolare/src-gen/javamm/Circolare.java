package javamm;

@SuppressWarnings("all")
public class Circolare {
  public static char[][] matriceInversa(char[][] M) {
    int m = M.length;
    int n = M[0].length;
    char[][] matriceInversa = new char[m][n];
    for (int i = 0; (i < m); i++) {
      for (int j = 0; (j < n); j++) {
        final char _switchValue = M[i][j];
        switch (_switchValue) {
          case 'A':
            matriceInversa[i][j] = 'B';
            break;
          case 'B':
            matriceInversa[i][j] = 'A';
            break;
          case 'S':
            matriceInversa[i][j] = 'D';
            break;
          case 'D':
            matriceInversa[i][j] = 'S';
            break;
        }
      }
    }
    return matriceInversa;
  }

  public static boolean circolare(char[][] M) {
    int m = M.length;
    int n = M[0].length;
    int numElementi = (n * m);
    int rigaInizio = 0;
    int colonnaInizio = 0;
    int riga = 0;
    int colonna = 0;
    char azione = 0;
    int index = 0;
    while ((index < numElementi)) {
      {
        azione = M[riga][colonna];
        switch (azione) {
          case 'A':
            riga = (((riga - 1) + m) % m);
            break;
          case 'B':
            riga = ((riga + 1) % m);
            break;
          case 'S':
            colonna = (((colonna - 1) + n) % n);
            break;
          case 'D':
            colonna = ((colonna + 1) % n);
            break;
        }
        index++;
        if (((riga == rigaInizio) && (colonna == colonnaInizio))) {
          if ((index == numElementi)) {
            return true;
          } else {
            return false;
          }
        }
      }
    }
    return false;
  }

  public static boolean circolareInversa(char[][] M) {
    return Circolare.circolare(Circolare.matriceInversa(M));
  }

  public static void main(String[] args) {
    char[][] M = { new char[] { 'S', 'S', 'S', 'S' } };
    boolean circolare = Circolare.circolare(M);
    System.out.println(Circolare.circolareInversa(M));
    System.out.println(circolare);
  }
}
