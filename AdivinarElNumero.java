import java.util.Scanner;
import java.util.Random;

    public class AdivinarElNumero {
        public static void main(String[] args) {

            Random aleatorio = new Random();
            int numeroAleatorio = aleatorio.nextInt(100) + 1;

            Scanner scanner = new Scanner(System.in);

            System.out.println("He generado un número entre 1 y 100. Adivina que numero es");

            int intento = 0;
            int contador = 0;


            while (intento != numeroAleatorio) {
                System.out.print("Ingresa tu número: ");
                intento = scanner.nextInt(); contador++;


                if (intento < numeroAleatorio) {
                    System.out.println("Demasiado bajo. ¡Intenta de nuevo!");
                } else if (intento > numeroAleatorio) {
                    System.out.println("Demasiado alto. ¡Intenta de nuevo!");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número en " + contador + " intento(s).");
                }
            }
        }
    }


