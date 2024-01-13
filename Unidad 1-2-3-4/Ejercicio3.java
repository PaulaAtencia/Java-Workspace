/**
* Ejercicio 3 | Tema 1
* Muestra 10 palabras en ingles junto con la tradución al castellano.
* Las palabras deben estar en 2 columnas y alineadas a la izquierda.
* @author Paula Atencia
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("  Español      Inglés");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s      %-10s\n",  "Ordenador",  "Computer");
    System.out.printf("%-10s      %-10s\n",  "Ratón",  "Mouse");
    System.out.printf("%-10s      %-10s\n",  "Pantalla", "Screem");
    System.out.printf("%-10s      %-10s\n",  "Teclado", "Keyboard");
    System.out.printf("%-10s      %-10s\n",  "Mesa", "Table");
    System.out.printf("%-10s      %-10s\n",  "Silla", "Chair");
    System.out.printf("%-10s      %-10s\n",  "Tableta", "Tablet");
    System.out.printf("%-10s      %-10s\n",  "Móvil", "Phone");
    System.out.printf("%-10s      %-10s\n",  "Agua", "Water");
  }

}