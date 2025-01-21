import java.util.Scanner;

public class MasaCorporal{ 
	public static void main (String[] args) {

        double peso,altura,imc;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese su altura en metros: ");
	altura = teclado.nextDouble();
	
	System.out.println("Ingrese su peso en kilogramos: ");
	peso = teclado.nextDouble();
	
	altura = Math.pow(altura,2);
	imc = peso/altura;
	
	System.out.println("su indice de masa corporal es: " + imc);

	teclado.close();

	}
}
