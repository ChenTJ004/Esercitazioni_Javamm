package javamm;

@SuppressWarnings("all")
public class Occorrenze {
  public static int numMax(int[] a) {
    int max = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > max);
      if (_greaterThan) {
        max = a[i];
      }
    }
    return max;
  }

  public static int dimensioneOccorrenzeCompresso(int[] a) {
    int count = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleNotEquals = (a[i] != 0);
      if (_tripleNotEquals) {
        count++;
      }
    }
    return count;
  }

  public static int[] occorrenze(int[] a) {
    int[] occorrenze = new int[(Occorrenze.numMax(a) + 1)];
    int count = 0;
    for (int i = 0; (i < occorrenze.length); i++) {
      {
        count = 0;
        for (int j = 0; (j < a.length); j++) {
          boolean _tripleEquals = (i == a[j]);
          if (_tripleEquals) {
            count++;
          }
        }
        occorrenze[i] = count;
      }
    }
    return occorrenze;
  }

  public static int[] occorrenzeCompresso(int[] a) {
    int[] occorrenze = Occorrenze.occorrenze(a);
    int[] occorrrenzeCompresso = new int[Occorrenze.dimensioneOccorrenzeCompresso(occorrenze)];
    int count = 0;
    for (int i = 0; (i < occorrenze.length); i++) {
      boolean _tripleNotEquals = (occorrenze[i] != 0);
      if (_tripleNotEquals) {
        occorrrenzeCompresso[count] = occorrenze[i];
        count++;
      }
    }
    return occorrrenzeCompresso;
  }

  public static void main(String[] args) {
    int[] a = { 8, 8, 2, 5 };
    int[] o = Occorrenze.occorrenzeCompresso(a);
  }
}
