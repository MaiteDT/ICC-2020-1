/**
* Clase para crear libros.
* @author Díaz Tinoco Gisel Maite
* @version 1.0 10/Sep/2019
*/

public class Libro {
private String titulo;			
private String autor;		
private int anioPublicacion;

/**
*Constructor default
*/
public Libro () {
	titulo=" ";
	autor=" ";
	anioPublicacion=0;
}

/**
*Constructor de objeto con parámetros
*@param nuevoTitulo nuevo título
*@param nuevoAutor nuevo autor 
*@param anioNuevo nuevo año de publicación 
*/
public Libro (String nuevoTitulo, String nuevoAutor, int anioNuevo) {
	nuevoTitulo=nuevoTitulo;
	nuevoAutor=nuevoAutor;
	anioNuevo=anioNuevo;
}

/**
*Metodo de modificación del título
*@param nuevoTitulo nombre nuevo del libro
*/
public void cambiarTitulo (String nuevoTitulo){
	titulo=nuevoTitulo;
}

/**
*Metodo de modificación del autor
*@param nuevoAutor nombre nuevo del autor
*/
public void cambiarAutor (String nuevoAutor){
	autor=nuevoAutor;
}

/**
*Metodo de modificación del anioPublicacion
*@param anioNuevo año de publicación nuevo
*/
public void cambiarAnio (int anioNuevo){
	anioPublicacion=anioNuevo;
}

/**
*Obtener el título
*@return el titulo
*/
public String obtenerTitulo (){
	return titulo;
}

/**
*Obtener el autor
*@return el autor
*/
public String obtenerAutor (){
	return autor;
}
/**
*Obtener el anioPublicacion
*@return el anioPublicacion
*/
public int obtenerAnio (){
	return anioPublicacion;
}

}

