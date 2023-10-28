public class t4_15 {
public static void main(String[] args) {
    System.out.print("Por favor, introduce el caracter ASCII con el que quieres dibujar la pirámide: ");
    String car = System.console().readLine();
    /* Recoge formato */
    System.out.println("Por favor, introduce formato en el que quieres que salga la pirámide: ");
    System.out.print(" 1. Hacia arriba \n 2. Hacia abajo \n 3. Hacia la derecha \n 4. Hacia la izquierda \n");
    int form = Integer.parseInt(System.console().readLine());
    /* Switch para seleccionar formato */
    switch (form){
    case 1:
        System.out.println("    " + car);
        System.out.println("   " + car + car + car);
        System.out.println("  " + car + car + car + car + car);
        System.out.println(" " + car + car + car + car + car + car + car);
        System.out.println(car + car + car + car + car + car + car + car + car);
        break;
    case 2:
        System.out.println(car + car + car + car + car + car + car + car + car);
        System.out.println(" " + car + car + car + car + car + car + car);
        System.out.println("  " + car + car + car + car + car);
        System.out.println("   " + car + car + car);
        System.out.println("    " + car);
        break;
    case 3:
        System.out.println("    " + car);
        System.out.println("   " + car + car);
        System.out.println("  " + car + car + car);
        System.out.println(" " + car + car + car + car);
        System.out.println(car + car + car + car + car);
        System.out.println(" " + car + car + car + car);
        System.out.println("  " + car + car + car);
        System.out.println("   " + car + car);
        System.out.println("    " + car);
        break;
    case 4:
        System.out.println(car + "    ");
        System.out.println(car + car + "   ");
        System.out.println(car + car + car + "  ");
        System.out.println(car + car + car + car + " ");
        System.out.println(car + car + car + car + car);
        System.out.println(car + car + car + car + " ");
        System.out.println(car + car + car + "  ");
        System.out.println(car + car + "   ");
        System.out.println(car + "    ");
        break;
    default:
        System.out.println("Este formato no está disponible.");
    }
}
}