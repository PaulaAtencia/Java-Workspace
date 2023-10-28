public class t4_4 {

public static void main(String[] args) {
    final int eurosHora = 12;
    final int eurosExtra = 16;
    int totalSueldo;
    int horasExtra;
    /* Recibe horas trabajadas */
    System.out.print("Por favor, introduce las horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    /* Calcula si hay horas extra */
    if (horasTrabajadas <= 40) {
      totalSueldo = horasTrabajadas * eurosHora;
    System.out.printf(
        "El sueldo correspondiente a %d horas de trabajo, son %d euros",
        horasTrabajadas,
        totalSueldo
    );
    } else if (horasTrabajadas > 40) {
    horasExtra = horasTrabajadas - 40;
      totalSueldo = 40 * eurosHora + horasExtra * eurosExtra;
    System.out.printf(
        "El sueldo correspondiente a %d horas de trabajo, son %d euros",
        horasTrabajadas,
        totalSueldo
    );
    }
}
}
