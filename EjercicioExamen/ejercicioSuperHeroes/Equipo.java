package EjercicioExamen.ejercicioSuperHeroes;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String baseOperaciones;
    private ArrayList<SuperHeroe> superHeroes;

    // Constructor
    public Equipo(String nombre, String baseOperaciones) {
        this.nombre = nombre;
        this.baseOperaciones = baseOperaciones;
        this.superHeroes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBaseOperaciones() {
        return baseOperaciones;
    }

    public void setBaseOperaciones(String baseOperaciones) {
        this.baseOperaciones = baseOperaciones;
    }

    public ArrayList<SuperHeroe> getSuperHeroes() {
        return superHeroes;
    }

    public void setSuperHeroes(ArrayList<SuperHeroe> superHeroes) {
        this.superHeroes = superHeroes;
    }

    // Método para agregar un superhéroe
    public void agregarSuperHeroe(SuperHeroe superHeroe) {
        superHeroes.add(superHeroe);
        System.out.println("Superhéroe agregado: " + superHeroe.getNombre());
    }

    // Método para contar el número de superhéroes
    public int numSuperHeroes() {
        return superHeroes.size();
    }

    // Método para buscar superhéroes por habilidad
    public ArrayList<SuperHeroe> buscarSuperHeroesPorHabilidad(String habilidad) {
        ArrayList<SuperHeroe> result = new ArrayList<>();
        for (SuperHeroe superHeroe : superHeroes) {
            if (superHeroe.getHabilidades().contains(habilidad)) {
                result.add(superHeroe);
            }
        }
        return result;
    }

    // Método para mostrar la información de todos los superhéroes
    public void mostrarSuperHeroes() {
        System.out.println("Superhéroes en el equipo " + nombre + ":");
        for (SuperHeroe superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
    }
}