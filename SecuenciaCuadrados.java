import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        int contador = 1;

        System.out.println("Cuadrados de los números desde 1 hasta " + numero + ":");
        do {
            System.out.println(contador + " al cuadrado es " + (contador * contador));
            contador++;
        } while (contador <= numero);

        teclado.close();
    }
}

