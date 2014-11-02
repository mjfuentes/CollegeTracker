package rockapps.progresofacultad.Model;

import java.util.Date;
import java.util.List;


public class Materia {
    private String carrera;
    private String codigo;
    private String nombre;
    private Integer semestre;
    private List<String> correlativas;
    private EstadoMateria estado;
    private Integer nota;
    private Date fechaCursada;
    private Date fechaFinal;

    public Materia(String carrera, String codigo, String nombre, Integer semestre, List<String> correlativas){
        this.carrera = carrera;
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.correlativas = correlativas;
        this.estado = EstadoMateria.NO_CURSADA;
    }

    public Materia(String carrera, String codigo, String nombre, Integer semestre, List<String> correlativas, EstadoMateria estado, Integer nota, Date fechaCursada, Date fechaFinal){
        this.carrera =carrera;
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.correlativas = correlativas;
        this.estado = EstadoMateria.NO_CURSADA;
        this.estado = estado;
        this.nota = nota;
        this.fechaCursada = fechaCursada;
        this.fechaFinal = fechaFinal;
    }

    public void aprobarCursada(Date date){
        this.estado = EstadoMateria.CURSADA;
        this.fechaCursada = date;
    }

    public void aprobarFinal(Integer nota, Date date){
        this.estado = EstadoMateria.APROBADA;
        this.nota = nota;
        this.fechaFinal = date;
    }

//    private List<Materia> cargarCorrelativas(List<String> codigos){
//        List<Materia> materias = new ArrayList<Materia>();
//        for (String codigo :codigos){
//            materias.add(CarrerasLoader.getMateria(carrera,codigo));
//        }
//        return materias;
//    }

    public List<String> getCorrelativas() {
        return correlativas;
    }

    public EstadoMateria getEstado() {
        return estado;
    }

    public void setEstado(EstadoMateria estado) {
        this.estado = estado;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Date getFechaCursada() {
        return fechaCursada;
    }

    public void setFechaCursada(Date fechaCursada) {
        this.fechaCursada = fechaCursada;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getSemestre() {
        return semestre;
    }
}
