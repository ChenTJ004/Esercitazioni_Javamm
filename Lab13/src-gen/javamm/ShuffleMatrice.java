package javamm;

@SuppressWarnings("all")
public class ShuffleMatrice {
  public static int[][] shuffleVerticale(int[][] T, int[] S) {
    int[][] N = new int[T.length][T[0].length];
    for (int i = 0; (i < T.length); i++) {
      for (int j = 0; (j < T[0].length); j++) {
        N[j][S[i]] = T[j][i];
      }
    }
    return N;
  }

  public static int[][] shuffleOrizzontale(int[][] T, int[] S) {
    int[][] N = new int[T.length][T[0].length];
    for (int i = 0; (i < T.length); i++) {
      for (int j = 0; (j < T[0].length); j++) {
        N[S[i]][j] = T[i][j];
      }
    }
    return N;
  }

  public static int[][] shuffleMatrice(int[][] T, int[][] S) {
    for (int i = 0; (i < S.length); i++) {
      T = ShuffleMatrice.shuffleVerticale(T, S[i]);
    }
    for (int i = 0; (i < S.length); i++) {
      T = ShuffleMatrice.shuffleOrizzontale(T, S[i]);
    }
    return T;
  }

  public static void stampaMatrice(int[][] M) {
    for (int i = 0; (i < M.length); i++) {
      {
        for (int j = 0; (j < M[0].length); j++) {
          System.out.print(M[i][j]);
        }
        System.out.println();
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
  }
}
