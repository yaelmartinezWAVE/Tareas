package TREs;

public class Main {
    public static void main(String[] args) {
        // Crear el tablero de 8x8
        Array2D tablero = new Array2D(8, 8);

        // --- PIEZAS NEGRAS ---
        // Fila 0: Torre, Caballo, Alfil, Reina, Rey, Alfil, Caballo, Torre
        tablero.setItem(0, 0, '\u265C'); // Torre
        tablero.setItem(0, 1, '\u265E'); // Caballo
        tablero.setItem(0, 2, '\u265D'); // Alfil
        tablero.setItem(0, 3, '\u265B'); // Reina
        tablero.setItem(0, 4, '\u265A'); // Rey
        tablero.setItem(0, 5, '\u265D'); // Alfil
        tablero.setItem(0, 6, '\u265E'); // Caballo
        tablero.setItem(0, 7, '\u265C'); // Torre

        // Fila 1: Peones negros
        for (int j = 0; j < 8; j++) {
            tablero.setItem(1, j, '\u265F');
        }

        // --- CASILLAS VACÍAS ---
        // Filas 2 a 5: Espacios en blanco
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                // Rellenar con un punto o espacio para identificar las casillas
                tablero.setItem(i, j, ' ');
            }
        }

        // --- PIEZAS BLANCAS ---
        // Fila 6: Peones blancos
        for (int j = 0; j < 8; j++) {
            tablero.setItem(6, j, '\u2659');
        }

        // Fila 7: Torre, Caballo, Alfil, Reina, Rey, Alfil, Caballo, Torre
        tablero.setItem(7, 0, '\u2656'); // Torre
        tablero.setItem(7, 1, '\u2658'); // Caballo
        tablero.setItem(7, 2, '\u2657'); // Alfil
        tablero.setItem(7, 3, '\u2655'); // Reina
        tablero.setItem(7, 4, '\u2654'); // Rey
        tablero.setItem(7, 5, '\u2657'); // Alfil
        tablero.setItem(7, 6, '\u2658'); // Caballo
        tablero.setItem(7, 7, '\u2656'); // Torre

        // --- IMPRIMIR EL TABLERO ---
        imprimirTablero(tablero);
    }

    private static void imprimirTablero(Array2D tablero) {

        for (int i = 0; i < tablero.getFilas(); i++) {
            System.out.print((8 - i) + " "); // Número de fila (8 a 1)

            for (int j = 0; j < tablero.getColumnas(); j++) {
                // Se extrae el entero y se convierte a carácter para verlo como pieza
                char pieza = (char) tablero.getItem(i, j);
                System.out.print(pieza + " ");
            }

            System.out.println();
        }

    }
}

