package javamm;

@SuppressWarnings("all")
public class es9_2 {
  /**
   * Scrivere un metodo Java-- chiamato azzeraAdiacenti che, dato in input una matrice 𝑇𝑇
   * di numeri interi di dimensione m x n (m righe e n colonne), con m≥3 e n≥3, e
   * dati due numeri interi r e c tali che 0≤r≤m-1 e 0≤c≤n-1, restituisca la matrice 𝑇𝑇
   * modificata applicando l’azzeramento degli elementi adiacenti all’elemento di indice [r,c].
   */
  public static int[][] azzeraAdiacenti(int[][] M, int r, int c) {
    int m = M.length;
    int n = M[0].length;
    int rigaP = (((r + m) - 1) % m);
    int rigaS = ((r + 1) % m);
    int colP = (((c + n) - 1) % n);
    int colS = ((c + 1) % n);
    M[rigaP][colP] = 0;
    M[rigaP][c] = 0;
    M[rigaP][colS] = 0;
    M[r][colP] = 0;
    M[r][colS] = 0;
    M[rigaS][colP] = 0;
    M[rigaS][c] = 0;
    M[rigaS][colS] = 0;
    return M;
  }

  public static void stampa(int[][] M) {
    for (int i = 0; (i < M.length); i++) {
      {
        for (int j = 0; (j < M[0].length); j++) {
          System.out.print(M[i][j]);
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    int[][] M = new int[10][15];
    for (int i = 0; (i < M.length); i++) {
      for (int j = 0; (j < M[0].length); j++) {
        M[i][j] = 9;
      }
    }
    es9_2.stampa(es9_2.azzeraAdiacenti(M, 0, 0));
  }
}
