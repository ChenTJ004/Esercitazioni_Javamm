package javamm;

@SuppressWarnings("all")
public class esercizio_RLE {
  public static String stringaDecompressa(int[] S) {
    String D = "";
    {
      int i = 0;
      int _length = S.length;
      boolean _lessThan = (i < _length);
      boolean _while = _lessThan;
      while (_while) {
        for (int j = 0; (j < S[(i + 1)]); j++) {
          String _D = D;
          D = (_D + Integer.valueOf(S[i]));
        }
        int _i = i;
        i = (_i + 2);
        int _length_1 = S.length;
        boolean _lessThan_1 = (i < _length_1);
        _while = _lessThan_1;
      }
    }
    return D;
  }

  public static void main(String[] args) {
    int[] stringaCompressa = { 0, 3, 1, 2, 0, 5, 1, 3, 0, 1 };
    System.out.println(esercizio_RLE.stringaDecompressa(stringaCompressa));
  }
}
