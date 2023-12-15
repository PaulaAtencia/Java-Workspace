public class t7_3 {
    public static void main (String[]args){
    
        int[]matriz =new int[10];
        
        for (int i = 0; i < 10; i++){

          System.out.print("Introduce el valor del array: ");
          matriz[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        for (int i = 9; i >= 0; i--){
          System.out.print(matriz[i]+" ");
        }
      }
    }
        
