package javamm;

@SuppressWarnings("all")
public class EspandiArray {
  public static int maxRipetizioni(int[] V) {
    int max = 0;
    for (int i = 0; (i < V.length); i++) {
      boolean _greaterThan = (V[i] > max);
      if (_greaterThan) {
        max = V[i];
      }
    }
    return max;
  }

  public static int[][] espandiArray(int[] V) {
    int numRighe = EspandiArray.maxRipetizioni(V);
    int numColonne = V.length;
    int[][] M = new int[numRighe][numColonne];
    for (int i = 0; (i < numColonne); i++) {
      for (int j = 0; (j < V[i]); j++) {
        M[j][i] = V[i];
      }
    }
    return M;
  }

  public static int[][] espandiArrayExtra(int[] V) {
    int numRighe = EspandiArray.maxRipetizioni(V);
    int numColonne = V.length;
    int[][] M = new int[numRighe][numColonne];
    for (int i = 0; (i < numRighe); i++) {
      for (int j = 0; (j < numColonne); j++) {
        int _minus = (V[j] - 1);
        boolean _lessEqualsThan = (i <= _minus);
        if (_lessEqualsThan) {
          M[i][j] = V[j];
        } else {
          M[i][j] = 0;
        }
      }
    }
    return M;
  }

  public static void main(String[] args) {
  }
}
