 /*
 * @author Adan Vargas
*/
import java.util.Scanner;

public class ej2{
	
	public static void main(String[] s_2){
		double gradosRadianes,resultado,grados;

		//lectura de grados
		Scanner valor = new Scanner(System.in);
		System.out.printf("Digite Valor Grados: ");
		grados = valor.nextDouble();
		gradosRadianes = (grados*3.1416)/180;
		resultado = toSenx(gradosRadianes);
		System.out.println("Sen(" + grados + ") = " + resultado);
	}

	public static int factorial(double n){
		int f = 1;
		for(int i = 1; i <= n; i++){
			f*=i;
		}
		return f;
	}
	public static double toSenx(double gradosRadianes){
		int c = 1;
		double resultado;
		double sumaNegativa= 0.0f, sumaPositiva = 0.0f;
		double potencia1 = 1;
		double potencia2 = 3;
		do{
			sumaPositiva += Math.pow(gradosRadianes,potencia1)/factorial(potencia1);
			potencia1 += 4;
			sumaNegativa -= Math.pow(gradosRadianes,potencia2)/factorial(potencia2);
			potencia2 += 4;
			c++;
		}while(c<5);
		resultado = sumaNegativa + sumaPositiva;
		return resultado;
	} 
}