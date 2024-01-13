import java.util.Scanner;

// Hecho por Paula Atencia Barranco

public class Graphy {
    
    // Esto son todos los códigos de los diferentes colores
    public static final String RESET = "\033[0m";
    public static final String RED_BG = "\033[41m";
    public static final String GREEN_BG = "\033[42m";
    public static final String BLUE_BG = "\033[44m";
    public static final String PURPLE_BG = "\033[45m";

    // Esto son todos los códigos de las barritas si se elije el modo C
    // Estos cuatro primeros son las esquinas
    public static final String ESQ_IZQ_SUP = "\u2554"; 
    public static final String ESQ_DER_SUP = "\u2557";
    public static final String ESQ_IZQ_INF = "\u255A";
    public static final String ESQ_DER_INF = "\u255D";

    public static final String MID_EXT_IZQ = "\u2560"; // linea vertical que se pone a la IZQUIERDA con extremo ->
    public static final String MID_EXT_DER = "\u2563"; // linea vertical que se pone a la DERECHA con extremo <-
    public static final String MID_EXT_DOWN = "\u2566"; // linea horizontal que se pone a arriba con extremo hacia ABAJO
    public static final String MID_EXT_UP = "\u2569"; // linea horizontal que se pone a abajo con extremo hacia ARRIBA

    public static final String LINE = "\u2550"; // la linea horizontal
    public static final String CROSS = "\u256C"; // la lineas que se cruzan como una cruz
    public static final String MID = "\u2551"; // la linea vertical



    // Calcula las cifras de un número
    public static int numCifras(long x)
    {
        int res = 0;

        while(x>0)
        {
            x = x / 10;
            res++;
        }

        return res;
    }



    // Muestra ciertas veces un texto
    public static void xTimes(String text, int veces)
    {
        for(int i=0; i<veces; i++)
        {
            System.out.print(text);
        }
        System.out.println();
    }



    // Mostrar las celdas con asteriscos
    public static void asteriscos(int ast)
    {
        for(int i=0; i<9; i++)
        {
            System.out.print(" ");

            if(ast > 0) // Se muestra el asterisco si nos quedan
            {
                System.out.print("*");
            }
            else // Si ya no hay más se ponen espacios
            {
                System.out.print(" ");
            }

            System.out.print(" |");

            ast--; // Descontamos un asterisco usado
        }
        System.out.println();
    }



    // Algoritmo que muestra el número
    // num debe ser > 0
    public static void mostrarModo1(long num)
    {
        // Calculamos las cifras de num
        int cifras = numCifras(num);
        
        // Digito actual que se irá mostrando en cada iteración del bucle
        int digit = 0; 

        // Se usa para dividir a num
        double base;

        while(num > 0 || cifras > 0) 
        {
            
            xTimes(" ---", 10); // barritas del principio e intermedias

            System.out.print("| ");

            if(num == 0) // Caso especial de dígitos finales son ceros
            {
                digit = 0;
                System.out.print(digit); // Muestra la cifra que deseamos (cero)
            }
            else
            {
                base = Math.pow(10, cifras-1); // Calculamos 10 elevado al digito que queremos tener

                digit = (int) (num / base); // Obtenemos el dígito con la división entera

                System.out.print(digit); // Muestra la cifra que deseamos
            
                num = num - (long)(digit * base); // Se elimina el dígito del número haciendo esta operación
            }

            cifras--; // Se decrementa una cifra para dividir bien la siguiente

            System.out.print(" |");

            asteriscos(digit); // Se ponen los asteriscos de la cifra

        }

        xTimes(" ---", 10); // Barritas del final

    }



    // Añade los fondos con colores
    public static void barrasColores(int num)
    {
        // Aquí guardaremos el valor de fondo que necesitemos
        String color;

        if(num <= 4)
        {
            color = RED_BG;
        }
        else if(num > 4 && num <= 6)
        {
            color = GREEN_BG;
        }
        else if(num > 6 && num <= 8)
        {
            color = BLUE_BG;
        }
        else
        {
            color = PURPLE_BG;
        }

        // Ejecución donde se muestran los colores
        for(int i=0; i<9; i++)
        {
            if(num > 0)
            {
                System.out.print(color + "   " + RESET);
            }
            else
            {
                System.out.print("   ");
            }

            // Se añade la barrita
            System.out.print(MID);

            num--;
        }
        System.out.println();

    }



    // Crea los bordes del modo 2
    public static void customBorders(int mode)
    {   
        // Variable que contiene el símbolo que queremos (así evitamos poner muchos print)
        String bar; 

        // Si mode = 1 -> Es la parte de arriba de la tabla
        // Si mode = 0 -> Es la parte central de la tabla
        // Si mode = -1 -> Es la parte inferior de la tabla

        // Esquina inicial
        switch(mode)
        {
            case 1:
                bar = ESQ_IZQ_SUP;
            break;

            case -1:
                bar = ESQ_IZQ_INF;
            break;

            default:
                bar = MID_EXT_IZQ;
        }
        System.out.print(bar);

        // Centro
        for(int i=0; i<9; i++)
        {

            System.out.print(LINE + LINE + LINE);

            switch(mode)
            {
                case 1:
                    bar = MID_EXT_DOWN;
                break;

                case -1:
                    bar = MID_EXT_UP;
                break;

                default:
                    bar = CROSS;
            }
            System.out.print(bar);


        }

        System.out.print(LINE + LINE + LINE);

        // Esquina final
        switch(mode)
        {
            case 1:
                bar = ESQ_DER_SUP;
            break;

            case -1:
                bar = ESQ_DER_INF;
            break;

            default:
                bar = MID_EXT_DER;
        }
        System.out.println(bar);

    }



    // Ejecución si elije el modo C
    public static void mostrarModo2(long num)
    {
        // Calculamos las cifras de num
        int cifras = numCifras(num);
        
        int digit = 0;
        double base;

        customBorders(1); // parte superior de la tabla

        while(num > 0 || cifras > 0) 
        {
            
             

            System.out.print(MID + " ");

            if(num == 0) // Caso especial de dígitos finales son ceros
            {
                digit = 0;
                System.out.print(digit); // Muestra la cifra que deseamos
            }
            else
            {
                base = Math.pow(10, cifras-1); 

                digit = (int) (num / base); // Obtenemos el dígito

                System.out.print(digit); // Muestra la cifra que deseamos
            
                num = num - (long)(digit * base); // Se elimina el dígito del número
            }

            cifras--; // Se decrementa una cifra

            System.out.print(" " + MID);

            barrasColores(digit);

            if(cifras != 0)
            {
                customBorders(0);
            }
        }

        customBorders(-1); // parte inferior de la tabla

    }


    // Programa
    public static void main(String[] args)
    {
        Scanner scanNum = new Scanner(System.in);

        // Leemos el número
        System.out.print("Introduzca un número: ");
        long num = scanNum.nextLong();

        if(num <= 0) // Solo se sigue si es mayor que cero
        {
            System.out.println("No se introdujo un número mayor que cero.");
        }
        else // Si es mayor que cero, se sigue
        {   
            // Leemos el modo de impresión
            System.out.print("Simple o en Color (escriba S o C): ");
            Scanner scanModo = new Scanner(System.in);
            String modo = scanModo.nextLine();
    
            switch(modo)
            {
                case "s": 
                    mostrarModo1(num);
                break;

                case "c":
                    mostrarModo2(num);
                break;
                    
                default:
                    System.out.println("No se introdujo 's' o 'c'");
            }

            scanModo.close();

        }

        scanNum.close();
    }
    
}
