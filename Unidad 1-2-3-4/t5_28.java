public class t5_28 {

  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    for (int i = 1; i <= numUs; i++) {
      factorial *= i;
    }
    System.out.print(numUs + "! = " + factorial);
  }
}
