import java.util.Scanner;

public class t5_49 {
        public static void main (String []args){

    System.out.println("Por favor, vaya introduciendo números enteros positivos");
    
    System.out.println("Para terminar, introduzca un número primo:");
    Scanner s = new Scanner(System.in);

    int numero;
    int suma = 0;
    int cuentaNumeros = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    boolean esPrimo;

    do {
      numero = Integer.parseInt(s.nextLine());

      //Comprueba si el número introducido es Primo

      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      }

      //Si no es primo, se contabiliza
      if (esPrimo) {
        suma += numero;
        cuentaNumeros++;

        maximo = numero > maximo ? numero : maximo;
        minimo = numero > minimo ? numero : minimo;
      }
    } while (esPrimo);

    System.out.print("Ha introducido " + cuentaNumeros + "números no primos.");
    System.out.print("Máximo: " + maximo);
    System.out.print("Mínimo: " + minimo);
    System.out.print("Media:" + (double) suma /cuentaNumeros);

    s.close();
  }
}
