 /*
 * @author Adan Vargas
*/
import java.util.Scanner;

//clase para probar clase RectXY
public class ej1{
    public static void main(String[] s_2){
        int xInicial, yInicial;
        
        //lectura punto base
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el valor de x de un punto base para la recta.\n");
        xInicial = valor.nextInt();
        System.out.println("Ingrese el valor de y de un punto base para la recta.\n");
        yInicial = valor.nextInt();
        RectXY recta = new RectXY(xInicial,yInicial);
    }
}

class RectXY{
    float m, b;

    public RectXY(int x, int y){
        System.out.printf("Recta creada con el punto [%d,%d]\n",x,y);
        m = ObtenerPendiente(x,y);
        ImprimirEcuacion(m,b);

        char workOnProcess;
        Scanner valor = new Scanner(System.in);
        System.out.println("¿Desea obtener algunos puntos de la recta en cierto rango?[s/n]\n");
        workOnProcess = valor.next().charAt(0);
        
        while(workOnProcess == 's'){
            float x1, x2;
            System.out.println("Ingrese el valor de x1 del rango x1 a x2\n");
            x1 = valor.nextFloat();
            System.out.println("Ingrese el valor de x2 del rango x1 a x2\n");
            x2 = valor.nextFloat();
            ImprimirValoresRectaEnIntervalo(x1,x2,b,m);
            workOnProcess = 'n';
        }
        System.out.println("\nFin del programa\n");
    }

    public void ImprimirEcuacion(float m, float b){
        System.out.printf("y = %fx ",m);
        if(b > 0)
            System.out.printf("+ %f \n",b);
        else
            System.out.printf("%f \n",b);
    }

    public void ImprimirValoresRectaEnIntervalo(float x1, float x2, float b, float m){
        System.out.printf("Los puntos entre los intervalos de x: %f y %f\n",x1,x2);
        for(float i = x1; i <= x2; i++){
            System.out.printf("[%f,%f]\n",i,((m*i)+b));
        }
    }

    public float ObtenerPendiente(float _x1, float _y1){
        float pendiente;
        float x1,x2,y1,y2;
        Scanner valor = new Scanner(System.in);
        //lectura primer punto
        x1 = _x1;
        y1 = _y1;
        System.out.println("En base al primer punto con el que se creo la recta\n Favor de introducir otro punto.");
        //lectura segundo punto
        System.out.println("Introduzca el valor de x del segundo punto: \n");
        x2 = valor.nextFloat();
        System.out.println("Introduzca el valor de y del segundo punto: \n");
        y2 = valor.nextFloat();
        pendiente = (y2 - y1)/(x2 - x1);
        b = ObtenerOrdenada(x1,y1,pendiente);
        return pendiente;
    }

    public float ObtenerOrdenada(float x, float y, float m){
        float ordenada;
        ordenada = y - (m*x);
        return ordenada;
    }
}


