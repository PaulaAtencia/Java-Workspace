public class t_8_5 {
    public static void main(String[] args) {
    long decimal = 0;
            
    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(System.console().readLine());
            
    int bits = Varias.digitos(binario);     
    for(int i = 0; i < bits; i++) {
    decimal += Varias.digitoN(binario, bits - i - 1) * Varias.potencia(2, i);
    }    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  }
}