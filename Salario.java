import java.util.Scanner;

public class Salario{ 
	public static void main (String[] args) {

        double	sbruto,impuestos,deducciones,sneto,Impuesto;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese su salario bruto: ");
	sbruto = teclado.nextDouble();
	
	System.out.println("Ingrese el porcentaje de impuestos: ");
	impuestos = teclado.nextDouble();
	
	System.out.println("Ingrese sus deducciones adicionales: ");
	deducciones = teclado.nextDouble();

	Impuesto = sbruto*(impuestos/100);
	
	System.out.println("Sus impuestos son: " + Impuesto);

	sneto = sbruto - Impuesto - deducciones;

	System.out.println("Su salario neto es: " + sneto);

	teclado.close();
 
}
}
