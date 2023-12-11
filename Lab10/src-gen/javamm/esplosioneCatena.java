package javamm;

@SuppressWarnings("all")
public class esplosioneCatena {
  public static int[][] esplodiMatrice(int[][] T, int r, int c) {
    boolean _tripleEquals = (T[r][c] == 0);
    if (_tripleEquals) {
      return T;
    }
    T[r][c] = 0;
    int up = 0;
    if ((r == 0)) {
      up = 0;
    } else {
      up = (r - 1);
    }
    int down = 0;
    int _length = T.length;
    int _minus = (_length - 1);
    boolean _tripleEquals_1 = (r == _minus);
    if (_tripleEquals_1) {
      down = r;
    } else {
      down = (r + 1);
    }
    int left = 0;
    if ((c == 0)) {
      left = c;
    } else {
      left = (c - 1);
    }
    int right = 0;
    int _length_1 = T[0].length;
    int _minus_1 = (_length_1 - 1);
    boolean _tripleEquals_2 = (c == _minus_1);
    if (_tripleEquals_2) {
      right = c;
    } else {
      right = (c + 1);
    }
    for (int i = down; (i >= up); i--) {
      for (int j = right; (j >= left); j--) {
        boolean _tripleEquals_3 = (T[i][j] == 1);
        if (_tripleEquals_3) {
          return esplosioneCatena.esplodiMatrice(T, i, j);
        }
      }
    }
    return T;
  }

  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    int[][] input = new int[][] { new int[] { 1, 0, 0, 0 }, new int[] { 1, 1, 0, 0 }, new int[] { 1, 1, 1, 0 }, new int[] { 1, 1, 1, 1 } };
    int[][] a = esplosioneCatena.esplodiMatrice(input, x, y);
    for (int i = 0; (i < a.length); i++) {
      {
        for (int j = 0; (j < a[0].length); j++) {
          String _plus = (Integer.valueOf(a[i][j]) + " ");
          System.out.print(_plus);
        }
        System.out.println();
      }
    }
  }
}
