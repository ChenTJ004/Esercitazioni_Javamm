package javamm;

@SuppressWarnings("all")
public class TraslaMatrice {
  public static int[] rigaTraslata(int[] riga, short numPosizioni) {
    int lunghezza = riga.length;
    int[] rigaTraslata = new int[lunghezza];
    for (int i = 0; (i < lunghezza); i++) {
      rigaTraslata[(((i + numPosizioni) + Math.abs((lunghezza * numPosizioni))) % lunghezza)] = riga[i];
    }
    return rigaTraslata;
  }

  public static int[][] scorrimentoRighe(int[][] M) {
    int m = M.length;
    int index = 0;
    while ((index < m)) {
      {
        if (((index % 2) == 0)) {
          M[index] = TraslaMatrice.rigaTraslata(M[index], ((short) 1));
        } else {
          M[index] = TraslaMatrice.rigaTraslata(M[index], ((short) -1));
        }
        index++;
      }
    }
    return M;
  }

  public static int[][] scorrimentoRigheNposizioni(int[][] M, short p) {
    int m = M.length;
    int index = 0;
    while ((index < m)) {
      {
        if (((index % 2) == 0)) {
          M[index] = TraslaMatrice.rigaTraslata(M[index], p);
        } else {
          int _minus = (-p);
          M[index] = TraslaMatrice.rigaTraslata(M[index], ((short) _minus));
        }
        index++;
      }
    }
    return M;
  }

  public static void main(String[] args) {
    int[][] M = { new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 8, 9, 10, 11, 12, 13, 14 }, new int[] { 15, 16, 17, 18, 19, 20, 21 } };
    TraslaMatrice.scorrimentoRighe(M);
  }
}
