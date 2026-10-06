package ListaLigadas;

public class Alumno {

    private String Alumno;
    private String clse;

    public Alumno(String Alumno, String clase) {
        this.Alumno = Alumno;
        this.clse = clase;

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
        return "Alumno{" + "Alumno='" + Alumno + '\'' + ", clse='" + clse + '\'' + '}';
    }
}