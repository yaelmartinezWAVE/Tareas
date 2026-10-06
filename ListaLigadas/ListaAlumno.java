package ListaLigadas;

public class ListaAlumno {

    public static void main(String[] args) {

                ListaLigadaADT<Alumno> lista = new ListaLigadaADT<>();

                System.out.println("\n¿La lista está vacía? " + lista.Vacia());

                System.out.println(" Lista");
                Alumno a1 = new Alumno("Diego", "Metodos");
                Alumno a2 = new Alumno("Diana", "Estructura de Datos");
                Alumno a3 = new Alumno("Toñito", "Redes");

                lista.agregar(a1);
                lista.agregar(a2);
                lista.agregar(a3);
                lista.transversal();
                System.out.println("Tamaño: " + lista.getTamanio());


                System.out.println("\nActualizar");
                Alumno a4 = new Alumno( "Joana" ,  "musica");
                lista.actualizar(a2 , a4  );
                lista.transversal();
                System.out.println("\nTamaño: " + lista.getTamanio());


                System.out.println("\nAgregar");
                Alumno a5 = new Alumno ("Noria" , "Diseño Grafico");
                lista.agregar(a5);
                lista.transversal();
                System.out.println("\nTamaño: " + lista.getTamanio());


                 System.out.println("\nAgregar DespuesDE");
                 Alumno a6 = new Alumno ("Alison" , "Emprendimiento");
                 lista.agregarDespuesDe(a3,a6);
                 lista.transversal();
                 System.out.println("\nTamaño: " + lista.getTamanio());


                System.out.println("Buscar" + a6);
                 lista.Buscar(a6);


                System.out.println("\n Agregar al inicio");
                Alumno aInicio = new Alumno("Carlos", "Ecuaciones");
                lista.agregarAlinicio(aInicio);
                lista.transversal();
                System.out.println("\n Tamaño final: " + lista.getTamanio());


                System.out.println(" \nAgregar al final");
                Alumno a7 = new Alumno ("Rodrigo" , "Electricidad y magnetismos");
                lista.agregarAlfinal(a7);
                lista.transversal();
                System.out.println("\nTamaño: " + lista.getTamanio());


                System.out.println(" \nEliminar el primero");
                lista.eliminarPrimero();
                lista.transversal();
                System.out.println("\nTamaño: " + lista.getTamanio());


                System.out.println(" \nElimar al Final");
                lista.eliminarElFinal();
                lista.transversal();
                System.out.println("\nTamaño: " + lista.getTamanio());






    }
        }







