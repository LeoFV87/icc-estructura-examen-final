package test;

import org.junit.jupiter.api.Test;

//import main.controllers.EstudianteController;
//import main.models.Estudiante;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.EstudianteController;
import main.Estudiante;

public class EstudianteControllerTest {

    @Test
    public void testProcesarEstudiantes() {
        Estudiante[] estudiantes = {
                new Estudiante("Juan", 85),
                new Estudiante("María", 92),
                new Estudiante("Pedro", 78),
                new Estudiante("Ana", 88),
                new Estudiante("Luis", 75)
        };

        EstudianteController controlador = new EstudianteController();
        Map<String, List<Estudiante>> categorias = controlador.procesarEstudiantes(estudiantes);

        assertEquals(1, categorias.get("A").size());
        assertEquals(2, categorias.get("B").size());
        assertEquals(2, categorias.get("C").size());
    }
}
