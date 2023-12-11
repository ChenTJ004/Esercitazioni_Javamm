package javamm;

@SuppressWarnings("all")
public class Serpentina {
  public static int[] visitaSerpentina(int[][] M) {
    int m = M.length;
    int n = M[0].length;
    int[] arrayVisitaSerpentina = new int[n];
    int riga = 0;
    for (int i = 0; (i < n); i++) {
      if ((i < m)) {
        arrayVisitaSerpentina[i] = M[i][i];
      } else {
        int _abs = Math.abs(((m - 1) + ((m - 1) - i)));
        int _modulo = (_abs % m);
        riga = _modulo;
        arrayVisitaSerpentina[i] = M[riga][i];
      }
    }
    return arrayVisitaSerpentina;
  }

  public static void main(String[] args) {
  }
}
