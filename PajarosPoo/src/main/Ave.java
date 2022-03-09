package main;

public class Ave {

	public String sexo;
	public int edad;

	public static int numeroAvesCreadas = 0;

	public Ave(String sexo, int edad) {

		this.sexo = sexo;
		this.edad = edad;

		Ave.numeroAvesCreadas++;
	}

	public static void numeroAvesCreadas() {
		System.out.println("El numero de Aves creadas es : " + numeroAvesCreadas);
	}

	public void quienSoy() {
		System.out.println("Sexo del Ave: "+ sexo);
		System.out.println("Edad del Ave: "+ edad+" año(s)");
	}

}
