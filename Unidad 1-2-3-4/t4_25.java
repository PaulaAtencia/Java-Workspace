import java.util.Scanner;

public class t4_25 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.printl("Introduzca la altura de la bandera en cm:");
        int altura = Integer.parseInt(s.nextLine());
        System.out.printl("Introduzca la anchura de la bandera:")
        int anchura = Integer.parseInt(s.nextLine());
        System.out.printl("¿Quiere un escudo bordado?");
        boolean contieneEscudo = ((s.nextLine()).toLowerCase()).equals("s");

        String escudoCadena;
        float  precioEscudo;

        if (contieneEscudo);
        escudoCadena = "contieneEscudo";
        precioEscudo = 2.5f;
        } else {
            escudoCadena = "Sin escudo";
            precioEscudo = 0;
        }

    

        //ME FALTA TERMINARLO!!!!!!!



    
        s.close();
    }
}
