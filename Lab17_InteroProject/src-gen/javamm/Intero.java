package javamm;

@SuppressWarnings("all")
public class Intero {
  public static int numCifre(int n) {
    int i = 1;
    while ((n >= 10)) {
      {
        int _n = n;
        n = (_n / 10);
        i++;
      }
    }
    return i;
  }

  public static boolean bilanciato(int n) {
    int k = Intero.numCifre(n);
    double _pow = Math.pow(10, (k - 1));
    int _intValue = Double.valueOf((n / _pow)).intValue();
    int a = (_intValue % 10);
    double _pow_1 = Math.pow(10, (k - k));
    int _intValue_1 = Double.valueOf((n / _pow_1)).intValue();
    int b = (_intValue_1 % 10);
    int sommaRiferimento = (a + b);
    if ((k == 2)) {
      return (a == b);
    } else {
      int somma = 0;
      for (int i = 0; (i < (k / 2)); i++) {
        {
          double _pow_2 = Math.pow(10, ((k - i) - 1));
          int _intValue_2 = Double.valueOf((n / _pow_2)).intValue();
          int _modulo = (_intValue_2 % 10);
          a = _modulo;
          double _pow_3 = Math.pow(10, (k - (k - i)));
          int _intValue_3 = Double.valueOf((n / _pow_3)).intValue();
          int _modulo_1 = (_intValue_3 % 10);
          b = _modulo_1;
          somma = (a + b);
          if ((somma != sommaRiferimento)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 43;
    System.out.println(Intero.bilanciato(n));
  }
}
