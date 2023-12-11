package javamm;

@SuppressWarnings("all")
public class es9_1 {
  public static boolean accoppiata(char[] C, int i) {
    int _length = C.length;
    int middle = (_length / 2);
    if (((middle % 2) == 1)) {
      return false;
    } else {
      if ((i >= middle)) {
        return true;
      } else {
        boolean _tripleEquals = (C[i] == C[(i + middle)]);
        if (_tripleEquals) {
          int _plusPlus = ++i;
          return es9_1.accoppiata(C, _plusPlus);
        } else {
          return false;
        }
      }
    }
  }

  public static void main(String[] args) {
    char[] C = { 'm', 'a', 't', 'x', 'm', 'a', 't', 'x' };
    System.out.println(es9_1.accoppiata(C, 0));
  }
}
