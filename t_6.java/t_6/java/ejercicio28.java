package t_6.java;

import java.util.Scanner;

public class ejercicio28 {
    Scanner s= new Scanner(System.in);

    System.out.print("Introduzca el tamaño del array:");
    int n= Integer.parseInt(s.nextLine());

    int [] a= new int [n];
    
    for (int i = 0; i < n; i++) {
        a[i] = (int) (Math.random() * 201);
        }
System.out.println("\nArray original:");
System.out.print("Índice ");
for (int i = 0; i < a.length; i++) {
System.out.printf("%5d", i);
}
System.out.print("\nValor ");
