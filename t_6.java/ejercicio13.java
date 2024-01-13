public class ejercicio13 {

  public static void main(String[] args) {
    System.out.println(
      "Simula la tirada de dos dados hasta que salgan iguales:"
    );
    boolean iguales = false;
    while (!iguales) {
      int dado1 = (int) (Math.random() * 6) + 1;
      int dado2 = (int) (Math.random() * 6) + 1;
      System.out.println(dado1 + "  " + dado2);
      if (dado1 == dado2) {
        iguales = true;
      }
    }
  }
}
