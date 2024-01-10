package repaso;

import java.util.Random;

public class repaso2 {

  private static final int letterIndex = 0;
private static int col;

public static void main(String[] args) {
    //Números que acepta
    Random ran = new Random();
    int height = ran.nextInt(6) * 2 + 3;
    int halfheight = height / 2;

    //Imprime los números
    String[] letters = { "H", "0", "L", "A" };

    //Para poder hacer el algoritmo
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < letters.length * 4 - 3; col++);

      //Para poder hacer la columna 
      if (col < 3 || col >= letters.length * 4 - 3 - 3) {
        if (row == halfheight) {
        System.out.print("*");

        }else{
            System.out.print(" ");
        }

        }else{
            if (row==halfheight){
        }

        
        System.out.print(letters[letterIndex]);
        
        }else{
            System.out.print(" ");
        }
        }
      }
    }