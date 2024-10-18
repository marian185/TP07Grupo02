package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Docente {
	    private double dni;
	    private String apellido;
	    private String nombre;
	    private LocalDate fechaNacimiento;
	    private String domicilio;
	    private String especialidad;
	    private String legajo;
	    
public Docente() {
		
	}
public Docente(double dni, String apellido, String nombre, LocalDate fechaNacimiento, String domicilio,String espececialidad, String legajo) {
			this.dni = dni;
			this.apellido = apellido;
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
			this.domicilio = domicilio;
			this.especialidad = espececialidad;
			this.legajo = legajo;
		}

		public double getDni() {
			return dni;
		}

		public void setDni(double dni) {
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

		public String getEspecialidad() {
			return especialidad;
		}

		public void setEspececialidad(String especialidad) {
			this.especialidad = especialidad;
		}

		public String getLegajo() {
			return legajo;
		}

		public void setCurso(String legajo) {
			this.legajo = legajo;
		}
		
		public int calcularEdad() {
		    return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	    }
		
	@Override
		public String toString() {
			return "Alumno [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
					+ fechaNacimiento + ", domicilio=" + domicilio + ", especialidad=" + especialidad + ", legajo=" + legajo
					+ ", calcularEdad()=" + calcularEdad() + "]";
		}

		public void mostrarDatos() {
		        System.out.println("DNI: " + this.dni);
		        System.out.println("Apellido: " + this.apellido);
		        System.out.println("Nombre: " + this.nombre);
		        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		        System.out.println("Domicilio: " + this.domicilio);
		        System.out.println("Especialidad: " + this.especialidad);
		        System.out.println("Legajo: " + this.legajo);
		        System.out.println("Edad: " + calcularEdad());
	}
}
