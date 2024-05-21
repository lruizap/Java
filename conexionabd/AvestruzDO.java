package conexionabd;


public class AvestruzDO {

	//Variables de avestruz
	private int idAvestruz;
	private String nombre;
	private String nickGuerra;
	private int edad;
	private int altura;
	private int nivelMalaLeche;
	private int numHuevos;
	
	//Constructor vacio
	public AvestruzDO() {
		this.nombre = " ";
		this.nickGuerra = " ";
		this.edad = 0;
		this.altura = 0;
		this.nivelMalaLeche = 0;
		this.numHuevos = 0;
		
	}
	
	//Constructor con campos
	public AvestruzDO(int idAvestruz, String nombre, String nickGuerra, int edad, int altura, int nivelMalaLeche, int numHuevos) {
		super();
		this.idAvestruz = idAvestruz;
		this.nombre = nombre;
		this.nickGuerra = nickGuerra;
		this.edad = edad;
		this.altura = altura;
		this.nivelMalaLeche = nivelMalaLeche;
		this.numHuevos = numHuevos;
	}

	//Getters y Setters
	public int getIdAvestruz() {
		return idAvestruz;
	}

	public void setIdAvestruz(int idAvestruz) {
		this.idAvestruz = idAvestruz;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickGuerra() {
		return nickGuerra;
	}

	public void setNickGuerra(String nickGuerra) {
		this.nickGuerra = nickGuerra;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getNivelMalaLeche() {
		return nivelMalaLeche;
	}

	public void setNivelMalaLeche(int nivelMalaLeche) {
		this.nivelMalaLeche = nivelMalaLeche;
	}

	public int getNumHuevos() {
		return numHuevos;
	}

	public void setNumHuevos(int numHuevos) {
		this.numHuevos = numHuevos;
	}

	//Funcion toString
	@Override
	public String toString() {
		return "AvestruzDO [idAvestruz=" + idAvestruz + ", nombre=" + nombre + ", nickGuerra=" + nickGuerra + ", edad="
				+ edad + ", altura=" + altura + ", nivelMalaLeche=" + nivelMalaLeche + ", numHuevos=" + numHuevos + "]";
	}
	
}
