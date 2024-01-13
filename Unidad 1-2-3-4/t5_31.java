public class t5_31 {

  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < h - 1; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ((h / 2) + 1); i++) {
      System.out.print("* ");
    }
  }
}
