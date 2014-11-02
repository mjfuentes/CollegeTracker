package rockapps.progresofacultad.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrera {

    private String universidad;
    private String nombre;
    private Integer cantidadSemestres;
    private Map<Integer,List<Materia>> materias;
    private List<Materia> listaMaterias;

    public Carrera(Integer duracionEnSemestres){
        materias = new HashMap<Integer, List<Materia>>();
        listaMaterias = new ArrayList<Materia>();
        cantidadSemestres = duracionEnSemestres;
        for (int i=1;i<=cantidadSemestres; i++){
            materias.put(i,new ArrayList<Materia>());
        }
    }

    public void agregarMateria(Integer semestre, Materia materia){
        materias.get(semestre).add(materia);
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }
}
