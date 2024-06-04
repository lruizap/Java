package Objetos.EjercicioExamen.ejercicioSuperHeroes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear habilidades para los superhéroes
        ArrayList<String> habilidades1 = new ArrayList<>();
        habilidades1.add("Superfuerza");
        habilidades1.add("Vuelo");

        ArrayList<String> habilidades2 = new ArrayList<>();
        habilidades2.add("Invisibilidad");
        habilidades2.add("Telepatía");

        ArrayList<String> habilidades3 = new ArrayList<>();
        habilidades3.add("Supervelocidad");
        habilidades3.add("Regeneración");

        // Crear superhéroes
        SuperHeroe sh1 = new SuperHeroe("SH001", "Superman", 35, habilidades1, false);
        SuperHeroe sh2 = new SuperHeroe("SH002", "Invisible Woman", 30, habilidades2, false);
        SuperHeroe sh3 = new SuperHeroe("SH003", "Flash", 28, habilidades3, false);

        // Crear equipo de superhéroes
        Equipo equipo = new Equipo("Justice League", "Sala de la Justicia");

        // Agregar superhéroes al equipo
        equipo.agregarSuperHeroe(sh1);
        equipo.agregarSuperHeroe(sh2);
        equipo.agregarSuperHeroe(sh3);

        // Mostrar información de todos los superhéroes
        equipo.mostrarSuperHeroes();

        // Mostrar el número de superhéroes en el equipo
        System.out.println("Número de superhéroes en el equipo: " + equipo.numSuperHeroes());

        // Buscar superhéroes por habilidad
        ArrayList<SuperHeroe> superHeroesConVuelo = equipo.buscarSuperHeroesPorHabilidad("Vuelo");
        System.out.println("Superhéroes con la habilidad de vuelo:");
        for (SuperHeroe sh : superHeroesConVuelo) {
            System.out.println(sh.getNombre());
        }
    }
}