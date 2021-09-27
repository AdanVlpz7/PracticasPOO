/*
 * Desarrolle un programa en Java que reciba 3 números y determine si son iguales o en caso contrario,
 * cual es el mayor y cual el menor, utilizando el operador ternario (condicional).
 * @author Adan Vargas
 * * */
import java.util.Scanner;

public class ej1{
	static int n1,n2,n3;

	//La clase que contiene al metodo main se conoce como clase principal.
	public static void main(String[] s_2) {
		//primer parte del ejercicio
		
		//lectura de datos.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 3 numeros.\n");
		System.out.println("Introduce el primer numero.\n");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero.\n");
		n2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero.\n");
		n3 = teclado.nextInt();
		
		//operaciones
		int numeroMayor = 0; 
		numeroMayor = (n1 == n2 && n2 == n3) ? 0 : numeroMayor(n1,n2,n3);
		if(numeroMayor == 0)
			System.out.printf("Los tres numeros son iguales\n");
		else
			System.out.printf("El mayor de los 3 numeros es: %d", numeroMayor);
	}

	public static int numeroMayor(int n1,int n2, int n3){
		int mayor = 0;
		if(n1 > n2 && n1 > n3)
			mayor = n1;
		if(n2 > n3 && n2 > n1)
			mayor = n2;
		if(n3 > n1 && n3 > n2)
			mayor = n3;
		return mayor;
	}
}
