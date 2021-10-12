import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class fechas{
	public static void main(String[] args) {

		System.out.println("Fechas con la clase Date:");
		Date fecha = new Date();
		System.out.println("La fecha es: " + fecha.toString());
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("La fecha es: " + formato.format(fecha));

		System.out.println("\nFechas con la clase Calendar:");

		String miFecha = "Hoy es dia ";

		Calendar calendario = Calendar.getInstance();

		miFecha += calendario.get(Calendar.DAY_OF_MONTH) + " del mes ";
		miFecha += calendario.get(Calendar.MONTH) + 1 + " de ";
		miFecha += calendario.get(Calendar.YEAR);

		System.out.println(miFecha);

		System.out.println("\nFechas con la clase LocalDate:");

		LocalDate hoy = LocalDate.now();
		System.out.println(hoy);
		System.out.println(hoy.plusWeeks(1));
	}
}