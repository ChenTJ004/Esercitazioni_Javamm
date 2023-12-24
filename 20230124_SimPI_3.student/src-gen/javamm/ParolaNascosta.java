package javamm;

@SuppressWarnings("all")
public class ParolaNascosta {
  public static char cercaCarattereNascosto(char[] riga) {
    int count = 0;
    int max = 0;
    char carattere = ' ';
    for (int i = 0; (i < riga.length); i++) {
      {
        for (int j = i; (j < riga.length); j++) {
          boolean _tripleEquals = (riga[i] == riga[j]);
          if (_tripleEquals) {
            count++;
          }
        }
        if (((count >= 2) && (count > max))) {
          max = count;
          carattere = riga[i];
        }
        count = 0;
      }
    }
    return carattere;
  }

  public static int lunghezzaParola(char[][] testo) {
    int lunghezza = 0;
    for (int i = 0; (i < testo.length); i++) {
      char _cercaCarattereNascosto = ParolaNascosta.cercaCarattereNascosto(testo[i]);
      boolean _tripleNotEquals = (_cercaCarattereNascosto != ' ');
      if (_tripleNotEquals) {
        lunghezza++;
      }
    }
    return lunghezza;
  }

  public static char[] cercaParolaNascosta(char[][] testo) {
    int index = 0;
    int i = 0;
    char[] parolaNascosta = new char[ParolaNascosta.lunghezzaParola(testo)];
    char carattere = 0;
    while ((index < parolaNascosta.length)) {
      {
        carattere = ParolaNascosta.cercaCarattereNascosto(testo[i++]);
        if ((carattere != ' ')) {
          parolaNascosta[index++] = carattere;
        }
      }
    }
    if ((index == 0)) {
      return new char[] { ' ' };
    } else {
      return parolaNascosta;
    }
  }

  public static void main(String[] args) {
  }
}
