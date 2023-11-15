public class t5_46 {
        public static void main(String[] args) {
            int hueco= 0;
            int w = 0;
            do{
              System.out.print("Introduce la altura: ");
              hueco = Integer.parseInt(System.console().readLine());
              System.out.print("Introduce la anchura: ");
              w = Integer.parseInt(System.console().readLine());
              if ((hueco < 2) || (w < 2)){
                System.out.println("Los datos introducidos son incorrectos, la altura y anchura deben ser mayor que 2.");
              }
            } while ((hueco < 2) || (w < 2));
            for (int fil = 0; fil < hueco; fil++){
              for (int col = 0; col < w; col++){
                if ((fil == 0) || (fil == (hueco-1))){
                  System.out.print("* ");
                } else {
                  if ((col == 0) || (col == (w-1))){
                    System.out.print("* ");
                  } else {
                    System.out.print("  ");
                  }
                }
              }
              System.out.println();
            }
    }
}
