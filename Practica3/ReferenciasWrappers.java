import java.util.Scanner;
public class ReferenciasWrappers{
	public static void main(String[] args) {
		Integer x, y;

		x = 5;
		y = 26;

		System.out.println("El valor de x antes de la suma es: " + x);
 
		suma(x,y);

		System.out.println("El valor de x despues de la suma es: " + x);

		Float alpha, beta;

		//alpha = 3.456;
		//beta = 64.368;

		alpha = 3.456f;
		beta = 64.368f;

		System.out.println("\nEl valor de alpha antes de la suma es: " + alpha);

		suma(alpha, beta);

		System.out.println("El valor de alpha despues de la suma es: " + alpha);

	}

	public static void suma(Integer a, Integer b){
		a += b;
		System.out.println("El resultado de la suma es: " + a);
	}

	public static void suma(Float a, Float b){
		a += b;
		System.out.println("El resultado de la suma es: " + a);
	}
}