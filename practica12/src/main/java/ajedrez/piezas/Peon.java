package ajedrez.piezas; 

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {
	public Peon (Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List <Posicion> obtenerJugadasLegales(){
		LinkedList<Posicion> jugadas = new LinkedList <> () ;
		int fila = obtenerPosicion().obtenerFila();
		int	columna =obtenerPosicion().obtenerColumna();
		if (obtenerColor()==Color.BLANCO) {
			if (fila==1) {
				jugadas.add(new Posicion (fila+2, columna));
			}
			if (fila-1 >= 0 && columna-1 >=0){
				jugadas.add(new Posicion (fila-1, columna-1));
			}
			if (columna-1>=0) {
				jugadas.add(new Posicion (fila, columna-1));
			}
			if (fila+1<=7 && columna+1<=7) {
				jugadas.add(new Posicion (fila+1, columna+1));
			}
		} else {
			if (fila==6) {
				jugadas.add(new Posicion (fila-2, columna));
			}

			if (fila+1 <=7 && columna+1 <=7){
				jugadas.add(new Posicion (fila+1, columna+1));
			}
			if (columna+1<=7) {
				jugadas.add(new Posicion (fila, columna+1));
			}
			if (fila-1>=0 && columna-1>=0) {
				jugadas.add(new Posicion (fila+1, columna+1));
			}
		}
	return jugadas;	
	}
}