import java.util.Scanner;

public class t7_18 {
    public static void main(String[] args) {
      int[] a = new int[10];
    int[] menores = new int[10];
    int[] mayores = new int[10];
    int cuentaMenores = 0;
    int cuentaMayores = 0;
    
    // Genera el array original y clasifica los números
    for (int i = 0; i < 10; i++) {
      a[i] = (int) (Math.random() * 201);
      
      if (a[i] <= 100) {
        menores[cuentaMenores++] = a[i];
      } else {
        mayores[cuentaMayores++] = a[i];
      }
    }

    // Muestra el array original
    System.out.println("\nArray original:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", a[i]);
    }
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    // Genera el array resultado
    int[] resultado = new int[10];
    int menoresColocados = 0;
    int mayoresColocados = 0;
    
    int j = 0;
    do {
      
      if (menoresColocados < cuentaMenores) {
        resultado[j++] = menores[menoresColocados++];
      }
      
      if (mayoresColocados < cuentaMayores) {
        resultado[j++] = mayores[mayoresColocados++];
      }
      
    } while (j < 10);


    // Muestra el resultado.
    System.out.println("\nArray resultado:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", resultado[i]);
    }
    System.out.println("│");
    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");


       
    // Crea el array con valores aleatorios
    int[] n = new int[12];
    
    for (int i = 0; i < 12; i++) {
      n[i] = (int) (Math.random() * 201);
    }

    // Muestra el array original
    System.out.println("Array original:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
    
    // Pide el número y la posición donde colocarlo
    Scanner s = new Scanner(System.in);
    
    System.out.print("\n\nIntroduzca el número que quiere insertar: ");
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion = Integer.parseInt(s.nextLine());
    
    // Inserta el número y desplaza el resto hacia la derecha
    for (int i = 11; i > posicion; i--) {
      n[i] = n[i - 1];
    }
    
    n[posicion] = numero;
    
    // Muestra el resultado
    System.out.println("\nArray resultado:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
  }
  
}