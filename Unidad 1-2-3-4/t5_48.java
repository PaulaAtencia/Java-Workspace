import java.util.Scanner;

public class t5_48 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero:");
    long numero = Long.parseLong(s.nextLine());

    long aux;
    boolean encontrado;

    System.out.print("Estos son los dígitos que aparecen en el número");

    for (int i = 0; i < 10; i++) {
      //Comprueba si la i está en el número
      encontrado = false;
      aux = numero;

      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }

      if (encontrado) {
        System.out.print(i + " ");
      }
    }

    System.out.print("\nDígitos que no aparecen en el número: ");

    for (int i = 0; i < 10; i++) {
      //Comprueba si la i está en el número
      encontrado = false;
      aux = numero;

      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }

      if (encontrado) {
        System.out.print(i + "");

        s.close();
      }
    }
  }
}
