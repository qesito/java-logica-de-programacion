import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingresa un número entero positivo: ");
        int numero = teclado.nextInt();

        int contadorDigitos = 0;

        if (numero == 0) {

            contadorDigitos = 1;
        } else {

            while (numero > 0) {
                numero = numero / 10; contadorDigitos++;
            }
        }


        System.out.println("El número ingresado tiene " + contadorDigitos + " dígito(s).");
    }
}

