package javamm;

@SuppressWarnings("all")
public class Anelli {
  public static boolean anelloBilanciato(int[][] T, int k) {
    int m = T.length;
    int centro = (m / 2);
    int elementoCentrale = T[centro][centro];
    int somma = 0;
    for (int i = 0; (i < ((k * 2) + 1)); i++) {
      {
        int _plus = (T[(centro - k)][(centro + (i - k))] + T[(centro + k)][((centro + k) - i)]);
        somma = _plus;
        if ((elementoCentrale != somma)) {
          return false;
        }
      }
    }
    for (int i = 1; (i < (k * 2)); i++) {
      {
        int _plus = (T[(centro + (i - k))][(centro - k)] + T[((centro + k) - i)][(centro + k)]);
        somma = _plus;
        if ((elementoCentrale != somma)) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
  }
}
