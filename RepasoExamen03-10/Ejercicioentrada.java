import java.util.Scanner;

public class Ejercicioentrada {
    public static void main(String[] args) {
        System.out.println("Inserta el precio de la entrada general");
        double precioGeneral;
        Scanner s = new Scanner(System.in);
        precioGeneral = s.nextDouble();

        //Menú
        System.out.println ("Elige tu entrada: Palco o gallinero");
        String eleccion = s.nextLine();
        
        //Menú 2
        System.out.println ("Elige entre descuento, precio normal o sobreprecio con el 1,2 o 3");
        int opcion = s.nextInt();

        double porcentaje;
        if(eleccion == "palco")
        {
            porcentaje = 0.1; 
        } 
        else 
        {
            porcentaje = 0.05;
        }
        double resultado;
        if(opcion == 1)
        {
            resultado = precioGeneral - precioGeneral * porcentaje;
        }

        else if (opcion == 3)
        {
            resultado = precioGeneral + precioGeneral * porcentaje;
        }
        else 
        {
            resultado = precioGeneral
        }
        System.out.println ("El precio de la entrada es:" + resultado );
        s.close();
}
