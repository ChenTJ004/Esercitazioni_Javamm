package javamm;

@SuppressWarnings("all")
public class slotMachine {
  public static int[][] ruota(int[][] S, int[] r) {
    int m = S.length;
    int n = S[0].length;
    int[][] copiaS = new int[m][n];
    for (int i = 0; (i < n); i++) {
      for (int j = 0; (j < m); j++) {
        copiaS[j][i] = S[((j + r[i]) % m)][i];
      }
    }
    return copiaS;
  }

  public static boolean controllaVincita(int[][] S) {
    int m = S.length;
    int n = S[0].length;
    int rigaCentrale = ((m - 1) / 2);
    for (int i = 0; (i < n); i++) {
      boolean _tripleNotEquals = (S[rigaCentrale][i] != 1);
      if (_tripleNotEquals) {
        return false;
      }
    }
    return true;
  }

  public static boolean partitaCompleta(int[][] S, int[] r, int k) {
    if ((k == 0)) {
      return slotMachine.controllaVincita(S);
    } else {
      return slotMachine.partitaCompleta(slotMachine.ruota(S, r), r, (k - 1));
    }
  }

  public static void main(String[] args) {
  }
}
