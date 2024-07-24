package main;

import java.util.HashMap;
import java.util.List;


public class EstudianteController {

  
    public HashMap<String, List<Estudiante>> procesarEstudiantes (Estudiante [] estudiantes){

      //CREACION DEL HASH MAP
      HashMap <String, List<Estudiante>> mapa= new HashMap<>();
      //BARRIDO DE LOS NOMBRES DE LOS ESTUDIANTES
      for (Estudiante estudiante: estudiantes) {
           String nombre= estudiante.getNombre();

           if (mapa.containsKey(nombre)){

            List<Estudiante> lista= mapa.get(nombre);
            lista.add(estudiante);

            mapa.put(nombre, lista);

            }else{
                List<Estudiante> lista= null;
                lista.add(estudiante);
                mapa.put(nombre, lista);
                }

      }
    
      return mapa;

    }


    private String obtenerCategoria (int calificacion){
    
        String categoria="";
        if (calificacion>=90 && calificacion<=100){
            categoria="A";
        } else if (calificacion>=80 && calificacion<90){
             categoria= "B";
        } else if (calificacion>=70 && calificacion<80){
             categoria= "C";
        } else if (calificacion>=60 && calificacion<70){
            categoria = "E";
        } else {
            categoria= "F";
        }
            
     return categoria;
             
    }


}

    



