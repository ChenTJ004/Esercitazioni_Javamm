package javamm;

@SuppressWarnings("all")
public class VisitaSerpentina {
  public static int[] visitaSerpentina(int[][] M, int riga, int colonna) {
    int _length = M.length;
    int _length_1 = M[0].length;
    int lunghezzaArray = (_length * _length_1);
    int[] cammino = new int[lunghezzaArray];
    int indice = 0;
    int i = riga;
    int j = colonna;
    boolean versoDestra = true;
    while ((indice < lunghezzaArray)) {
      {
        cammino[indice++] = M[i][j];
        if ((versoDestra && (j < (M[0].length - 1)))) {
          j++;
        } else {
          if (((!versoDestra) && (j > 0))) {
            j--;
          } else {
            int _length_2 = M.length;
            int _modulo = ((i + 1) % _length_2);
            i = _modulo;
            boolean _not = (!versoDestra);
            versoDestra = _not;
          }
        }
      }
    }
    return cammino;
  }

  public static void main(String[] args) {
  }
}
