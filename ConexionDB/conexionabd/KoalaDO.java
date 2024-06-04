package ConexionDB.conexionabd;


public class KoalaDO {
	
	//Variables de koala
	private int idKoala;
	private String nombre;
	private String nickGuerra;
	private int edad;
	private String color;
	private int fuerza;
	private int inteligencia;
	private int horasSueño;
	private int tiempoBerserk;
	
	//Constructor vacio
	public KoalaDO() {
		this.nombre = " ";
		this.nickGuerra = " ";
		this.edad = 0;
		this.color = " ";
		this.fuerza = 0;
		this.inteligencia = 0;
		this.horasSueño = 0;
		this.tiempoBerserk = 0;
	}
	
	//Constructor con parametros
	public KoalaDO (int idKoala, String nombre, String nickGuerra, int edad, String color, int fuerza, int inteligencia, int horasSueño, int tiempoBerserk) {
		super();
		this.idKoala = idKoala;
		this.nombre = nombre;
		this.nickGuerra = nickGuerra;
		this.edad = edad;
		this.color = color;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.horasSueño = horasSueño;
		this.tiempoBerserk = tiempoBerserk;
	}

	//Getters y setters
	public int getIdKoala() {
		return idKoala;
	}

	public void setIdKoala(int idKoala) {
		this.idKoala = idKoala;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getHorasSueño() {
		return horasSueño;
	}

	public void setHorasSueño(int horasSueño) {
		this.horasSueño = horasSueño;
	}

	public int getTiempoBerserk() {
		return tiempoBerserk;
	}

	public void setTiempoBerserk(int tiempoBerserk) {
		this.tiempoBerserk = tiempoBerserk;
	}

	//Funcion toString
	@Override
	public String toString() {
		return "KoalaDO [idKoala=" + idKoala + ", nombre=" + nombre + ", nickGuerra=" + nickGuerra + ", edad=" + edad
				+ ", color=" + color + ", fuerza=" + fuerza + ", inteligencia=" + inteligencia + ", horasSueño="
				+ horasSueño + ", tiempoBerserk=" + tiempoBerserk + "]";
	}
	
}
