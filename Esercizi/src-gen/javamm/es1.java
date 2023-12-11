package javamm;

@SuppressWarnings("all")
public class es1 {
  public static void main(String[] args) {
    int r = 2;
    int c = 2;
    boolean libero = false;
    boolean[][] m = new boolean[8][8];
    if (((Boolean.valueOf(m[(r + 1)][(c - 1)]) == Boolean.valueOf(false)) || (Boolean.valueOf(m[(r + 1)][(c + 1)]) == Boolean.valueOf(false)))) {
      libero = true;
    } else {
      libero = false;
    }
  }
}
