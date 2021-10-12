 /*
 * @author Adan Vargas
*/
import java.util.Scanner;

public class ej1{
	
	public static void main(String[] s_2){
		int n = 0;
		Scanner valor = new Scanner(System.in);
		System.out.printf("Digite Valor de tamaño Matriz: ");
		n = valor.nextInt();
		float A[n][n]={0}, B[n]={0}, X[n]={0}, L[n][n]={0}, U[n][n]={0};
	}

   	public void MetodoLU(double[] U, double[] L, int n)
    {
        for (int fpivot = 0; fpivot < n - 1; fpivot++)
        {
            matrixL[fpivot, fpivot] = 1;

            for (int f = fpivot + 1; f < n; f++)
            {
                double k = matrixU[f, fpivot] / matrixU[fpivot, fpivot];

                matrixL[f, fpivot] = matrixU[f, fpivot] / matrixU[fpivot, fpivot];

                for (int c = fpivot; c < columnas - 1; c++)
                {
                    matrixU[f, c] = matrixU[f, c] - (k * matrixU[fpivot, c]);
                }
            }
        }
    }

}