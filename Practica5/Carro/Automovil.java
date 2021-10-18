public class Automovil{
	private Motor m;
	private Llantas l;
	private Transmision transmision;
	private Frenos frenos;

	public Automovil(){
		m = new Motor();
		l = new Llantas(4);
		transmision = new Transmision();
		frenos = new Frenos(true, 1);
	}

	public Motor getMotor(){
		return m;
	}

	public Llantas getLLantas(){
		return l;
	}

	public Frenos getFrenos(){
		return frenos;
	}

	public Transmision getTransmision(){
		return transmision;
	}

	public void arrancar(){
		if(m.getDescompuesto() && l.getDescompuesto() && transmision.getDescompuesto() && frenos.getDescompuesto()) System.out.println("No puedo arrancar....");
		else System.out.println("Arrancando, run, run, run");
	}

	public void frenar(){
		if(frenos.getDescompuesto()) System.out.println("No puedo frenar :o....");
		else System.out.println("Frenandooo ");
	}
}
