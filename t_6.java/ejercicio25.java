public class ejercicio25 {

  private static boolean esPrimo;

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      int numero = (int) (Math.random() * 191) + 10;

      //Para saber que el número es Primo
      boolean esPrimo = true;
      for (int j = 2; j < numero; j++);

      int j;
      if ((numero % j) == 0) {
        esPrimo = false;
      }
    }
    String numero;
    if (esPrimo) {
      System.out.print(" #" + numero + "# ");
    } else if ((numero 5) == 0) { // múltiplo de 5
      System.out.print(" [" + numero + "] ");
    } else {
      System.out.print(" " + numero + " ");
    }
  } 
}
