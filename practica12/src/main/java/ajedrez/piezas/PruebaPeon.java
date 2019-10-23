package ajedrez.piezas;

public class PruebaPeon {
Posicion inicial= new Posicion (0,1);
Peon p1= new Peon (Color.BLANCO, inicial);
 
 public String getJugadas() {
 	String retorno= new String ("");
 	for (int i=0 ; i<4 ; i++) {
 		retorno += p1.obtenerJugadasLegales() + " ";
 	}
 	return retorno;
 }
}