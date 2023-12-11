package javamm;

@SuppressWarnings("all")
public class AzzeraNonUnici {
  public static int[][] azzeraNonUnici(int[][] M, int r, int c) {
    int m = M.length;
    int n = M[0].length;
    int elemento = M[r][c];
    int i = 1;
    boolean nonUnico = false;
    while (((c + i) < n)) {
      {
        boolean _tripleEquals = (elemento == M[r][(c + i)]);
        if (_tripleEquals) {
          M[r][(c + i)] = 0;
          nonUnico = true;
        }
        i++;
      }
    }
    i = 1;
    while (((r + i) < m)) {
      {
        boolean _tripleEquals = (elemento == M[(r + i)][c]);
        if (_tripleEquals) {
          M[(r + i)][c] = 0;
          nonUnico = true;
        }
        i++;
      }
    }
    i = 1;
    while ((((r + i) < m) && ((c + i) < n))) {
      {
        boolean _tripleEquals = (elemento == M[(r + i)][(c + i)]);
        if (_tripleEquals) {
          M[(r + i)][(c + i)] = 0;
          nonUnico = true;
        }
        i++;
      }
    }
    if (nonUnico) {
      M[r][c] = 0;
    }
    return M;
  }

  public static int[][] azzeraNonUniciMatrice(int[][] M) {
    int m = M.length;
    int n = M[0].length;
    for (int i = 0; (i < m); i++) {
      for (int j = 0; (j < n); j++) {
        AzzeraNonUnici.azzeraNonUnici(M, i, j);
      }
    }
    return M;
  }

  public static void main(String[] args) {
  }
}
