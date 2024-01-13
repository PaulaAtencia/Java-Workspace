public class t2_6 {

  public static void main(String[] args) {
    int IVA = 21;
    int baseImp = 100;
    int totalFac = ((baseImp * IVA / 100) + baseImp);

    System.out.printf("El total sin IVA es: " + baseImp + ".\n");
    System.out.printf("El total con IVA es: " + totalFac + ".\n");
  }
}
