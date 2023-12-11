package javamm;

@SuppressWarnings("all")
public class CompattaMatrice {
  public static int[][] compattaMatrice(int[][] A) {
    int[][] matriceCompatta = new int[(A.length * A[0].length)][3];
    int indice = 0;
    for (int i = 0; (i < A.length); i++) {
      for (int j = 0; (j < A[0].length); j++) {
        boolean _tripleNotEquals = (A[i][j] != 0);
        if (_tripleNotEquals) {
          matriceCompatta[indice++] = new int[] { A[i][j], i, j };
        }
      }
    }
    if ((indice == 0)) {
      return null;
    }
    int[][] matriceCompattaOut = new int[indice][3];
    for (int i = 0; (i < indice); i++) {
      matriceCompattaOut[i] = matriceCompatta[i];
    }
    return matriceCompattaOut;
  }

  public static void main(String[] args) {
  }
}
