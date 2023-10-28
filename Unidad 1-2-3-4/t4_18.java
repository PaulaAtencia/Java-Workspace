public class t4_18 {

public static void main(String[] args) {
    System.out.print("Por favor, introduce un número entero (max. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if (num > 100000) {
    System.out.print("La cifra debe tener como máximo 5 cifras.");
      // Divide hasta que num < 10)
    } else {
    num = num / 10;
    if (num < 10) {
        System.out.print("La primera cifra es " + num);
    } else {
        num = num / 10;
        if (num < 10) {
        System.out.print("La primera cifra es " + num);
        } else {
        num = num / 10;
        if (num < 10) {
            System.out.print("La primera cifra es " + num);
        } else {
            num = num / 10;
            if (num < 10) {
            System.out.print("La primera cifra es " + num);
            } else {
            num = num / 10;
            System.out.print("La primera cifra es " + num);
            }
        }
        }
    }
    }
}
}
