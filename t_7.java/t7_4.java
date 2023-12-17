public class t7_4 {
    public static void main (String [] args){

      //Preparo los arrays

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        //Relleno con random el pimero
        for (int i = 0; i < 20; i++){
          numero[i] = (int)(Math.random()*100);
        }

        //Relleno el array de cuadrado
        for (int i = 0; i < 20; i++){
          cuadrado[i] = numero[i]*numero[i];
        }

        //Relleno el array de cubo
        for (int i = 0; i < 20; i++){
          cubo[i] = cuadrado[i]*numero[i];
        }

        //Se mueta los arrays
        System.out.println();
        System.out.print("Número: ");
        for (int i = 0; i < 20; i++){
          System.out.print(numero[i]+" ");
        }

        System.out.println();
        System.out.print("Cuadrado: ");
        for (int i = 0; i < 20; i++){
          System.out.print(cuadrado[i]+" ");
        }
        
        System.out.println();
        System.out.print("Cubo: ");
        for (int i = 0; i < 20; i++){
          System.out.print(cubo[i]+" ");
        }
      }
    }