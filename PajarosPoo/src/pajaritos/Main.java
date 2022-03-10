package pajaritos;

public class Main {
	
	public static void main(String[] args) {

		Piolin piolin = new Piolin("M", 1, 10);
		Loro loro = new Loro("H", 3, "N", "Azul");
		
		System.out.println("Piolin :");
		piolin.quienSoy();
		//piolin.altura();
		piolin.tamano = 30;
		piolin.altura();
		
		System.out.println("Loro :");
		loro.quienSoy();
		//loro.deDondeEres();
		loro.region = "S";
		loro.deDondeEres();
		
		Ave.numeroAvesCreadas();
	}

}
