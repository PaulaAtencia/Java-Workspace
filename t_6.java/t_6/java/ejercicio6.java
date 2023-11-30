public class ejercicio6 {

  public static void main(String[] args) {
    System.out.print(
      "Intenta adivinar el número (entre 0 y 100) que estoy pensando: "
    );
    int num = (int) (Math.random() * 101);
    int i = 1;
    final int intentos = 5;
    boolean acertado = false;
    while (i <= intentos) {
      int numUs = Integer.parseInt(System.console().readLine());
      if (num == numUs) {
        acertado = true;
        System.out.println("ENHORABUENA, HAS ACERTADO");
      }
      if (!acertado) {
        if (num < numUs) {
          System.out.println("El número que estoy pensando es más pequeño.");
        } else {
          System.out.println("En número que estoy pensando es más grande.");
        }
        System.out.println("Te quedan " + (intentos - i) + " oportunidades.");
        if (i < 8) {
          System.out.print("Vuelve a intentarlo: ");
        }
      }
      i++;
    }
    System.out.println("El número era el: " + num);
  }
}
