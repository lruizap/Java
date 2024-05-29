public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String especie, String color) {
        super(nombre, edad, especie);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Color: " + color);
    }
}
