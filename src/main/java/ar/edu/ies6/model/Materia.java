package ar.edu.ies6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Indexed;

import java.time.LocalDate;

@Component
@Entity
public class Materia {
    @Column
    private String nombre;
    @Column
    private String docenteACargo  ;
    @Column
    private String curso;
    @Column
    private String dificultad;
    @Column
    private String enfoque;
    @Column
    private String duracion;
    @Column
    private String tipoDeCursada;
    @Column
    private LocalDate fechaDeInicio ;
    @Id 
    private Integer codigo ;
    @Column(name="estado")
    private Boolean estado=true;

public Materia (){

}

    public Materia (String nombre,String docenteACargo,String curso,String dificultad,String enfoque,String duracion,String tipoDeCursada,LocalDate fechaDeInicio,Integer codigo,Boolean estado){
        this.nombre=nombre;
        this.docenteACargo=docenteACargo;
        this.curso=curso;
        this.dificultad=dificultad;
        this.enfoque=enfoque;
        this.duracion=duracion;
        this.tipoDeCursada=tipoDeCursada;
        this.fechaDeInicio=fechaDeInicio;
        this.codigo=codigo;
        this.estado=estado;

    }



public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDocenteACargo() {
    return docenteACargo;
}

public void setDocenteACargo(String docenteACargo) {
    this.docenteACargo = docenteACargo;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public String getDificultad() {
    return dificultad;
}

public void setDificultad(String dificultad) {
    this.dificultad = dificultad;
}

public String getEnfoque() {
    return enfoque;
}

public void setEnfoque(String enfoque) {
    this.enfoque = enfoque;
}

public String getDuracion() {
    return duracion;
}

public void setDuracion(String duracion) {
    this.duracion = duracion;
}

public String getTipoDeCursada() {
    return tipoDeCursada;
}

public void setTipoDeCursada(String tipoDeCursada) {
    this.tipoDeCursada = tipoDeCursada;
}

public LocalDate getFechaDeInicio() {
    return fechaDeInicio;
}

public void setFechaDeInicio(LocalDate fechaDeInicio) {
    this.fechaDeInicio = fechaDeInicio;
}

public Integer getCodigo() {
    return codigo;
}

public void setCodigo(Integer codigo) {
    this.codigo = codigo;
}

public Boolean getEstado() {
    return estado;
}

public void setEstado(Boolean estado) {
    this.estado = estado;
}
}