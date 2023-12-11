package javamm;

@SuppressWarnings("all")
public class Lezione1 {
  public static void lezione1() {
    int contatore = 0;
    contatore = 5;
    System.out.println(("Contatore: " + Integer.valueOf(contatore)));
    contatore = (contatore - 1);
    System.out.println(("Contatore: " + Integer.valueOf(contatore)));
  }

  public static void main(String[] args) {
    Lezione1.lezione1();
  }
}
