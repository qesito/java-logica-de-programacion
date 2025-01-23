import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese su primer número: ");
            double num1 = teclado.nextDouble();

            System.out.println("Ingrese su segundo número: ");
            double num2 = teclado.nextDouble();

            System.out.println("Selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion = teclado.nextInt();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            System.out.println("El resultado es: " + resultado);

            System.out.println("¿Desea realizar otra operación? (S para continuar / cualquier otra tecla para salir):");
            String respuesta = teclado.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        System.out.println("adios");
        teclado.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}

