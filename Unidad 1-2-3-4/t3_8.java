public class t3_8 {
public static void main(String[] args) {
    String linea;
    int eurosHora = 12;
    /* Recibe horas trabajadas */
    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    /* Calcula el salario y lo muestra */
    int totalSueldo = (eurosHora*horasTrabajadas);
    System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasTrabajadas, totalSueldo);
}
}
