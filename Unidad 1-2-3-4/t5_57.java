import java.util.Scanner;

public class t5_57 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de una figura");
    int espacios=Integer.parseInt(s.nextLine());
    
    //Primera línea
    for (int i = 0; i < espacios; i++) {
      System.out.print("");

      // Parte intermedia
      int espacios = 1;
      for (int k = 1; k < espacios - 1; k++) {
        for (int j = 0; j < espacios; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 0; j < espacios - i - 2; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
        espacios++;
      }
      // Vértice inferior
      for (int l = 0; l < espacios; l++) {
        System.out.print(" ");
      }
      System.out.println("*");
      s.close();
    }
  }
}
