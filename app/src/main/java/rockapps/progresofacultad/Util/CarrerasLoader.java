package rockapps.progresofacultad.Util;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rockapps.progresofacultad.Model.Carrera;
import rockapps.progresofacultad.Model.Materia;

public class CarrerasLoader {

    private static Map<String,Carrera> carreras;
    private static List<Carrera> carrerasEnCurso;
    private static Map<Pair<String, String>, Materia> materias;
    private static Map<Pair<String,String>, Materia> materiasEnCurso;

    public static void CargarCarreras(){
        carreras = new HashMap<String,Carrera>();
    }

    public static Carrera getCarrera(String codigo){
        return carreras.get(codigo);
    }
//
//    public static Materia getMateria(String carrera, String codigo){
//        return materias.get(new Pair<String, String>(carrera,codigo));
//    }
//
//    public static Materia getMateriaEnCurso(String carrera, String codigo){
//        return materiasEnCurso.get(new Pair<String, String>(carrera,codigo));
//    }
//
//    public static void aprobarFinalMateriaEnCurso(String carrera, String codigo, Integer nota, Date date){
//         materiasEnCurso.get(new Pair<String, String>(carrera,codigo)).aprobarFinal(nota, );
//    }
//
//    public static void aprobarCursadaMateriaEnCurso(String carrera, String codigo, Integer nota){
//         materiasEnCurso.get(new Pair<String, String>(carrera,codigo)).aprobarCursada();
//    }

}
