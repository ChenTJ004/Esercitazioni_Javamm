package javamm;

@SuppressWarnings("all")
public class GeneraMatriceDaArray {
  public static int colonneMatrice(int[] arr) {
    int somma = 0;
    for (int i = 0; (i < arr.length); i++) {
      int _somma = somma;
      somma = (_somma + arr[i]);
    }
    return somma;
  }

  public static int righeMatrice(int[] arr) {
    int max = 0;
    for (int i = 0; (i < arr.length); i++) {
      boolean _greaterThan = (arr[i] > max);
      if (_greaterThan) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[][] generaMatriceDaArray(int[] arr) {
    int m = GeneraMatriceDaArray.righeMatrice(arr);
    int n = GeneraMatriceDaArray.colonneMatrice(arr);
    int[][] M = new int[m][n];
    int num = 1;
    int inizioSottomatrice = 0;
    for (int i = 0; (i < arr.length); i++) {
      {
        for (int j = 0; (j < arr[i]); j++) {
          for (int k = 0; (k < arr[i]); k++) {
            int _plusPlus = num++;
            M[j][(inizioSottomatrice + k)] = _plusPlus;
          }
        }
        int _inizioSottomatrice = inizioSottomatrice;
        inizioSottomatrice = (_inizioSottomatrice + arr[i]);
      }
    }
    return M;
  }

  public static int[][] generaMatriceDaArrayRicorsivo(int[] arr) {
    return null;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1 };
    GeneraMatriceDaArray.generaMatriceDaArray(arr);
  }
}
