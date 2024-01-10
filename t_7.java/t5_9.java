public class t5_9 {
    public static void main(String[]args){

        int[] numero = new int[8];
        System.out.print("Introduce 8 números: ");
        for (int i = 0; i < numero.length; i++){
          numero[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i < numero.length; i++){
          System.out.print(numero[i]);
          if (numero[i]% 2 == 0){
            System.out.println(" par");
          } else {
            System.out.println(" impar");
          }
        }
      }
    }