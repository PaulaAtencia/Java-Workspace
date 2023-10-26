public class Ejercicio_12 {
public static void main(String[] args) {
    String linea;
    int paso = 1024;
    /* Recibe numero de Kb */
    System.out.print("Por favor, introduce un número de Kb: ");
    linea = System.console().readLine();
    int kb = Integer.parseInt(linea);
    /* Calcula los Mb y los muestra */
    int total = kb/paso;
    System.out.printf("%d Kb son %d Mb. \n", kb, total);
}
}
