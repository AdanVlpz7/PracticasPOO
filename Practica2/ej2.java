/** 
 * Desarrolle un programa en Java que reciba una lista de hasta 10 números y determine si son iguales o en caso contrario, 
 * que los ordene del menor al mayor, utilizando la estructura de selección if/else y la estructura for.
 * @author Adan Vargas
 * * */
 import java.util.Scanner;

 public class ej2{
	static int[] arrayNum = new int[10];

	//La clase que contiene al metodo main se conoce como clase principal.
	public static void main(String[] s_2) {
		//lectura de arreglo
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, introduce los valores de los elementos.\n");
		for(int i = 0; i < 10; i++){
			System.out.printf("Introduce el elemento %d del arreglo.\n", i+1);
			arrayNum[i] = teclado.nextInt();
		}
		//realizacion del ejercicio
		if(VerificarIgualdadArreglo(arrayNum)){
			System.out.println("Todos los elementos del arreglo son iguales");
		}
		else{
			System.out.println("No todos los elementos del arreglo son iguales\n");
			OrdenacionArreglo(arrayNum);
			System.out.println("El arreglo ordenado es: \n");
			ImprimirArreglo(arrayNum);
		}
	
	}

	public static boolean VerificarIgualdadArreglo(int[] arr){
		int longitud = arr.length;
		int temp = 0;

		for(int i = 0; i < arr.length - 1; i++){			
			temp = arr[i];
			if(arr[i+1] == temp){
				longitud -= 1;
				continue;
			}
		}
		if(longitud == 1)
			return true;
		else
			return false;
	}
	//ordenacion por bubblesort
	public static void OrdenacionArreglo(int[] arr){
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}				
			}
		}
	}
	//metodo para imprimir arreglo
	public static void ImprimirArreglo(int[] arr){
		for(int i = 0; i < arr.length ; i++){
			System.out.printf("%d ",arr[i]);			
		}
	}
}
