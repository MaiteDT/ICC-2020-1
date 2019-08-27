import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto=new String ();
		String fechaNacimiento=new String ();
		String rfc=new String ();
		
	System.out.println("Dame tu nombre completo");
			nombreCompleto=scanner.nextLine();
			nombreCompleto=nombreCompleto.toUpperCase();
		int posicion= nombreCompleto.indexOf(" ");
			String aPaterno= nombreCompleto.substring(posicion+1, posicion+3);
		
		int posicion2= nombreCompleto.lastIndexOf(" ");
			String aMaterno= nombreCompleto.substring(posicion2+1, posicion2+2);

		int posicion3= nombreCompleto.charAt(0);
			String nombre= nombreCompleto.substring(0,1);
		

	System.out.println("Dame tu fecha de nacimiento en formato dd/mm/aaaa");
			fechaNacimiento=scanner.nextLine();
		int digito= fechaNacimiento.lastIndexOf("/");
			String anio=fechaNacimiento.substring(digito+3,digito+5);

		int digito2=fechaNacimiento.indexOf("/");
			String mes=fechaNacimiento.substring(digito2+1, digito2+3);

		int digito3=fechaNacimiento.charAt(0);
			String dia=fechaNacimiento.substring(0,2);
	

	System.out.println("Tu RFC es "+ aPaterno + aMaterno + nombre + anio + mes + dia);
	}

}
