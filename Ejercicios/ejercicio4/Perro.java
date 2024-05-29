public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String especie, String raza) {
        super(nombre, edad, especie);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
    }
}
