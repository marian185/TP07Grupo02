package ar.edu.ies6.model;

public class Materia {
	//atributos
	
		private String nombre;
		private String codigo;
		private int calificacion;
		private String profesor;
		
		public Materia() {
			// TODO Auto-generated constructor stub
		}
		//constructor
		public Materia(String nombre, String codigo, int calificacion, String profesor) {
			this.nombre = nombre;
			this.codigo = codigo;
			this.calificacion = calificacion;
			this.profesor = profesor;
			}
		//getters y setterrs
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre (String nombre) {
			this.nombre = nombre;
		}
		public String getCodigo() {
			return codigo;
		}
		
		public void setCodigo (String codigo) {
			this.codigo = codigo;
		}
		public int getCalificacion() {
			return calificacion;
		}
		
		
		public void setCalificacion (int calificacion) {
			this.calificacion = calificacion;
		}
		public String getProfesor() {
			return profesor;
		}
		
		public void setProfesor (String profesor) {
			this.profesor = profesor;
		}
		@Override
		public String toString() {
			return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", calificacion" + calificacion + ", profesor=" + profesor
					+ "]";
		}

	}
		
