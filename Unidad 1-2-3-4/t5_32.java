public class t5_32 {
    public static void main (String [] args){
    System.out.print("Introduce un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    System.out.print("Los dígitos pares son: ");
    // Lo pone al revés
   // int div = 10;
    long numBasura = numUs;
    long reves = 0;
    int numDig = 0;
    while (numBasura > 0){
      reves = ((reves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Calcula los pares y la suma y los muestra
    long dig;
    long suma = 0;
    for (int i = 0; i < numDig ; i++){
      dig = reves%10;
      if (dig%2 == 0){
        System.out.print(dig+" ");
        suma += dig;
      }
      reves /= 10;
    }
    System.out.print("La suma de los dígitos pares es: "+suma);
  }
}