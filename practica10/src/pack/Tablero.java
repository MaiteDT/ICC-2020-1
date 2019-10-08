package pack; 
import processing.core.PApplet;

public class Tablero extends PApplet {

	public static void main (String [] args) {
		PApplet.main ("pack.Tablero");
	}

	@Override
	public void settings () {
		size (800,800);
	}

	@Override 
	public void setup () {

	}

	@Override
	public void draw () {
	for (int linea1=0; linea1<800;linea1+=200){
		for (int blancoInicial=0;blancoInicial<800;blancoInicial+=200){
			fill (255,255,255);
			rect (blancoInicial,linea1,100,100);
		}
		for (int negroSegundo=100;negroSegundo<800;negroSegundo+=200){
			fill (0,0,0);
			rect (negroSegundo,linea1,100,100);
		}
	}
	for (int linea2=100; linea2<800;linea2+=200){
		for (int negroInicial=0;negroInicial<800;negroInicial+=200){
			fill (0,0,0);
			rect (negroInicial,linea2,100,100);
		}
		for (int blancoSegundo=100;blancoSegundo<800;blancoSegundo+=200){
			fill (255,255,255);
			rect (blancoSegundo,linea2,100,100);
		}
	}

	
}

		

		
	
	}

