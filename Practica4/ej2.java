 /*
 * @author Adan Vargas
*/
import java.util.Scanner;

//clase para probar clase Empleado
public class ej2{
    
    public static void main(String[] s_2){
        char workOnProcess;
        float horasTrabajo;
        float sueldoPorHora;
        String nombre;
        Scanner valor = new Scanner(System.in);
        System.out.println("¿Desea instanciar un empleado?[s/n]\n");
        workOnProcess = valor.next().charAt(0);
        
        while(workOnProcess == 's'){
            System.out.println("Ingrese el nombre del empleado: \n");    
            nombre = System.console().readLine();
            System.out.println("Ingrese el sueldo por hora del empleado \n");
            sueldoPorHora = valor.nextInt();
            System.out.println("Ingrese las horas de trabajo a la semana del empleado \n");
            horasTrabajo = valor.nextFloat();
            Empleado empleado = new Empleado(horasTrabajo,sueldoPorHora,nombre);
            empleado.ImprimirInformacion();
            workOnProcess = 'n';
        }
        System.out.println("\nFin del programa\n");  
    }    
}

class Empleado{
    private float salario;
    private float horasTrabajo;
    private float sueldoPorHora;
    private String nombre;

    public Empleado(float _horasTrabajo, float _sueldoPorHora, String _nombre){
        horasTrabajo = _horasTrabajo;
        sueldoPorHora = _sueldoPorHora;
        nombre = _nombre;
        salario = horasTrabajo*sueldoPorHora;
    }
    public void ImprimirInformacion(){
        System.out.printf("Horas de trabajo de %s: %f\n",nombre, horasTrabajo);
        System.out.printf("Sueldo por hora de trabajo de %s: %f\n",nombre, sueldoPorHora);
        System.out.printf("Salario de %s: %f",nombre, salario);
    }
}