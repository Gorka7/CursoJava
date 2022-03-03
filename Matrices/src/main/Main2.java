package main;

public class Main2 {

	public static void main(String[] args) {

		// Array Bidimensionales Simulando una Tabla
		// [Filas],[Columnas]
		String[][] matriz = new String[3][3];

		matriz[0][0] = "Fila1Columna1 ";
		matriz[0][1] = "Fila1Columna2 ";
		matriz[0][2] = "Fila1Columna3 ";


		matriz[1][0] = "Fila2Columna1 ";
		matriz[1][1] = "Fila2Columna2 ";
		matriz[1][2] = "Fila2Columna3 ";
		
		matriz[2][0] = "Fila3Columna1 ";
		matriz[2][1] = "Fila3Columna2 ";
		matriz[2][2] = "Fila3Columna3 ";


		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}

	}

}
