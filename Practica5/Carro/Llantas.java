public class Llantas{
	private int llantas = 4;
	private boolean descompuesto;
	
	public Llantas(int _llantas){
		descompuesto = false;
		llantas = _llantas;
		if(llantas != 4)
			setDescompuesto(true);
	}

	public Llantas(){
		descompuesto = false;
	}

	public void SetLlantas(int _llantas){
		llantas = _llantas;
	}
	
	public int GetLlantas(){
		return llantas;
	}

	public void setDescompuesto(boolean d){
		descompuesto = d;
	}

	public boolean getDescompuesto(){
		if(llantas < 3)
			return true;
		if(llantas == 4)
			return false;
		return descompuesto;
	}
}