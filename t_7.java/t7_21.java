public class t7_21 {

  public static void main(String[] args) {
    int[] n = new int[15];

    for (int i = 0; i < 15; i++) {
      n[i] = (int) (Math.random() * 501);
    }
    System.out.println("Array original:");

    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }
    for (int i = 0; i < 15; i++) {
      while (n[i] % 5 != 0) {
        n[i]++;
      }
    }
    System.out.println("\n\nArray resultado:");
    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }
  }
}
