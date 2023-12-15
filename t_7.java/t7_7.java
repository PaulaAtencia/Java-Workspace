public class t7_7 {

  public static void main(String[] args) {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 21);
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.print("Introduce 1 número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor que quieres sustituir (0-20): ");
    int sust = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < array.length; i++) {
      if (array[i] == sust) {
        System.out.print("\"" + num + "\" ");
      } else {
        System.out.print(array[i] + " ");
      }
    }
  }
}
