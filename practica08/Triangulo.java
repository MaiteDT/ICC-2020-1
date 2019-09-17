package geometria;

/**
* Representa un polígono de tres lados. Está definido por tres puntos en el plano cartesiano.
* @author Díaz Tinoco Gisel Maite
* @version 1.0 17/Sep/2019
*/
public class Triangulo{
	public static final int EQUILATERO=0;
	public static final int ESCALENO=2;
	public static final int ISOSCELES=1;
	private Punto a;
	private Punto b;
	private Punto c;
/**
*Constructor default de un triangulo equilatero de lado 1 con vértices en (0,0), (1,0) y (0.5, sin(pi/3))
*/
public Triangulo (){
	a=new Punto ();
	b=new Punto (1,0);
	c=new Punto (0.5, Math.sin(Math.PI/3));
}
/**
*Constructor de un triángulo con los puntos dados
*@param s Punto a
*@param p Punto b
*@param q Punto c
*/
public Triangulo (Punto s, Punto p, Punto q){
	a=s;
	b=p;
	c=q;
}
/**
*Método que determina si los vértices de este triángulo están alineados.
*@return boolean 
*/
public boolean tieneVerticesAlineados(){
	return a.estanAlineados(b,c);
}
/**
*Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
*@return tipo de triángulo 
*/
public int tipo(){
	if (a.distancia(b)==b.distancia(c) && b.distancia(c)==c.distancia(a)){
		return EQUILATERO;
	}
	if (a.distancia(b)==a.distancia(c) || b.distancia(c)==c.distancia(a) || c.distancia(a)==c.distancia(b)){
			return ISOSCELES;
		} else {
		return ESCALENO;
	}
}
}