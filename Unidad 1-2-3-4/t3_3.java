public class t3_3 {


public static void main(String[] args) {
    String linea;
    /* Recibe el número de euros */
    System.out.print("Por favor, introduce una cantidad de euros: ");
    linea = System.console().readLine();
    double euros = Double.parseDouble(linea);
    /* Convierte los euros en ptas. y las muestra */
    int pesetas = (int)(euros*166.86);
    System.out.printf("%.2f euros son %d ptas. \n", euros, pesetas);
}
}

