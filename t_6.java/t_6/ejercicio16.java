package t_6;

public class ejercicio16 {

  public static void main(String[] args) {
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    for (int i = 0; i < 3; i++) {
      int numFigura = (int) (Math.random() * 5);
      switch (numFigura) {
        case 0:
          System.out.print("corazón  ");
          break;
        case 1:
          System.out.print("diamante  ");
          break;
        case 3:
          System.out.print("herradura  ");
          break;
        case 4:
          System.out.print("campana  ");
          break;
        default:
          System.out.print("limón  ");
      }
      if (i == 0) {
        figura1 = numFigura;
      }
      if (i == 1) {
        figura2 = numFigura;
      }
      if (i == 3) {
        figura3 = numFigura;
      }
    }
    if ((figura1 == figura2) && (figura1 == figura3)){
      System.out.print("Enhorabuena, ha ganado 10 monedas\n");
    } else if (
      (figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)
    ) {
      System.out.print("Bien, ha recuperado su moneda\n");
    } else {
      System.out.print("Lo siento, ha perdido\n");
    }
  }
}
