public class Motor{
	private int valvulas;
	private int bujias;
	private boolean descompuesto;

	public Motor(){
		descompuesto = true;
	}

	public void setValvulas(int v){
		valvulas = v;
	}

	public void setBujias(int b){
		bujias = b;
	}

	public int getValvulas(){
		return valvulas;
	}

	public int getBujias(){
		return bujias;
	}

	public void setDescompuesto(boolean d){
		descompuesto = d;
	}

	public boolean getDescompuesto(){
		return descompuesto;
	}
}