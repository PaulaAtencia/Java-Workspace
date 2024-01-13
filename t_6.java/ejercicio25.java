public class ejercicio25 {

  private static boolean esPrimo;

  public static void main(String[] args) {
    int numero = 0;
    for (int i = 0; i < 100; i++) {
      numero = (int) (Math.random() * 191) + 10;

      //Para saber que el número es Primo
      boolean esPrimo = true;
      for (int j = 2; j < numero; j++){
        if ((numero % j) == 0) {
          esPrimo = false;
        }
      }
    }

    if (esPrimo) {
      System.out.print(" #" + numero + "# ");
    } else if ((numero) == 0) { // múltiplo de 5
      System.out.print(" [" + numero + "] ");
    } else {
      System.out.print(" " + numero + " ");
    }
  } 
}
