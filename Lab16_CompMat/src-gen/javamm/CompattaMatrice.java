package javamm;

@SuppressWarnings("all")
public class CompattaMatrice {
  public static int contaElementi(int[][] A) {
    int count = 0;
    for (int i = 0; (i < A.length); i++) {
      for (int j = 0; (j < A[0].length); j++) {
        boolean _tripleNotEquals = (A[i][j] != 0);
        if (_tripleNotEquals) {
          count++;
        }
      }
    }
    return count;
  }

  public static int[][] compattaMatrice(int[][] A) {
    int elementi = CompattaMatrice.contaElementi(A);
    if ((elementi > 0)) {
      int[][] matriceCompatta = new int[CompattaMatrice.contaElementi(A)][3];
      int riga = 0;
      for (int i = 0; (i < A.length); i++) {
        for (int j = 0; (j < A[0].length); j++) {
          boolean _tripleNotEquals = (A[i][j] != 0);
          if (_tripleNotEquals) {
            matriceCompatta[riga][0] = A[i][j];
            matriceCompatta[riga][1] = i;
            matriceCompatta[riga][2] = j;
            riga++;
          }
        }
      }
      return matriceCompatta;
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
  }
}
