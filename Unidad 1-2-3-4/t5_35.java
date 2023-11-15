public class t5_35 {
  public static void main(String[] args) {
    int h = 0;
    do {
      System.out.print("Introduce la altura (debe ser mayor de 3): ");
      h = Integer.parseInt(System.console().readLine());
    } while (h < 3);
    for (int fil = 1; fil <= h; fil++){
      for (int col = 1; col <= h; col++){
        if ((fil == col) || (col == (h-fil)+1)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}