package Objetos.Ejercicios.ejercicio2;

public class Cliente {
    private String nombre;
    private String id;
    private String telefono;

    public Cliente(String nombre, String id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Teléfono: " + telefono);
        System.out.println();
    }
}
