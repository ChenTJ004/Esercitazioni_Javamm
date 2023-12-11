package javamm;

@SuppressWarnings("all")
public class SpiralMatrix {
  /**
   * Dato un numero n>0, la matrice a spirale
   * corrispondente a n e' la matrice nxn, contenente
   * i numeri interi da 1 a n*n inseriti nella
   * matrice secondo un percorso a spirale che,
   * partendo dall'elemento in alto a sinistra,
   * procede prima a destra, poi in basso, poi
   * a sinistra e poi in alto. Ad esempio, la
   * matrice a spirale corrispondente al numero 3
   * e' la matrice
   * 
   *  1  2  3
   *  8  9  4
   *  7  6  5
   * 
   * mentre quella corrispondente al numero 4 e'
   * la matrice
   * 
   *  1  2  3  4
   * 12 13 14  5
   * 11 16 15  6
   * 10  9  8  7
   * 
   * e quella corrispondente al numero 5 e'
   * la matrice
   * 
   *  1  2  3  4  5
   * 16 17 18 19  6
   * 15 24 25 20  7
   * 14 23 22 21  8
   * 13 12 11 10  9
   * 
   * Scrivere un metodo, chiamato spiralMatrix,
   * che, dato in input un numero positivo n e
   * un numero x compreso tra 1 e n*n, restituisca
   * un array di due elementi corrispondenti alla
   * riga e alla colonna della posizione in cui
   * si trova x all'interno della matrice a spirale
   * corrispondente a n.
   * 
   * ESEMPI
   * Input: 3, 6
   * Output: {2,1}
   * 
   * Input: 3, 9
   * Output: {1,1}
   * 
   * Input: 4, 1
   * Output: {0,0}
   * 
   * Input: 4, 12
   * Output: {1,0}
   * 
   * Input: 4, 15
   * Output: {2,2}
   * 
   * SUGGERIMENTO: puo' convenire costruire prima la matrice
   * a spirale e cercare poi nella matrice la posizione
   * del valore x. Poiche' i numeri che appaiono nella
   * matrice a spirale sono positivi, si puo' usare lo
   * 0 come indicatore che una posizione della matrice
   * non e' ancora stata occupata. Quindi, la costruzione
   * della matrice puo' essere effettuata muovendosi
   * in ciascuna direzione fintanto che si incontrano 0 e
   * fintanto che non si fuoriesce dalla matrice.
   */
  public static int[][] creaMatrice(int n) {
    int[][] M = new int[n][n];
    int elementi = (n * n);
    int i = 1;
    int rigaInizio = 0;
    int rigaFine = (n - 1);
    int colInizio = 0;
    int colFine = (n - 1);
    while ((i <= elementi)) {
      {
        for (int j = colInizio; (j <= colFine); j++) {
          {
            M[rigaInizio][j] = i;
            i++;
          }
        }
        rigaInizio++;
        for (int j = rigaInizio; (j <= rigaFine); j++) {
          {
            M[j][colFine] = i;
            i++;
          }
        }
        colFine--;
        for (int j = colFine; (j >= colInizio); j--) {
          {
            M[rigaFine][j] = i;
            i++;
          }
        }
        rigaFine--;
        for (int j = rigaFine; (j >= rigaInizio); j--) {
          {
            M[j][colInizio] = i;
            i++;
          }
        }
        colInizio++;
      }
    }
    return M;
  }

  public static int[] spiralMatrix(int n, int x) {
    int[][] M = SpiralMatrix.creaMatrice(n);
    for (int i = 0; (i < M.length); i++) {
      for (int j = 0; (j < M[0].length); j++) {
        boolean _tripleEquals = (M[i][j] == x);
        if (_tripleEquals) {
          return new int[] { i, j };
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[][] M = SpiralMatrix.creaMatrice(5);
    for (int i = 0; (i < M.length); i++) {
      {
        for (int j = 0; (j < M.length); j++) {
          String _plus = (Integer.valueOf(M[i][j]) + " ");
          System.out.print(_plus);
        }
        System.out.println();
      }
    }
  }
}
