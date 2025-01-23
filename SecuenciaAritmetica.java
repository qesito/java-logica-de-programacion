import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número de la secuencia: ");
        int primerNumero = teclado.nextInt();

        System.out.println("Ingrese la diferencia entre los números: ");
        int diferencia = teclado.nextInt();

        System.out.println("Ingrese el número máximo hasta el cual generar la secuencia: ");
        int numeroMaximo = teclado.nextInt();

        int actual = primerNumero;

        System.out.println("Secuencia aritmética:");
        do {
            System.out.println(actual);
            actual += diferencia;
        } while (actual <= numeroMaximo);

        teclado.close();
    }
}

