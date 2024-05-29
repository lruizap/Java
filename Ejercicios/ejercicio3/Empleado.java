package Ejercicios.ejercicio3;

public class Empleado extends Persona {
    private double salario;
    private String puesto;

    public Empleado(String nombre, String id, String email, double salario, String puesto) {
        super(nombre, id, email);
        this.salario = salario;
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salario: " + salario);
        System.out.println("Puesto: " + puesto);
        System.out.println();
    }
}
