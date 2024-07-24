package main;

import java.util.Map;
import java.util.HashMap;

public class Ejercicios {
    

    public static Map<String, Integer> contarFrecuenciaDePalabras (String text){



 
    }

    public static boolean verificarCaracteresUnicos (String input){

        //ARREGLO CHAR
        char [] caracteres= input.toCharArray();
        //BOOLEAN PARA VERIFICAR SI SON UNICOS LOS CARACTERES O NO
        boolean unico = true;
        //BARRIDO
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = i+1; j < caracteres.length; j++) {
                //SI SE CUMPLE ESA CONDICION UNICO SERA FALSO
                if (caracteres[i] == caracteres[j]) {
                    unico = false;
                    }
                    

                }
            }
            return unico;
        }



    }



    


