package javamm;

@SuppressWarnings("all")
public class AzzeraNonUnici {
  public static int[][] azzeraNonUnici(int[][] M, int r, int c) {
    int m = M.length;
    int n = M[0].length;
    int elemento = M[r][c];
    for (int i = 1; (i < n); i++) {
      boolean _tripleEquals = (elemento == M[r][(c + i)]);
      if (_tripleEquals) {
        M[r][(c + i)] = 0;
      }
    }
    for (int i = 1; (i < m); i++) {
      {
        boolean _tripleEquals = (elemento == M[(r + i)][c]);
        if (_tripleEquals) {
          M[(r + i)][c] = 0;
        }
        boolean _tripleEquals_1 = (elemento == M[(r + i)][(c + i)]);
        if (_tripleEquals_1) {
          M[(r + i)][(c + i)] = 0;
        }
      }
    }
    return M;
  }

  public static int[][] azzeraNonUniciMatrice(int[][] M) {
    return null;
  }

  public static void main(String[] args) {
    int[][] M = new int[][] { new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 } };
    int r = 0;
    int c = 1;
    int[][] azzerata = new int[][] { new int[] { 1, 0, 3, 4 }, new int[] { 1, 0, 3, 4 }, new int[] { 1, 0, 3, 4 } };
    System.out.println(AzzeraNonUnici.azzeraNonUnici(M, r, c));
  }
}
