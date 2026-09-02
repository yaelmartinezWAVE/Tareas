public class Empleado {

    private String numero;
    private String nombres;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;

    public Empleado(String numero, String nombres, String paterno, String materno,
                      int horasExtra, double sueldoBase, int anioIngreso) {
        this.numero = numero;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }
    public int getAntiguedad() {
        return 2026 - this.anioIngreso;
    }

    public double calcularSueldoTotal() {
        double pagoExtra = this.horasExtra * 276.5;
        double prestacion = this.sueldoBase * (this.getAntiguedad() * 0.03);
        return this.sueldoBase + pagoExtra + prestacion;
    }

    public String getNombreCompleto() {
        return nombres + " " + paterno + " " + materno;
    }

    @Override
    public String toString() {
        return "ID: " + numero + " Nombre: " + getNombreCompleto() + " Antigüedad: " + getAntiguedad() + " Años - Sueldo Total: $ " + calcularSueldoTotal();
    }
}
















