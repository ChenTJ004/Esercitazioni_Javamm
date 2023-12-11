package javamm;

@SuppressWarnings("all")
public class Spirale {
  /**
   * Dato un numero dispari positivo n, la matrice associata ad n e' la
   * matrice bidimensionale di dimensione nxn, riempita con i numeri da
   * 1 a nxn a partire dall'elemento in alto a sinistra e procedendo da
   * sinistra verso destra e dall'alto verso il basso. Ad esempio,
   * la matrice associata a 3 e' la seguente matrice:
   * 
   *   1 2 3
   *   4 5 6
   *   7 8 9
   * 
   * mentre la matrice associata a 5 e' la seguente matrice:
   * 
   *   1  2  3  4  5
   *   6  7  8  9 10
   *  11 12 13 14 15
   *  16 17 18 19 20
   *  21 22 23 24 25
   * 
   * La visita a spirale della matrice associata a n consiste nel visitare,
   * una e una sola volta, tutti gli elementi della matrice partendo
   * dall'elemento "al centro" e proseguendo secondo una spirale in senso
   * antiorario, ossia avanzando nel seguente ordine: in alto, a sinistra,
   * in basso e a destra, il numero di volte necessario per ciascuna direzione,
   * e ricominciando. Ad esempio, la visita a spirale della matrice associata a 3
   * visita i suoi elementi secondo il seguente ordine:
   * 
   * 5 2 1 4 7 8 9 6 3
   * 
   * mentre la visita a spirale della matrice associata a 5 visita i suoi elementi
   * secondo il seguente ordine:
   * 
   * 13 8 7 12 17 18 19 14 9 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 5
   * 
   * Scrivere un metodo, chiamato spirale, che dato in input un numero
   * dispari positivo e dato un numero positivo i tale che 1<=i<=nxn,
   * restituisca l'elemento della matrice corrispondente ad n che viene
   * visitato per i-esimo. Ad esempio, con n=3 e i=2, il metodo deve
   * restituire il valore 2, con n=3 e i=5, il metodo deve
   * restituire il valore 7, e, con n=3 e i=8, il metodo deve
   * restituire il valore 6. Invece, con n=5 e i=2, il metodo deve
   * restituire il valore 8, con n=5 e i=8, il metodo deve
   * restituire il valore 14, e, con n=5 e i=15, il metodo deve
   * restituire il valore 11.
   */
  public static int elem(int n, int r, int c) {
    return ((1 + (n * r)) + c);
  }
  
  public static int newDir(int d) {
    return ((d + 1) % 4);
  }
  
  public static int steps(int d, int np) {
    int _xjconditionalexpression = (int) 0;
    if (((d % 2) == 0)) {
      _xjconditionalexpression = (np + 1);
    } else {
      _xjconditionalexpression = np;
    }
    return _xjconditionalexpression;
  }
  
  public static int[] next(int[] p, int d) {
    int _minus = (p[0] - 1);
    int _minus_1 = (p[1] - 1);
    int _plus = (p[0] + 1);
    int _plus_1 = (p[1] + 1);
    int[][] m = { new int[] { _minus, p[1] }, new int[] { p[0], _minus_1 }, new int[] { _plus, p[1] }, new int[] { p[0], _plus_1 } };
    return m[d];
  }
  
  public static int spirale(int n, int i) {
    int[] s = new int[((n * n) + 1)];
    int[] p = { (n / 2), (n / 2) };
    int _elem = Spirale.elem(n, p[0], p[1]);
    s[0] = _elem;
    int k = 1;
    int d = 0;
    int np = 0;
    while ((k < (n * n))) {
      {
        int _steps = Spirale.steps(d, np);
        np = _steps;
        for (int j = 1; (j <= np); j++) {
          {
            int[] _next = Spirale.next(p, d);
            p = _next;
            int _elem_1 = Spirale.elem(n, p[0], p[1]);
            s[k++] = _elem_1;
          }
        }
        int _newDir = Spirale.newDir(d);
        d = _newDir;
      }
    }
    return s[(i - 1)];
  }
  
  public static void main(String[] args) {
    int _spirale = Spirale.spirale(3, 3);
    System.out.println(_spirale);
    int _spirale_1 = Spirale.spirale(5, 2);
    String _plus = (Integer.valueOf(_spirale_1) + " ");
    int _spirale_2 = Spirale.spirale(5, 8);
    String _plus_1 = (_plus + Integer.valueOf(_spirale_2));
    String _plus_2 = (_plus_1 + " ");
    int _spirale_3 = Spirale.spirale(5, 15);
    String _plus_3 = (_plus_2 + Integer.valueOf(_spirale_3));
    System.out.println(_plus_3);
  }
}
