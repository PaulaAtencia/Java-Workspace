public class t4_12 {
  public static void main(String[] args) {
    int puntos = 0;
    String r = "\033[31m";
    String v = "\033[32m";
    String c = "\033[36m";
    String b = "\033[37m";
    /* Empieza */
    System.out.println(c+"\n CUESTIONARIO DE 10 PREGUNTAS:\n");
    //Primera
    System.out.println(" 1) ¿Qué etiqueta de HTML usarías para destacar un texto?");
    System.out.println(b+"a) <p>");
    System.out.println("b) <div>");
    System.out.println("c) <strong>");
    String respuesta = System.console().readLine(); 
    if (respuesta.equals("c")) {
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Segunda
    System.out.println(c+"\n 2) ¿Cuál NO es un tipo de Lenguaje de Programación?");
    System.out.println(b+"a) Alto Nivel");
    System.out.println("b) Medio Nivel");
    System.out.println("c) Bajo Nivel");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Tercera
    System.out.println(c+"\n 3) ¿En qué sistema de numeración pondrías un color en CSS?");
    System.out.println(b+"a) Hexadecimal");
    System.out.println("b) Binario");
    System.out.println("c) Duodeno");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Cuarta
    System.out.println(c+"\n 4) ¿Qué es una EPI?");
    System.out.println(b+"a) Equipo de Protección Individual");
    System.out.println("b) Equipo de Protección Internacional");
    System.out.println("c) Equipo de Precaución Individual");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Quinta
    System.out.println(c+"\n 5) ¿Para que sirve Java?");
    System.out.println(b+"a) Es una página web");
    System.out.println("b) Desarrollo de programas y aplicaciones");
    System.out.println("c) Para realizar la gestión de datos");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Sexta
    System.out.println(c+"\n 6) ¿Cuál de estas es una organización de ficheros en Base de Datos?");
    System.out.println(b+"a) Aleatoria Secuencial");
    System.out.println("b) Aleatoria Indexada");
    System.out.println("c) Secuencial Indexada");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Séptima
    System.out.println(c+"\n 7) ¿Qué es SQL?");
    System.out.println(b+"a) Es un lenguaje de programación");
    System.out.println("b)  Es un lenguaje gestor para el manejo de la información en las bases de datos relacionales");
    System.out.println("c) Es una página web");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Octava
    System.out.println(c+"\n 8) ¿Te está gustando el cuestionario?");
    System.out.println(b+"a) Sí");
    System.out.println("b) No");
    puntos++;
    respuesta = System.console().readLine();
    if (respuesta.equals("a")){
    System.out.println("¡Muchas gracias!");
    } else {
    System.out.println("¡A mi cuestionario tampoco le estás gustando tú.");
    }
    //Novena
    System.out.println(c+"\n 9) ¿Para qué se utiliza HTML?");
    System.out.println(b+"a) Para el decreto del libro de FOL");
    System.out.println("b) Para hacer páginas web entre otras cosas");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Décima
    System.out.println(c+"\n 10) ¿Qué es una placa base?");
    System.out.println(b+"a) Tarjeta de circuito impreso a la que se conectan los componentes que constituyen la computadora ");
    System.out.println("b) Es el espacio de almacenamiento de datos extremadamente rápido y temporal ");
    System.out.println("c) Componente electrónico que se encarga de procesar la información que le llega al dispositivo para, posteriormente, mostrarla al usuario visualmente mediante un monito");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")){
    puntos++;
    System.out.println(v+"¡Respuesta correcta!");
    } else {
    System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Puntuación
    System.out.println(b+"\n La puntuación que ha sacado en este test es de: " + puntos);
    if (puntos < 5){
    System.out.println("¡Uf!, deberías estudiar un poco más.");
    } else if (puntos < 7){
    System.out.println("Está bastante bien, pero seguro que puedes hacerlo mejor");
    } else if (puntos <= 10){
    System.out.println("¡Genial, sigue así!");
    }
}
}