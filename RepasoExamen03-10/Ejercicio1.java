import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Inserta una hora entre el 0 y el 23");
        int hora;
        Scanner s = new Scanner(System.in);
        hora = s.nextInt();
        
        if(hora>=7 && hora <=11) {
            System.out.println("Buenos días");

        }
        else if(hora>=12 && hora <=20){
            System.out.println("Buenas tardes");
        }
        else if((hora>=21 && hora <=23)||(hora>=0 && hora<=6 ) ){
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("Hora incorrecta, por favor vuelva a probar");
        }

        s.close();

    }
}
