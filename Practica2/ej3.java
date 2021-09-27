/** 
 * Utilizando un ciclo while o 
 * do-while cree un programa que reciba una palabra por cada iteración del ciclo y realice lo siguiente:
 * Imprimir cada palabra que reciba.
 * Determinar si la palabra ingresada es un palindromo.
 * Si recibe la palabra "salta", no debe imprimir dicha palabra,
 * sino saltar a la siguiente iteración, no debe analizar si la palabra salta es un palindromo.
 * @author Adan Vargas
 * * */
import java.util.Scanner;

public class ej3{
    static String palabra;
    static int n;
    public static void main(String[] s_2) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas palabras desea ingresar?\n");
        n = teclado.nextInt();
        while(n > 0){
            palabra = teclado.next();
            
            if(palabra.equals("saltar")){
                System.out.println("Has saltado una iteracion. \n");
                n--;
                continue;
                
            }
            else{
                System.out.println("La palabra ingresada es: \n");
                System.out.println(palabra);
                if(Palindromo(palabra)){
                    System.out.println("La palabra ingresada es palindromo. \n");
                }
                else{
                    System.out.println("La palabra ingresada no es palindromo. \n");
                }
                n--;
            }
        }
    }

    public static boolean Palindromo(String s){
        System.out.println("checando si es palindromo\n");
        int longitudPalabra = s.length();
        for (int i = 0; i < longitudPalabra/2; i++)
            if (longitudPalabra.charAt(i) != longitudPalabra.charAt(N-1-i))
                return false;
        return true;
    }

}