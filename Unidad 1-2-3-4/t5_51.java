import java.util.Scanner;

public class t5_51 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(
      "Introduce un mayor entero positivo, que sea mayor que el 0: "
    );
    
    int numero = Integer.parseInt(s.nextLine());

    int volteado = 0;
    boolean numeroComido = false;

    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
        volteado = (volteado * 10) + (numero % 10);
      } else {
        numeroComido = true;
      }
      numero /= 10;
    }
    // Se le vuelve a dar la vuelta al número
    numero = volteado;
    volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroComido) {
      System.out.print("Después de haber sido comido por el gusano númerico ");

      System.out.println("se queda en: " + volteado);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
    s.close();

  }
}
