import java.util.Scanner;

public class Promedio{ 
	public static void main (String[] args) {

	int a, b, c;
        double	promedio;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingresa el primer número: ");
	a = teclado.nextInt();
	
	System.out.println("Ingresa el segundo número: ");
	b = teclado.nextInt();
	
	System.out.println("Ingresa el tercer número: ");
	c = teclado.nextInt();

	promedio = (a+b+c) / 3.0;
	 
	System.out.println("el promedio es: " + promedio);

	teclado.close();
 }
}

