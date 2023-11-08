public class t5_21 {

  public static void main(String[] args) {
    double dividendo = 0;
    int contadorimp = 0;
    double mayor = 0;
    double impar = 0;
    int contador = 0;
    double num;
    do {
      System.out.print("Introduce un número ");
      num = Double.parseDouble(System.console().readLine());
      if (num % 2 != 0) {
        impar = num;
        dividendo += num;
        contadorimp++;
      } else {
        if (num > mayor) {
          mayor = num;
        }
      }
      contador++;
    } while (num > 0);
    double media = (dividendo - impar) / (contadorimp - 1);
    System.out.println("Ha introducido " + contador + " números.");
    System.out.println("La media de los impares es: " + media + ".");
    System.out.println("El mayor número par ha sido el: " + mayor + ".");
  }
}
