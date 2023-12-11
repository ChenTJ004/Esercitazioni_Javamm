package javamm;

@SuppressWarnings("all")
public class AnelliDibo {
  public static boolean anelloBilanciato(int[][] T, int k) {
    int m = T.length;
    int centro = (m / 2);
    int somma = (T[(centro - k)][(centro - k)] + T[(centro + k)][(centro + k)]);
    int somma2 = 0;
    for (int i = 1; (i < m); i++) {
      {
        boolean _tripleNotEquals = (T[(centro - k)][((centro - k) + i)] != T[(centro + k)][((centro + k) - i)]);
        if (_tripleNotEquals) {
          return false;
        }
        boolean _tripleNotEquals_1 = (T[((centro - k) - i)][(centro - k)] != T[((centro + k) + i)][(centro + k)]);
        if (_tripleNotEquals_1) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
  }
}
