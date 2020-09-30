class Main {

    static void imprimirMensaje(String mensaje){
      System.out.println(mensaje);
    }
    static void imprimirSeparador(){
        System.out.println("+======================================================+");
    }
    static void imprimirPie(){
        imprimirSeparador();
        imprimirMensaje("(c) EDCD 2020");
    }
    static void imprimirFrases(){
        imprimirMensaje("  "+ "1.- Si quieres aprender a programar, programa, programa y programa");
        imprimirMensaje("  "+ "2.- Todo aprendizaje requiere esfuerzo y dedicación");
        imprimirMensaje("  "+ "3.- Todo inicia con un Hello Word ");
        imprimirMensaje("  "+ "4.- Los programadores son los brazos de las máquinas ");
        imprimirMensaje("  "+ "5.- La persistencia tarde o temprano vencera a la inteligencia ");
        imprimirMensaje("  "+ "6.- Solo se pueden conectar los puntos hacia atras ");
    }
    static void imprimirEncabezado(){
        imprimirMensaje("Bienvenidos al Fasinante mundo de la Programacion");
        imprimirMensaje("Lenguajes de programación Java con NetBeans");
        imprimirSeparador();
    }

  public static void main(String[] args) {
    imprimirEncabezado();
    imprimirSeparador();
    imprimirFrases();
    imprimirSeparador();
    imprimirPie();
  }
}