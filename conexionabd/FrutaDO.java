package conexionabd;


public class FrutaDO {
	
	//Variables de fruta
	private int idFruta;
	private String nombre;
	private int daño;
	private int puntosRec;
	private String tipo;
	
	//Constructor vacio
	public FrutaDO() {
		this.nombre = " ";
		this.daño = 0;
		this.puntosRec = 0;
		this.tipo = " ";
	}
	
	//Constructor con parametros
	public FrutaDO(int idFruta, String nombre, int daño, int puntosRec, String tipo) {
		super();
		this.idFruta = idFruta;
		this.nombre = nombre;
		this.daño = daño;
		this.puntosRec = puntosRec;
		this.tipo = tipo;
	}

	//Getters y setters
	public int getIdFruta() {
		return idFruta;
	}

	public void setIdFruta(int idFruta) {
		this.idFruta = idFruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public int getPuntosRec() {
		return puntosRec;
	}

	public void setPuntosRec(int puntosRec) {
		this.puntosRec = puntosRec;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Funcion toString
	@Override
	public String toString() {
		return "FrutaDO [idFruta=" + idFruta + ", nombre=" + nombre + ", daño=" + daño + ", puntosRec=" + puntosRec
				+ ", tipo=" + tipo + "]";
	}
	
}
