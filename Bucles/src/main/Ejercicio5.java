package main;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primera=1;
		int segunda=1;
		int siguiente=0;
		
		System.out.println(primera);
		System.out.println(segunda);
		
		for (int i =0;i<30;i++) {
			//  0     =    1    +    1
			siguiente = primera + segunda;
			System.out.println(siguiente);
			primera = segunda;
			segunda = siguiente;
			
		}

	}

}
