public class t3_5 {
    public static void main(String[] args) {
    String linea;
    /* Recibe la altura del rectángulo */
    System.out.print("Por favor, introduce la altura del rectángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recibe la base del rectángulo */
    System.out.print("Por favor, introduce la anchura del rectángulo: ");
    linea = System.console().readLine();
    double anchura = Double.parseDouble(linea);
    /* Calcula el área y la muestra */
    double area = anchura*altura;
    System.out.println("La anchura del rectángulo de ("+anchura+"x"+altura+") es: "+area);
}
}
