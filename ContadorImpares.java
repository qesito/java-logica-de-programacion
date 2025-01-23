import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        int contador = 1;

        System.out.println("Números impares desde 1 hasta " + numero + ":");
        do {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= numero);

        teclado.close();
    }
}

