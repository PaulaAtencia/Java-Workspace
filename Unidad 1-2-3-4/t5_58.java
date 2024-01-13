import java.util.Scanner;
public class t5_58 {
    public static void main(String[] args) {
        java.util.Scanner s =new Scanner(System.in);
        System.out.print("Introduce un número");
        long numero=0;
        int numeroIntroducido =1;

        int suma=0;
        int longitud=0;

        while (numeroIntroducido> 0){
            suma+= numeroIntroducido %10;
            numeroIntroducido/=10;
            longitud++;
        }

        System.out.println("La media de sus dígitos es" + (double)suma/longitud );
        s.close();
    }
}
