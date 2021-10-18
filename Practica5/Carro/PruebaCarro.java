public class PruebaCarro{
	public static void main(String[] args) {
		Automovil elRayo = new Automovil();
		Mecanico pedro = new Mecanico();

		elRayo.arrancar();

		pedro.arreglarMotor(elRayo.getMotor());

		elRayo.arrancar();

		elRayo.frenar();

		pedro.arreglarMotor(elRayo.getFrenos());

		elRayo.transmision. 
	}
}