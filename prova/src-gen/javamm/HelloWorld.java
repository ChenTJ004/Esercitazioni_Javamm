package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class HelloWorld {
  /**
   * This is a function definition
   */
  public static void formulaGauss() {
    int n = Input.getInt("Inserisci il numero n: ");
    int somma = ((n * (n + 1)) / 2);
    System.out.println(("Somma: " + Integer.valueOf(somma)));
  }

  public static void main(String[] args) {
    HelloWorld.formulaGauss();
  }
}
