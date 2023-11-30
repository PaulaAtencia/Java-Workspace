public class ejercicio4 {
    System.out.println("Muestra 20 números enteros aleatorios entre 0 y 10:");
    for (int i = 0; i < 20; i++){
      int num = (int)(Math.random()*10) + 1;
      System.out.print(num + " ");
    }
  }
