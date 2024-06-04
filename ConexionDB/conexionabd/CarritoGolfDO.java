package ConexionDB.conexionabd;


public class CarritoGolfDO {
	
	//Variables de carrito
	private int idCarrito;
	private int numSerie;
	private String marca;
	private int velocidadMax;
	private String armamento;
	private int municion;
	
	//Constructor vacio
	public CarritoGolfDO() {
		this.numSerie = 0;
		this.marca = " ";
		this.velocidadMax = 0;
		this.armamento = " ";
		this.municion = 0;
	}
	
	//Constructor con campos
	public CarritoGolfDO(int idCarrito, int numSerie, String marca, int velocidadMax, String armamento, int municion) {
		super();
		this.idCarrito = idCarrito;
		this.numSerie = numSerie;
		this.marca = marca;
		this.velocidadMax = velocidadMax;
		this.armamento = armamento;
		this.municion = municion;
	}

	//Getters y setters
	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getArmamento() {
		return armamento;
	}

	public void setArmamento(String armamento) {
		this.armamento = armamento;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	//Funcion toString
	@Override
	public String toString() {
		return "CarritoGolfDO [idCarrito=" + idCarrito + ", numSerie=" + numSerie + ", marca=" + marca
				+ ", velocidadMax=" + velocidadMax + ", armamento=" + armamento + ", municion=" + municion + "]";
	}
	
	
	
}
