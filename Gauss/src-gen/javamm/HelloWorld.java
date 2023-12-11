package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class HelloWorld {
  public static void main(String[] args) {
    int n = Input.getInt("Inserisci il numero n: ");
    int somma = ((n * (n + 1)) / 2);
    System.out.println(("Somma: " + Integer.valueOf(somma)));
  }
}
