package main;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sabiendo los valores que tendra
		String[] DiasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes",
				"Sabado","Domingo"};
		
		//Sin conocer los valores
		String[] ListaNombres = new String [10];
		
		//Acceder a la ubicación del Array
		System.out.println(DiasSemana[2]);
		
		//Obtener Posiciones del Array
		System.out.println(DiasSemana.length);
		
		//Conocer Indice
		int UltimaPosicion = DiasSemana.length -1;
		System.out.println(DiasSemana[UltimaPosicion]);
		
		//Recorres un Array entero y Mostrar sus Valores
		for (int i=0;i<DiasSemana.length;i++) {
			System.out.println(DiasSemana[i]);
		}
		//Recorres un Array entero y Mostrar sus Valores al reves
		for (int i=DiasSemana.length-1;i>=0;i--) {
			System.out.println(DiasSemana[i]);
		}
		
		//Dar Valores al Array
		ListaNombres[0] = "Gaizka";
		ListaNombres[1] = "Gorka";
		
	}

}
