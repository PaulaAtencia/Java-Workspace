import java.util.Scanner;
public class t5_59 {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);

    System.out.print("Introduzca la altura del árbol"); 
    
    int alturaIntroducida = Integer.parseInt(s.nextLine());
int espaciosPorDelante = alturaIntroducida - 3;
int espaciosInternos = 0;
// Pinta la estrella del árbol
for (int i = 1; i <= espaciosPorDelante; i++) {
System.out.print(" ");
}
System.out.println("*");
// Empieza por la segunda fila ya que en la primera está la estrella
int altura = 2;
while (altura < alturaIntroducida - 1) {
// inserta espacios delante
for (int i = 1; i <= espaciosPorDelante; i++) 



    s.close();
    }
}
