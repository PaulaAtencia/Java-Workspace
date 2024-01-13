public class t4_1 {

  public static void main(String[] args) {
    String diaSem;
    /* Recoge dia de la semana */
    System.out.print("Por favor, introduce un dia de la semana: ");
    diaSem = System.console().readLine().toLowerCase();
    /* Switch para encontrar asignatura */
    switch (diaSem) {
      case "lunes":
      case "martes":
        System.out.print("Entorno de Desarrollo, Sistemas Informáticos.");
        break;
      case "miércoles":
      case "jueves":
      case "viernes":
        System.out.print("Hay Programación, Base de Datos.");
        break;
      case "sábado":
      case "domingo":
        System.out.print("No hay clase.");
      default:
        System.out.print("¿Qué asignatura tengo  a primera hora? ");
    }
  }
}
