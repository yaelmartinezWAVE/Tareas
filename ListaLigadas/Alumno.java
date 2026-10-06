package ListaLigadas;

public class Alumno {

    private String Alumno;
    private String clse;
    private String Carrera;

    public Alumno(String Alumno, String clase, String Carrera) {
        this.Alumno = Alumno;
        this.clse = clase;
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String alumno) {
        Alumno = alumno;
    }

    public String getClse() {
        return clse;
    }

    public void setClse(String clse) {
        this.clse = clse;
    }


    @Override
    public String toString() {
        return "Alumno{" + "Alumno='" + Alumno + '\'' + ", clse='" + clse + '\'' + ", Carrera='" + Carrera + '\'' + '}';
    }
}