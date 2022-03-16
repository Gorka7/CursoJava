package persona;

import intefaces.Hablador;

public class Alumno extends Persona implements Hablador {

	private String carrera,curso;

	public Alumno(String nombre, int edad, String carrera, String curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy un Alumno y se hablar");
		System.out.print("Nombre: " + getNombre());
		System.out.println(" Edad: "+ getEdad());
		System.out.print("Carrera: " +carrera);
		System.out.println(" Curso: " +curso);
		System.out.println("");
		
	}

}
