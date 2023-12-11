package javamm;

@SuppressWarnings("all")
public class EserciziDiJohnny {
  public static boolean accoppiata(char[] A, int i) {
    int _length = A.length;
    int mid = (_length / 2);
    int _length_1 = A.length;
    int _modulo = (_length_1 % 2);
    boolean _tripleEquals = (_modulo == 1);
    if (_tripleEquals) {
      return false;
    } else {
      if ((i < mid)) {
        boolean _tripleEquals_1 = (A[i] == A[(i + mid)]);
        if (_tripleEquals_1) {
          return EserciziDiJohnny.accoppiata(A, (i + 1));
        } else {
          return false;
        }
      } else {
        return true;
      }
    }
  }

  public static void main(String[] args) {
    char[] caratteri = { 'm', 'a', 't', 'm', 'a', 't' };
    System.out.println(EserciziDiJohnny.accoppiata(caratteri, 0));
  }
}
