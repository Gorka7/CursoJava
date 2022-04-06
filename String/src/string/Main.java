package string;

public class Main {

	public static void main(String[] args) {

		String cadena = "Me gustaria ser pirata";
		/*
		 * Comparar si la Cadena "Me gustaria ser pirata" es igual (==) a Alberto Para
		 * comparar utilizamos "equalsIgnoreCase" para signorar las Mayus o no O ||
		 * equals
		 */

		System.out.println("**1.-Comparacion**");
		if (cadena.equals("Alberto")) {
			System.out.println("La cadena es igual a Alberto");
		} else {
			System.out.println("La cadena es diferente a Alberto");
		}
		System.out.println("");
		System.out.println("**2.-Separar Por Caracteres**");
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		System.out.println("");
		System.out.println("**3.-Quitar  espacios de la Izquird. y Derech.(Ejmp. '  Me gustaria ser pirata  ')**");
		String cadena2 = "  Me gustaria ser pirata   ";
		System.out.println(cadena2.trim());
		System.out.println("");
		System.out.println("**4.-Quitar espacios entre Letras**");
		String resultado = "";

		//Me gustaria ser pirata
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				resultado = resultado + cadena.charAt(i);
			}
		}
		System.out.println(resultado);
		System.out.println("");
		System.out.println("**5.-Concatenar 2 Strings**");
		String cadenaConcat = cadena.concat(resultado);
		System.out.println(cadenaConcat);
		System.out.println("");
		System.out.println("**6.-Palindromo**");
		System.out.println(esPalindromo("Alberto"));
		System.out.println(esPalindromo("Adán no cede con Eva y Yavé no cede con nada.")); // 17
		System.out.println("");


		// "me gustaria ser pirata"
		System.out.println("**7.-Obtener Caracteres Desde una poscion Incial , hasta una Final(-1)");
		System.out.println(cadena);
		System.out.println(cadena.substring(3, 6));
		System.out.println("");
		System.out.println("**8.-Indice**");
		System.out.println(cadena.indexOf("a"));
		
		
		/*String cadenaSplit = "Me.gustaria.ser.pirata";
		String[] arrayCadena = cadenaSplit.split(".");
		String cadenaSplit1 = arrayCadena[1];
		System.out.println(cadenaSplit1);*/

	}

	public static boolean esPalindromo(String cadena) {

		String cadenaSoloLetras = "";
		// "Alberto"
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ' && cadena.charAt(i) != ',' && cadena.charAt(i) != '.') {
				cadenaSoloLetras = cadenaSoloLetras + cadena.charAt(i);
			}
		}

		cadenaSoloLetras = cadenaSoloLetras.replaceAll("á", "a");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("é", "e");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("í", "i");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("ó", "o");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("ú", "u");

		String cadenaAlReves = "";
		for (int i = cadenaSoloLetras.length() - 1; i >= 0; i--) {
			cadenaAlReves = cadenaAlReves + cadenaSoloLetras.charAt(i);
			// otreblA
		}

		if (cadenaSoloLetras.equalsIgnoreCase(cadenaAlReves)) {
			return true;
		} else {
			return false;
		}

	}

}
