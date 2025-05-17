package com.metaphorce.vista;
import com.metaphorce.modelo.*;

public class Main{
    public static void main(String[] args){
        Pelicula pelicula1 = new Pelicula(311, "la risa en vacaciones", false);
        Pelicula pelicula2 = new Pelicula(224, "El exorcista");
        Pelicula pelicula3 = new Pelicula(140, "Dia de la independencia", true);
        Pelicula pelicula4 = new Pelicula(4128, "El imperio contraataca");
        Pelicula pelicula5 = new Pelicula(1111, "La princesa y el sapo", true);
        System.out.println("Gestor de peliculas");

        GestorPelicula gp = new GestorPelicula();
        gp.agregarPelicula(pelicula1);
        gp.agregarPelicula(pelicula2);
        gp.agregarPelicula(pelicula3);
        gp.agregarPelicula(pelicula4);
        gp.agregarPelicula(pelicula5);

        gp.obtenerPeliculas();
        gp.eliminarPelicula(1111); //colocamos un id valido
        gp.obtenerPeliculas(); //verificamos la eliminacion de la pelicula
        gp.marcarPeliculaComoNoDisponible(4128); //marcamos una pelicula como no disponible
        gp.marcarPeliculaComoNoDisponible(224); //marcamos otra pelicula como no disponible
        gp.marcarPeliculaComoDisponible(224); //marcamos de nuevo la pelicula como disponible

        gp.obtenerPeliculasDisponibles();
        gp.obtenerPeliculasNoDisponible();

    }
}