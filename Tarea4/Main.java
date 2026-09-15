package Tarea4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Materias materias = new Materias();

        materias.MateriasInscriptas("ED");
        materias.MateriasInscriptas("IA");
        materias.MateriasInscriptas("Redes");
        materias.MateriasInscriptas("Computo en la nube");

        materias.Ana("ED");
        materias.Ana("IA");
        materias.Ana("IA");
        materias.Ana("Redes");


        materias.Juan("ED");
        materias.Juan("ED");
        materias.Juan("IA");
        materias.Juan("ED");


        materias.Pepe("IA");
        materias.Pepe("ED");
        materias.Pepe("Redes");
        materias.Pepe("Redes");



        System.out.println("Materias a inscribir" + materias.getMateriasInscritas());
        System.out.println(" Materias a inscritas de Ana " + materias.getAna());
        System.out.println(" Materias a inscritas de Juan" + materias.getJuan());
        System.out.println(" Materias a inscritas de Pepe" + materias.getPepe());

        System.out.println("\nMaterias duplicadas:");

        for (String materia : materias.materiasDuplicadas()) {
            System.out.println(materia);


        }

    }
}


