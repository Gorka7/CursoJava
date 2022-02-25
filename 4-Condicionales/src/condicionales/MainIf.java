package condicionales;

public class MainIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (condicion -> exp booleana){...}
		int numero1 = 2;
		int numero2 = 10;
		int numero3 = 8;
			//num1 mayor num2 Y(&&) num1 mayor num3
			//num1 mayor num2 O (||) num1 mayor num3
 		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero 1 es mayor");
		} else if(numero2 > numero1 && numero2 > numero3){
			System.out.println("El numero 2 es mayor");
		}else {
			System.out.println("El numero 3 es menor");
		}
	}

}
