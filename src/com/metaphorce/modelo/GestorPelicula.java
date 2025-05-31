package com.metaphorce.modelo;

import java.util.ArrayList;

public class GestorPelicula {
    ArrayList<Pelicula> coleccionPeliculas= new ArrayList<>();


    public void agregarPelicula(Pelicula pelicula){
        coleccionPeliculas.add(pelicula);
    }

    public void eliminarPelicula(int id){
        /*hacemos un recorrido completo de la lista y comparamos
         *el id pasado como parametro con el de la pelicula, si ambos
         * id coinciden, se elimina la pelicula, caso contrario devuelve un
         * mensaje*/
        for(int cont = 0; cont < coleccionPeliculas.size(); cont++){
            if(coleccionPeliculas.get(cont).getIdPelicula() == id) {
                coleccionPeliculas.remove(cont);
            }
        }
    }

    public void obtenerPeliculas(){
        for(Pelicula pelicula : coleccionPeliculas){
            System.out.println(pelicula.toString());
        }
    }

    public void obtenerPeliculasDisponibles(){

        System.out.println("Lista de peliculas disponibles:");
        for(int cont = 0; cont < coleccionPeliculas.size(); cont++){
            if(coleccionPeliculas.get(cont).getDisponibilidad() == true){
                System.out.println(coleccionPeliculas.get(cont).toString());
            }
        }

    }

    public void obtenerPeliculasNoDisponible(){
        System.out.println("Lista de peliculas no disponibles:");
        for(int cont = 0; cont < coleccionPeliculas.size(); cont++){
            if(coleccionPeliculas.get(cont).getDisponibilidad() == false){
                System.out.println(coleccionPeliculas.get(cont).toString());
            }
        }
    }

    public void marcarPeliculaComoDisponible(int id){
        /*recorremos toda la lista y verificamos que el ID exista y la
         disponibilidad de esta se encuentre en false*/

        for(int cont = 0; cont < coleccionPeliculas.size(); cont++){
            if(coleccionPeliculas.get(cont).getIdPelicula() == id &&
            coleccionPeliculas.get(cont).getDisponibilidad() == false){
                coleccionPeliculas.get(cont).setDisponibilidad(true);
                System.out.println("Operacion realizada con exito");
            }
        }
    }

    public void marcarPeliculaComoNoDisponible(int id){
        for(int cont = 0; cont < coleccionPeliculas.size(); cont++){
            if(coleccionPeliculas.get(cont).getIdPelicula() == id &&
                    coleccionPeliculas.get(cont).getDisponibilidad() == true){
                coleccionPeliculas.get(cont).setDisponibilidad(false);
                System.out.println("Operacion realizada con exito");
            }
        }
    }

    public Pelicula buscarPorNombre(String nombre){
        for(Pelicula pelicula : coleccionPeliculas) {
            if (pelicula.getNombre().equals(nombre)) {
                System.out.println();
                return(pelicula);
            }
        }
        return(null);
    }

}
