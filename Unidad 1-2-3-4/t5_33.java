public class t5_33 {

  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < h; i++) {
      for (int j = 1; j <= h; j++) {
        if ((j == 1) || (j == h)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i < h; i++) {
      if ((i == 1) || (i == h)) {
        System.out.print(" ");
      } else {
        System.out.print("*");
      }
    }
  }
}
