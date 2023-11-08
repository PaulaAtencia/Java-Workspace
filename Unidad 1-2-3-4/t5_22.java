public class t5_22 {

  public static void main(String[] args) {
    boolean primo = false;
    System.out.print("Los números primos entre 2 y 100 son:");
    for (int num = 2; num <= 100; num++) {
      primo = true;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print("- " + num + " ");
      }
    }
  }
}
