package string;


public class Prueba {

	public static void main(String[] args) {

		String cadena = "Gorka";
		/*System.out.println("**7.-Obtener Caracteres Desde una poscion Incial , hasta una Final(-1)");
		System.out.println(cadena);
		System.out.println(cadena.substring(0,2));
		System.out.println("");*/
		
		for (int i = 0; i<cadena.length();i++ ) {
			String cadenaoculta=cadena.substring(0,i);
			String cadenaoculta2= cadena.substring(i+1);
			System.out.println(cadenaoculta);
			System.out.println("---");
			System.out.println(cadenaoculta2);
		}

	}

}
