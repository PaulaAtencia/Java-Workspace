public class t5_19 {

  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter: ");
    String car = System.console().readLine();
    for (int fil = 0; fil < h; ++fil) {
      for (int col = 0; col < h - fil - 1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2 * fil + 1; ++col) {
        System.out.print(car);
      }
      System.out.println();
    }
  }
}
