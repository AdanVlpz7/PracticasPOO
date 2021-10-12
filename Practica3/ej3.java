 /*
 * @author Adan Vargas
*/
import java.util.Properties;

public class ej3{
	
	public static void main(String[] s_2){
		String sistemaOperativo = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String sistemaOperativoVersion = System.getProperty("os.version");
		String sistemaOperativoArch = System.getProperty("os.arch");

		System.out.println("Sistema Operativo: " + sistemaOperativo);
		System.out.println("Sistema Operativo Version: " + sistemaOperativoVersion);
		System.out.println("Sistema Operativo Arquitectura: " + sistemaOperativoArch);
		System.out.println("Usuario del sistema: " + userName);
		
	}
}