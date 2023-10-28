public class t3_6 {
    public static void main(String[] args) {
    String linea;
    /* Recibe la altura del triángulo */
    System.out.print("Por favor, introduce la altura del triángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recibe la base del triángulo */
    System.out.print("Por favor, introduce la base del triángulo: ");
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    /* Calcula el área y la muestra */
    double area = (base*altura)/2;
    System.out.println("La anchura del rectángulo de ("+base+"x"+altura+") es: "+area);
}
}
