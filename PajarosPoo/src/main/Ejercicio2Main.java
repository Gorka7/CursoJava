package main;

public class Ejercicio2Main {

	public static void main(String[] args) {

		Piolin piolin = new Piolin("Hembra", 1, 15, 5);
		Loro loro = new Loro("Hembra", 3, "N", "Azul");

		System.out.println("Piolin : ");
		piolin.quienSoy();
		// piolin.altura();
		// System.out.println(piolin.tamanoReal);
		piolin.tamanoReal = 30;
		piolin.altura();
		// System.out.println(piolin.tamanoReal);

		System.out.println("Loro : ");
		loro.region = "S";
		loro.deDondeEres();

		Ave.numeroAvesCreadas();

	}

}
