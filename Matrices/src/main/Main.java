package main;

public class Main {
	
	public static void main(String[] args) {
		
		//Array Bidimensionales  		Simulando una Tabla
										//[Filas],[Columnas]
		String [][] matriz = new String [2][2];
		
		
		matriz [0][0] ="Fila1Columna1";
		matriz [0][1] ="Fila1Columna2";
		
		matriz [1][0] ="Fila2Columna1";
		matriz [1][1] ="Fila2Columna2";
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				System.out.println(matriz[i][j]);	
			}
			
		}
		
		
	}

}
