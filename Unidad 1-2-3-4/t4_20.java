import java.util.Scanner;

public class t4_20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    int num = s.nextInt();
    String str = Integer.toString(num);
    String reverseStr = new StringBuilder(str).reverse().toString();
    if (str.equals(reverseStr)) {
      System.out.println("El número " + num + " es capicúa.");
    } else {
      System.out.println("El número " + num + " no es capicúa.");
        s.close();
    }
  }
}
