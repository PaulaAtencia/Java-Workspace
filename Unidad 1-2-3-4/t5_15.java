public class t5_15 {

  public static void main(String[] args) {
    System.out.print("Introduce la base ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el exponente ");
    int exponente = Integer.parseInt(System.console().readLine());
    double total = 1;
    for (int i = 0; i < exponente; i++) {
      total = base * total;
      System.out.println(base + " elevado a " + exponente + " = " + total + ".");
    }
  }
}
