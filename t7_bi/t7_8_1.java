public class t7_8_1 {

  public static void main(String[] args) {
    final String RESET = "\033[0m";
    final String INVERSO = "\033[7m";
    final String BLANCA = "  ";
    final String NEGRA = INVERSO + BLANCA + RESET;
    final String ALFIL = "♝ "; // ∆♝۩♗
    final String MOVIMIENTOBLANCO = "• "; // ●
    final String MOVIMIENTONEGRO = INVERSO + MOVIMIENTOBLANCO + RESET;

    String[][] tablero = new String[9][9];
    int fila;
    int columna;
    String casilla;
    System.out.println("\n  ░░░░░░░░░░░░░░░░░░░░");
    casilla = BLANCA;
    for (fila = 8; fila >= 1; fila--) {
      System.out.print(fila + " ░░");
      for (columna = 1; columna <= 8; columna++) {
        if ((fila % 2) == 1) {
          if ((columna % 2) == 1) {
            casilla = BLANCA;
          } else {
            casilla = NEGRA;
          }
        } else {
          if ((columna % 2) == 1) {
            casilla = NEGRA;
          } else {
            casilla = BLANCA;
          }
        }
        System.out.print(casilla);
        tablero[fila][columna] = casilla;
      }
      System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");

    // pide las coordenadas
    System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
    String posicionAlfil = System.console().readLine();
    int columnaAlfil = (int) (posicionAlfil.charAt(0)) - 96;
    int filaAlfil = (int) (posicionAlfil.charAt(1)) - 48;

    if ((((filaAlfil % 2) + (columnaAlfil % 2)) % 2) == 0) {
      tablero[filaAlfil][columnaAlfil] = ALFIL;
    } else {
      tablero[filaAlfil][columnaAlfil] = INVERSO + ALFIL + RESET;
    }
    System.out.println("\n  ░░░░░░░░░░░░░░░░░░░░");
    for (fila = 8; fila >= 1; fila--) {
      System.out.print(fila + " ░░");
      for (columna = 1; columna <= 8; columna++) {
        if (
          (Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) &&
          (!((filaAlfil == fila) && (columnaAlfil == columna)))
        ) {
          if (tablero[fila][columna] == BLANCA) {
            tablero[fila][columna] = MOVIMIENTOBLANCO;
          } else {
            tablero[fila][columna] = MOVIMIENTONEGRO;
          }
        }
        System.out.print(tablero[fila][columna]);
      }
      System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");

    System.out.println("\nEl alfil puede moverse a las siguientes posiciones:");

    for (fila = 8; fila >= 1; fila--) {
      for (columna = 1; columna <= 8; columna++) {
        if (
          (Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) &&
          (!((filaAlfil == fila) && (columnaAlfil == columna)))
        ) {
          System.out.print((char) (columna + 96) + "" + fila + " ");
        }
      }
    }
  }
}
