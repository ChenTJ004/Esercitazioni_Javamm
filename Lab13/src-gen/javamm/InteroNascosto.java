package javamm;

@SuppressWarnings("all")
public class InteroNascosto {
  public static int interoNascosto(int a, int b, int c) {
    double numNascosto = 0;
    int count = 0;
    while ((a > 0)) {
      {
        if ((((a % 10) == (b % 10)) || ((a % 10) == (c % 10)))) {
          double _numNascosto = numNascosto;
          numNascosto = (_numNascosto + (a % 10));
          double _numNascosto_1 = numNascosto;
          numNascosto = (_numNascosto_1 / 10);
          count++;
        } else {
          if (((b % 10) == (c % 10))) {
            double _numNascosto_2 = numNascosto;
            numNascosto = (_numNascosto_2 + (b % 10));
            double _numNascosto_3 = numNascosto;
            numNascosto = (_numNascosto_3 / 10);
            count++;
          }
        }
        int _a = a;
        a = (_a / 10);
        int _b = b;
        b = (_b / 10);
        int _c = c;
        c = (_c / 10);
      }
    }
    for (int i = 0; (i < count); i++) {
      double _numNascosto = numNascosto;
      numNascosto = (_numNascosto * 10);
    }
    return ((int) numNascosto);
  }

  public static void main(String[] args) {
  }
}
