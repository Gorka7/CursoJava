package condicionales;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		int numero4 = 5;
		
		//Switch (expresion a evaluar){case :}

		switch(numero4) {
		case 1:
			System.out.println("Es un 1");
			break;
		case 2:
			System.out.println("Es un 2");
			break;
		case 3:
			System.out.println("Es un 3");
			break;
		default:
			System.out.println("El numero es mayor que 3");
		}
	}

}
