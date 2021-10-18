public class Frenos{
	private boolean descompuesto;
	private String tipoFreno;

	public Frenos(int _tipoFreno){
		descompuesto = false;
		setTipoFreno(_tipoFreno);
		System.out.printf("Los frenos del coche son: %s",_tipoFreno);
	}

	public Frenos(boolean _frenos,int _tipoFreno){
		descompuesto = _frenos;
		setTipoFreno(_tipoFreno);
		System.out.printf("Los frenos del coche son: %s",_tipoFreno);
	}

	//imprimir el string del tipo de freno
	public void printTipoFreno(String tipoFreno){
		System.out.printf("%s",tipoFreno);
	}

	//el tipo de freno se guarda en un string y es segun un valor entero
	public void setTipoFreno(int _tipoFreno){
		switch(_tipoFreno){
			case 0:
				tipoFreno = "Freno de Tambor";
				break;
			case 1:
				tipoFreno = "Freno de Disco";
				break;
			case 2:
				tipoFreno = "Freno de Estacionamiento";
				break;
		}
	}
	
	public void setDescompuesto(boolean d){
		descompuesto = d;
	}

	//devolver el estado del boolean descompuesto
	public boolean getDescompuesto(){
		return descompuesto;
	}

}