package scanner;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio4
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce tu nota:");
		int nota = teclado.nextInt();
		
		//Con If
		/*if(nota <5) {
			System.out.println("Suspenso");
			}else if (nota >=5 && nota <7) {
				System.out.println("Aprobado");
				}else if(nota >=7 && nota <9) {
					System.out.println("Notable");
				}else if(nota >=9 && nota <10) {
					System.out.println("Sobresaliente");
					}else {
						System.out.println("Matricula de Honor");
			}	*/
		
			//Con Switch
			switch (nota) {
			
			case 0,1,2,3,4:
				System.out.println("Suspenso");
			break;
			case 5,6:
				System.out.println("Aprobado");
			break;
			case 7,8:
				System.out.println("Notable");
			case 9:
				System.out.println("Sobresaliente");
			case 10:
				System.out.println("Matricula de Honor");
			}
		
			teclado.close();
		}
	}

