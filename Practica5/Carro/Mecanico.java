public class Mecanico{
	public void arreglarMotor(Motor m){
		if(!m.getDescompuesto()) System.out.println("El motor de tu auto funciona correctamente");
		else{
			m.setDescompuesto(false);
			System.out.println("He arreglado tu auto...");
		}
	}
	public void arreglarLlantas(Llantas l){
		if(!l.getDescompuesto()) System.out.println("Su coche tiene en buen estado sus 4 llantas");
		else{
			l.setDescompuesto(false);
			System.out.println("He arreglado tu auto...");
		}
	}
	public void arreglarTransmision(Transmision t){
		if(!t.getDescompuesto()) System.out.println("Su coche tiene en buen estado su transmision");
		else{
			t.setDescompuesto(false);
			System.out.println("He arreglado tu auto...");
		}
	}
	public void arreglarTransmision(Frenos f){
		if(!f.getDescompuesto()) System.out.println("Su coche tiene en buen estado sus frenos");
		else{
			f.setDescompuesto(false);
			System.out.println("He arreglado tu auto...");
		}
	}	
}