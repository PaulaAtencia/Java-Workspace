public class Ejercicio2 {

  public static void main(String[] args) {
    System.out.println(
      "Inserta una función que a partir de un número nos devuelva el día de la semana"
    );
    int día = Integer.parseInt(System.console().readLine());

    String díaDelasemana;

    switch (día) {
      case 1:
        díaDelasemana = "Lunes";
        break;
      case 2:
        díaDelasemana = "Martes";
        break;
      case 3:
        díaDelasemana = "Miércoles";
        break;
      case 4:
        díaDelasemana = "Jueves";
        break;
      case 5:
        díaDelasemana = "Viernes";
        break;
      case 6:
        díaDelasemana = "Sábado";
        break;
      case 7:
        díaDelasemana = "Domingo";
      default:
        díaDelasemana = "No existe ese día";
    }
    System.out.println("Día" + día + ": " + díaDelasemana);
  }
}
