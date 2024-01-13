public class t3_10 {

  public static void main(String[] args) {
    String linea;
    int paso = 1024;
    /* Recibe numero de Mb */
    System.out.print("Por favor, introduceun número de Mb: ");
    linea = System.console().readLine();
    int mb = Integer.parseInt(linea);
    /* Calcula los Kb y los muestra */
    int total = mb * paso;
    System.out.printf("%d Mb son %d Kb. \n", mb, total);
  }
}
