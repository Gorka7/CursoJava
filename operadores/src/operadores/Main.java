package operadores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARITMETICOS
		//Suma , Resta , Multiplicación , Division , Resto
		//Suma
		int suma = 4 + 5;
		//Resta
		int resta = 4 - 5;
		//Multiplicacion
		int multiplicacion = 20 * 5;
		//División
		int division = 20 / 5;
		//Resto
		int resto = 10 % 2;
		
		//Ejercicio1
		int numero1=20;
		int numero2=5;
		int resultado;
		
		System.out.println("Suma");
		resultado = numero1 + numero2;
		System.out.println(resultado);
		
			System.out.println("Resta");
			resultado = numero1 - numero2;
			System.out.println(resultado);
		
				System.out.println("Multiplicación");
				resultado = numero1 * numero2;
				System.out.println(resultado);
				
					System.out.println("Division");
					resultado = numero1 / numero2;
					System.out.println(resultado);
				
						System.out.println("Resto");
						resultado = numero1 % numero2;
						System.out.println(resultado);
						
		int numero3 = 7;
		resultado = (numero1 + numero2) * numero3;
		System.out.println(resultado);
				
		
		//LOGICOS
		//Igual , Diferente , Mayor , Menor
		//Igual
		String operadores = "Operadores Logicos";
		System.out.println(operadores);
		String igual = "Igual";
		System.out.println(igual);
		System.out.println(numero1 == numero2); 
		
			//Diferente
			String diferente = "Diferente";
			System.out.println(diferente);
			System.out.println(numero1 != numero2);
			
				//Mayor
				String mayor = "Mayor";
				System.out.println(mayor);
				System.out.println(numero1 > numero2); 
				System.out.println(numero1 >= numero2); 
		
					//Menor
					String menor = "Menor";
					System.out.println(menor);
					System.out.println(numero1 < numero2); 
					System.out.println(numero1 <= numero2); 
		
						//Negacion
						String negacion = "Negacion";
						System.out.println(negacion);
						System.out.println(!true);
						System.out.println(!false);
	}

}
