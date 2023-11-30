public class ejercicio3 {

  public static void main(String[] args) {
    System.out.println(
      "Muestra al azar el nombre de una carta de a baraja española:"
    );
    int numPalo = (int) (Math.random() * 4) + 1;
    String palo = "a";
    switch (numPalo) {
      case 1:
        palo = "oros";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
        break;
      case 4:
        palo = "copas";
        break;
      default:
        break;
    }
    int numCarta = (int) (Math.random() * 10) + 1;
    String carta = "a";
    switch (numCarta) {
      case 1:
        carta = "As";
        break;
      case 2:
        carta = "2";
        break;
      case 3:
        carta = "2";
        break;
      case 4:
        carta = "4";
        break;
      case 5:
        carta = "5";
        break;
      case 6:
        carta = "6";
        break;
      case 7:
        carta = "7";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        break;
    }
    System.out.println(carta + " de " + palo);
  }
}
