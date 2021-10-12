 /*
 * @author Adan Vargas
*/
import java.util.Scanner;

//clase para probar clase Vehiculo
public class ej3{

    public static void main(String[] s_2){
        char workOnProcess;
        String tipoVehiculo;
        String marca;
        int anoModelo;
        float precio;
        String color;    
        Scanner valor = new Scanner(System.in);
        System.out.println("¿Desea instanciar un vehiculo?[s/n]\n");
        workOnProcess = valor.next().charAt(0);
        
        while(workOnProcess == 's'){

            System.out.println("Ingrese el tipo de vehiculo[auto, bicicleta, motocicleta...]\n");
            tipoVehiculo = System.console().readLine();
            System.out.println("Ingrese la marca del vehiculo\n");
            marca = System.console().readLine();
            System.out.println("Ingrese el año del modelo del vehiculo\n");
            anoModelo = valor.nextInt();
            System.out.println("Ingrese el precio que tiene el vehiculo en mercado\n");
            precio = valor.nextFloat();
            System.out.println("Ingrese el color del vehiculo\n");
            color = System.console().readLine();
            Vehiculo carro = new Vehiculo(marca,tipoVehiculo,color,anoModelo,precio);
            carro.ImprimirInformacion();
            workOnProcess = 'n';
        }
        System.out.println("\nFin del programa\n");                       
    }

}

class Vehiculo{
    private String tipoVehiculo;
    private String marca;
    private int anoModelo;
    private float precio;
    private String color;

    public Vehiculo(String _marca, String _tipoVehiculo, String _color, int _anoModelo, float _precio){
        marca = _marca;
        anoModelo = _anoModelo;
        precio = _precio;
        color = _color;
        tipoVehiculo = _tipoVehiculo;
    }

    public void ImprimirInformacion(){
        System.out.printf("\nEl vehiculo es : %s \n",tipoVehiculo);
        System.out.printf("La marca del vehiculo es : %s \n",marca);
        System.out.printf("La vehiculo es un modelo de: %d \n",anoModelo);
        System.out.printf("El precio actual en mercado del vehiculo : %f \n",precio);
        System.out.printf("El color del vehiculo es : %s \n",color);
    }
}
