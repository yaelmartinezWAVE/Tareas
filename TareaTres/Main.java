package TareaTres;

public class Main {
    public static void main(String[] args) {

        int filas = 10;
        int columnas = 10;

        JuegoDeVida juego = new JuegoDeVida(filas, columnas);

        System.out.println("Generacion 0 (Inicial)");

        juego.iniciarCSV("Generacion.csv");
        juego.imprimirTablero();

        for (int generacion = 1; generacion <= 10; generacion++) {
            System.out.println("Generacion " + generacion + ":");

            juego.calcularSiguienteGeneracion();
            juego.imprimirTablero();
        }
    }
}




