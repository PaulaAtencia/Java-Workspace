public class ejercicio1 {

  public static void main(String[] args) {
    System.out.print("Muestra la tirada de los tres dados al azar:");

    int suma = 0;
    for (int i = 0; i < 3; i++);
    int dado = (int) (Math.random() * 6) + 1;
    switch (dado) {
      case 1:
        System.out.print("1");
        suma += dado;
        break;
      case 2:
        System.out.print("2");
        suma += dado;
        break;
      case 3:
        System.out.print("3");
        suma += dado;
        break;
      case 4:
        System.out.print("4");
        suma += dado;
        break;
      case 5:
        System.out.print("5");
        suma += dado;
        break;
      case 6:
        System.out.print("6");
        suma += dado;
        break;
      default:
        break;
    }
    System.out.print("\t");
    System.out.print("Suma = " + suma);
  }
}
