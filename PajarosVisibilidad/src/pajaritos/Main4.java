package pajaritos;

public class Main4 {

	public static void main(String[] args) {
		
		/* • Crear un array de 3 Piolines y se inicializarán todos sus Datos */
		Piolin[] pio = new Piolin[3];

		Piolin piolin = new Piolin("Masculino", 5, 11);
		Piolin piolin2 = new Piolin("Hembra", 10, 5);
		Piolin piolin3 = new Piolin("Masculino", 15, 7);
		
		pio [0] = piolin;
		pio [1] = piolin2;
		pio [2] = piolin3;

		/* •Asignar un nuevo nombre de animal y nuevo nombre de dueño al
			primero de los tres Piolines creados
		 */
		DatosPersonales datosPiolin = new DatosPersonales("Pio", "Gorka");
		
		//Asignarselo
		pio[0].setNombres(datosPiolin);
		
		/*Si queremos añadir Datos Personales(Nombre Mascota y Dueño)
		 * a otro instancia del Array tendriamos que volver a ejecutar
		 * el siguiente codigo "pio[0].setNombres(datosPiolin);"
		 * Cambiando el valor de pio a pio[1] o [2]
		 */
		
		// • Hacer cantar al loro y a los tres Piolines
		for (int i=0; i<pio.length;i++) {
			pio[i].cantar();
		}

		System.out.println("**Añadir Nombre Dueño y Ave al valor 0 del Array**");
		System.out.println("**   Aparate de sus datos en la Instancia.********");
		System.out.print("Sexo : "+pio[0].getSexo()+" ");
		System.out.print("Edad : "+pio[0].getEdad()+" ");
		System.out.print("Nombre Ave :"+pio[0].getNombres().getNombreAve()+" ");
		System.out.println("Nombre Dueño : "+pio[0].getNombres().getNombreDueno());
		
		Ave.numeroAvesCreadas();

	}
	
	

}
