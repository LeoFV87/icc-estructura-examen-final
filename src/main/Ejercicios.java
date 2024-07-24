package main;

import java.util.Map;
import java.util.HashMap;

public class Ejercicios {
    

    public static Map<String, Integer> contarFrecuenciaDePalabras (String text){
        //CREACION DEL HASH MAP FRECUENCIA
        Map<String, Integer> frecuencia = new HashMap<String, Integer>();
        //ARREGLO STRING
        String[] palabras = text.split(" ");

        //BARRIDO DE LAS PALABRAS
        for (String palabra : palabras) {
            //USO DE CONTAINS KEY DE HASH MAP
            if (frecuencia.containsKey(palabra)) {
                //USO DE PUT
                frecuencia.put(palabra, frecuencia.get(palabra) + 1);

                } else {
                    frecuencia.put(palabra, 1);
                    }
                }
                //RETORNAR EL HASH MAP
                    return frecuencia;
    }

    public static boolean verificarCaracteresUnicos (String input){

        //ARREGLO CHAR
        char [] caracteres= input.toCharArray();
        //BOOLEAN PARA VERIFICAR SI SON UNICOS LOS CARACTERES O NO
        boolean unico = true;
        //BARRIDO
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = i+1; j < caracteres.length; j++) {
                //VERIFICAR QUE LOS CARACTERES NO SEAN LOS MISMOS
                if (caracteres[i] == caracteres[j]) {
                    //SI SE CUMPLE ESA CONDICION UNICO SERA FALSO
                    unico = false;
                    }
                    

                }
            }
            return unico;
        }



    }



    


