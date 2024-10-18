package ar.edu.ies6.model;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

import ar.edu.ies6.util.Carrera;
import ar.edu.ies6.util.Curso;

@Component
public class Alumno {
    private String dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private Carrera carrera;
    private Curso curso;
 
    //constructor por defecto
 public Alumno() {
	// TODO Auto-generated constructor stub
}
	public Alumno(String dni, String apellido, String nombre, LocalDate fechaNacimiento, String domicilio,
			Carrera carrera, Curso curso) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.carrera = carrera;
		this.curso = curso;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public int calcularEdad() {
	    return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
	
@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", domicilio=" + domicilio + ", carrera=" + carrera + ", curso=" + curso
				+ ", calcularEdad()=" + calcularEdad() + "]";
	}

	public void mostrarDatos() {
	        System.out.println("DNI: " + this.dni);
	        System.out.println("Apellido: " + this.apellido);
	        System.out.println("Nombre: " + this.nombre);
	        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
	        System.out.println("Domicilio: " + this.domicilio);
	        System.out.println("Carrera: " + this.carrera);
	        System.out.println("Curso: " + this.curso);
	        System.out.println("Edad: " + calcularEdad());
}
}	