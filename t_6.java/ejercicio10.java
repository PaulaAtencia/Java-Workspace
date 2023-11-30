public class ejercicio10 {

  public static void main(String[] args) {
    System.out.println(
      "Pinta por pantalla diez líneas formadas por caracteres de longitud aleatoria ente 1 y 40:"
    );
    final int lineas = 10;
    for (int i = 0; i < lineas; i++) {
      int longitud = (int) (Math.random() * 40) + 1;
      for (int j = 0; j < longitud; j++) {
        int c = (int) (Math.random() * 6);
        switch (c) {
          case 0:
            System.out.print("*");
            break;
          case 1:
            System.out.print("-");
            break;
          case 2:
            System.out.print("=");
            break;
          case 3:
            System.out.print(".");
            break;
          case 4:
            System.out.print("|");
            break;
          case 5:
            System.out.print("@");
            break;
        }
      }
      System.out.println();
    }
  }
}
