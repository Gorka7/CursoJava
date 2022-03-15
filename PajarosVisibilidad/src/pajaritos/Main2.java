package pajaritos;

public class Main2 {

	public static void main(String[] args) {
		
		Piolin piolin2 = new Piolin("Masculino", 1, 10);
		Loro loro3 = new Loro("Hembra", 3, "N", "Azul");
		
		DatosPersonales noms = new DatosPersonales("Goku", "Alberto"); 
		Loro loro4 = new Loro("Masculino", 5, noms, "S", "Verde");
		System.out.println("-------Por Instancia Variable D.Pers-------");
		System.out.println("Sexo : " + loro4.getSexo());
		System.out.println("Edad : " + loro4.getEdad()); //
		System.out.println("Nombre Dueño : "+loro4.getNombres().getNombreDueno()); 
		System.out.println("Nombre Ave : " +loro4.getNombres().getNombreAve());
		System.out.println("Region : " +loro4.getRegion());
		System.out.println("Color : " +loro4.getColor());
		System.out.println("------------A traves de Instancia----------");
		System.out.println("Piolin :"); 
		piolin2.quienSoy(); 
		piolin2.altura();
		piolin2.setTamano(30);
		piolin2.altura();
		System.out.println("Loro :"); 
		loro3.quienSoy(); 
		// loro.deDondeEres();
		loro3.setRegion("S"); 
		loro3.deDondeEres();
		 
		
		Ave.numeroAvesCreadas();
				

	}

}
