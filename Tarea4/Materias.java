package Tarea4;

import java.util.HashSet;
import java.util.Set;

public class Materias {


     private Set<String> MateriasInscritas;
     private Set<String> Ana;
     private Set<String> Juan;
     private Set<String> Pepe;

     public Materias (){
        MateriasInscritas = new HashSet<>();
         Ana = new HashSet<>();
         Juan = new HashSet<>();
         Pepe = new HashSet<>();

     }
   public void MateriasInscriptas(String materia){
         MateriasInscritas.add(materia);
   }

   public void Ana(String materia){

         Ana.add(materia);
     }

   public void Juan(String materia){
         Juan.add(materia);
   }

   public void Pepe (String materia){
         Pepe.add(materia);
   }


   public Set<String> materiasDuplicadas(){

       Set<String> duplicadas = new HashSet<>();

       for (String materia : Ana) {

           if (Juan.contains(materia) != Pepe.contains(materia)) {
               duplicadas.add(materia);
           }
       }

       for (String materia : Juan) {

           if (Pepe.contains(materia)) {
               duplicadas.add(materia);
           }
       }

       return duplicadas;
   }

   public Set<String> getMateriasInscritas(){
         return MateriasInscritas;
     }
     public Set<String> getAna(){
         return Ana;
     }
     public Set<String> getJuan(){
         return Juan;

     }
     public Set<String> getPepe() {
         return Pepe;





     }

}












