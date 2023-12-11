package javamm;

@SuppressWarnings("all")
public class traslaMatrice {
  public static int[][] traslaMatrice(int[][] T, int y) {
    int m = T.length;
    int n = T[0].length;
    int[][] T2 = new int[m][m];
    for (int i = 0; (i < m); i++) {
      for (int j = 0; (j < n); j++) {
        T2[i][j] = T[((i + (m - y)) % m)][j];
      }
    }
    return T2;
  }

  public static void stampaMatrice(int[][] M) {
    for (int i = 0; (i < M.length); i++) {
      {
        for (int j = 0; (j < M[0].length); j++) {
          String _plus = (Integer.valueOf(M[i][j]) + "\t");
          System.out.print(_plus);
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
  }
}
