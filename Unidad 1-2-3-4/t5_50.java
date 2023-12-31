import java.util.Scanner;

public class t5_50 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura; 5 como mínimo: ");

    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de espacios entre los números:");
    int espacios = Integer.parseInt(s.nextLine());

    //Primera fila
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    //Segunda fila
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");

      System.out.print("* ");
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    //Tercera fila
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }

    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    //Fila
    for (int fila = 0; fila < altura - 4; fila++) {
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print(" *");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println(" *");
    }
    // Última fila (igual que la primera)
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");
    s.close();
  }
}
