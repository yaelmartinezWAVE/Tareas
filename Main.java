import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayADT<Empleado> nomina = new ArrayADT<>(14);
        int totalEmpleados = 0;

        try {
            File archivo = new File("junio.dat");
            Scanner scanner = new Scanner(archivo);

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine() && totalEmpleados < nomina.longitud()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");

                String numero = datos[0];
                String nombres = datos[1];
                String paterno = datos[2];
                String materno = datos[3];
                int horasExtra = Integer.parseInt(datos[4]);
                double sueldoBase = Double.parseDouble(datos[5]);
                int anioIngreso = Integer.parseInt(datos[6]);

                Empleado emp = new Empleado(numero, nombres, paterno, materno, horasExtra, sueldoBase, anioIngreso);
                nomina.insertarElemento(totalEmpleados, emp);

                totalEmpleados++;
            }
            scanner.close();


            System.out.println("                 REPORTE DE EMPLEADOS Y SUELDOS AL MES                   ");

            for (int i = 0; i < totalEmpleados; i++) {
                Empleado actual = nomina.obtenerElemento(i);
                System.out.println(actual.toString());
            }


            if (totalEmpleados > 0) {
                Empleado empMayorAntiguedad = nomina.obtenerElemento(0);
                Empleado empMenorAntiguedad = nomina.obtenerElemento(0);

                for (int i = 1; i < totalEmpleados; i++) {
                    Empleado actual = nomina.obtenerElemento(i);

                    if (actual.getAntiguedad() > empMayorAntiguedad.getAntiguedad()) {
                        empMayorAntiguedad = actual;
                    }
                    if (actual.getAntiguedad() < empMenorAntiguedad.getAntiguedad()) {
                        empMenorAntiguedad = actual;
                    }
                }

                System.out.println("                REPORTE DE ANTIGÜEDAD  ");

                System.out.println("Trabajador con Mayor antigüedad: "
                        + empMayorAntiguedad.getNombreCompleto()
                        + " (" + empMayorAntiguedad.getAntiguedad() + " años)");

                System.out.println(" Trabajador con Menor antigüedad: "
                        + empMenorAntiguedad.getNombreCompleto()
                        + " (" + empMenorAntiguedad.getAntiguedad() + " años)");
            }
        }  catch (FileNotFoundException e) {
        System.out.println("Error: No se encontró el archivo de datos.");
        System.out.println("Asegúrate de que el archivo exista en la carpeta del proyecto.");
    }
    }
}
