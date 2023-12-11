package javamm;

@SuppressWarnings("all")
public class testBilanciamento {
  public static boolean testBilanciamento(int[] r, int i) {
    int somma = (r[0] + r[(r.length - 1)]);
    int _length = r.length;
    int _modulo = (_length % 2);
    boolean _tripleEquals = (_modulo == 1);
    if (_tripleEquals) {
      return false;
    } else {
      int _length_1 = r.length;
      int _divide = (_length_1 / 2);
      boolean _greaterEqualsThan = (i >= _divide);
      if (_greaterEqualsThan) {
        return true;
      } else {
        int _plus = (r[i] + r[((r.length - 1) - i)]);
        boolean _tripleEquals_1 = (_plus == somma);
        if (_tripleEquals_1) {
          return testBilanciamento.testBilanciamento(r, (i + 1));
        } else {
          return false;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] r = { 0, 1, 3, 6, 8, 9 };
    System.out.println(testBilanciamento.testBilanciamento(r, 0));
  }
}
