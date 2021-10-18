import java.lang.Math;
public class ComplexNumber{
	private float real;
	private float imaginario;

	public ComplexNumber(){
		//System.out.printf("El numero imaginario es: %f +(%fi)\n",r,i);
		real = 0;
		imaginario = 0;
	}

	public ComplexNumber(float r, float i){
		System.out.printf("El numero imaginario es: %f +(%fi)\n",r,i);
		real = r;
		imaginario = i;
	}

	public ComplexNumber suma(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber resultado= new ComplexNumber();;
		resultado.real = n1.real + n2.real;
		resultado.imaginario = n1.imaginario + n2.imaginario;
		return resultado;
	}

	public ComplexNumber resta(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber resultado = new ComplexNumber();
		resultado.real = n1.real - n2.real;
		resultado.imaginario = n1.imaginario - n2.imaginario;
		return resultado;
	}

	public ComplexNumber multiplicacion(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber resultado = new ComplexNumber();;
		resultado.real = ((n1.real * n2.real) + (n1.imaginario * -1 * n2.imaginario));
		resultado.imaginario = (n1.real * n2.imaginario) + (n2.real * n1.imaginario);
		return resultado;
	}	

	public ComplexNumber division(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber resultado = new ComplexNumber();;
		resultado.real = ((n1.real * n2.real) + (n1.imaginario*n2.imaginario))/((n2.real*n2.real) + (n2.imaginario*n2.imaginario));
		resultado.imaginario = ((n1.imaginario * n2.real) - (n1.real*n2.imaginario))/((n2.real*n2.real) + (n2.imaginario*n2.imaginario));
		return resultado;
	}	

	public void PrintComplexNumber(ComplexNumber n){
		System.out.printf("Complex Number: %f",n.real);
		if(n.imaginario > 0){
			System.out.printf("+ %f",n.imaginario);
		}
		else
			System.out.printf("%f",n.imaginario);

	}

	public void PrintPolarForm(ComplexNumber n){
		double r;
		double g;
		r = Math.sqrt((n.real * n.real) + (n.imaginario * n.imaginario));
		g = Math.atan(n.imaginario/n.real);
		System.out.printf("%fcis%f",r,g);
	}
}