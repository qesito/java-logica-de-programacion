import java.util.Scanner;

public class Area{
	public static void main (String[] args) {
	 int altura,base;
        double area;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingresa la altura: ");
	altura = teclado.nextInt();
	
	System.out.println("Ingresa la base ");
	base = teclado.nextInt();
	
	area = (altura*base);
	
	System.out.println("el area de tu rectángulo es: " + area);

	teclado.close();

	}
}
