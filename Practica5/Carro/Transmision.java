public class Transmision{
	private boolean transmisionEstandar = true;
	private boolean descompuesto;
	
	public Transmision(){
		transmisionEstandar = true;
		System.out.println("El coche tiene transmision estandar :D");
		descompuesto = false;
	}
	public Transmision(boolean _transmisionEstandar){
		transmisionEstandar = _transmisionEstandar;
		if(transmisionEstandar)
			System.out.println("El coche tiene transmision estandar :D");
		else
			System.out.println("El coche tiene transmision automatica :D");
		descompuesto = false;
	}

	public void setTransmision(boolean _transmisionEstandar){
		transmisionEstandar = _transmisionEstandar;
	}

	public boolean getTransmision(){
		return transmisionEstandar;
	}

	public void setDescompuesto(boolean _descompuesto){
		descompuesto = _descompuesto;
	}

	public boolean getDescompuesto(){
		return descompuesto;
	}
}