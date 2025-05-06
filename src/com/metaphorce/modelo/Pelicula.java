package com.metaphorce.modelo;

public class Pelicula {
    private int idPelicula;
    private String nombrePelicula;
    private boolean disponibilidad = false;

///////CONSTRUCTORES
    public Pelicula(int idPelicula, String nombrePelicula, boolean disponibilidad){
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.disponibilidad = disponibilidad;
    }

    public Pelicula(int idPelicula, String nombrePelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        /*inicializamos la disponibilidad como true por defecto viendolo
        * desde un punto de vista donde se registran las peliculas antes
        * de ser puestas en venta o renta*/
        this.disponibilidad = true;
    }

    /*Dejamos el objeto sin constructor por defecto para no causar
    * problemas con el programa al intentar agregar un objeto sin
    * datos
    * */

///////SETTERS
    public void setIdPelicula(int id){
        idPelicula = id;
    }

    public void setNombrePelicula(String n){
        nombrePelicula = n;
    }

    public void setDisponibilidad(boolean d){
        disponibilidad = d;
    }

///////GETTERS
    public int getIdPelicula(){
        return(idPelicula);
    }

    public String getNombre(){
        return(nombrePelicula);
    }

    public boolean getDisponibilidad(){
        return(disponibilidad);
    }

    //metodo toString

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", nombrePelicula='" + nombrePelicula + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
