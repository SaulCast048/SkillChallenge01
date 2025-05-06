# Skill Challenge 01

El siguiente repositorio es utilizado para fines educativos.

Este repositorio contiene una práctica donde se lleva a cabo la creación de
un gestor de peliculas compuesto por tres clases
* Clase main
* Clase Pelicula
* Clase GestorPelicula

La clase pelicula contiene los atributos nombre, id y disponibilidad, contiene sus
getters, setters y constructores, de los cuales se encuentran dos, uno que agrega
los tres atributos y el segundo solo agrega los atributos nombre e Id, este asigna
el valor de la disponibilidad como verdadero.

La clase GestorPelicula cuenta con una ArrayList de objetos de tipo Pelicula. En esta
clase, podemos encontrar multiples métodos entre los cuales se encuentran métodos
para agregar nuevas peliculas, eliminar peliculas, mostrar la lista actual de peliculas,
modificar la disponibilidad de las peliculas y mostrar que peliculas estan disponibles
y cuales no.

Por último, la clase Main contiene instancias de la clase Pelicula y una instancia
de la clase GestorPelicula, en la clase Main se crean cinco instancias de la clase
Pelicula que posteriormente, pasan a ser agregadas al gestor de peliculas.
Las operaciones que se llevan a cabo en la clase Main son la adicion de peliculas,
mostrar todas las peliculas, eliminación de pelicula, marcar peliculas como
disponibles y no disponibles y por último mostrar que peliculas se encuentran
disponibles y que peliculas no se encuentran disponibles