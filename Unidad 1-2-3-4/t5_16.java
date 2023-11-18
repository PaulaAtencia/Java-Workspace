public class t5_16 {

  public static void main(String[] args) {
    boolean primo = true;
    System.out.print("Introduce el numero ");
    int num = Integer.parseInt(System.console().readLine());

    for (int i = 2; i < num && primo; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }
    System.out.print("El número introducido ");
    if (primo) {
      System.out.print("es primo.");
    } else {
      System.out.print("no es primo.");
    }
  }
}
