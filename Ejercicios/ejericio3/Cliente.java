package Ejercicios.ejericio3;

public class Cliente extends Persona {
    private String fechaRegistro;
    private double compraTotal;

    public Cliente(String nombre, String id, String email, String fechaRegistro, double compraTotal) {
        super(nombre, id, email);
        this.fechaRegistro = fechaRegistro;
        this.compraTotal = compraTotal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getCompraTotal() {
        return compraTotal;
    }

    public void setCompraTotal(double compraTotal) {
        this.compraTotal = compraTotal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("Compra Total: " + compraTotal);
        System.out.println();
    }
}

