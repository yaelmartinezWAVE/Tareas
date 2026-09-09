package TareaTres;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JuegoDeVida {
    private Array2D cuadricula;
    private int filas;
    private int columnas;

    public JuegoDeVida(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.cuadricula = new Array2D(filas, columnas);
    }

    public void iniciarCSV(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int fila = 0;

            while ((linea = br.readLine()) != null && fila < filas) {
                String[] valores = linea.split(",");

                for (int columna = 0;
                     columna < valores.length && columna < columnas;
                     columna++) {

                    cuadricula.setItem(
                            fila,
                            columna,
                            Integer.parseInt(valores[columna].trim())
                    );
                }

                fila++;
            }

        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo.");
        }
    }

    private int contarVecinosVivos(int fila, int columna) {
        int vivos = 0;

        int[] cambiosFila = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] cambiosColumna = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nuevaFila = fila + cambiosFila[i];
            int nuevaColumna = columna + cambiosColumna[i];

            if (nuevaFila >= 0 && nuevaFila < filas &&
                    nuevaColumna >= 0 && nuevaColumna < columnas) {

                vivos += cuadricula.getItem(nuevaFila, nuevaColumna);
            }
        }

        return vivos;
    }

    public void calcularSiguienteGeneracion() {
        Array2D siguiente = new Array2D(filas, columnas);

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {

                int vecinos = contarVecinosVivos(fila, columna);
                int estado = cuadricula.getItem(fila, columna);

                if (estado == 1 && (vecinos == 2 || vecinos == 3)) {
                    siguiente.setItem(fila, columna, 1);

                } else if (estado == 0 && vecinos == 3) {
                    siguiente.setItem(fila, columna, 1);

                } else {
                    siguiente.setItem(fila, columna, 0);
                }
            }
        }

        cuadricula = siguiente;
    }

    public void imprimirTablero() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (cuadricula.getItem(fila, columna) == 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
