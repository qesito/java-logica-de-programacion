import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número para calcular el factorial: ");
        int numero = scanner.nextInt();


        if (numero < 0) {
            System.out.println("No se puede definir factorial para números negativos.");
        } else {
            int contador = 1;
            int i = 1;


            while (i <= numero) {
                contador = contador * i; i++;
            }

            System.out.println("El factorial de " + numero + " es: " + contador);
        }



    }
}
