import java.util.Scanner;

    public class VocalesOConsonantes {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            char letra;

            System.out.println("Ingresa letras y te diré si son vocales o consonantes.");
            System.out.println("Para salir, ingresa un espacio.");
            do {
                System.out.print("Ingresa una letra: ");
                letra = teclado.next().toLowerCase().charAt(0);

                if (letra == ' ') {
                    System.out.println("¡Programa terminado!");
                    break;
                }


                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("La letra '" + letra + "' es una vocal.");
                }
                else if (Character.isLetter(letra)) { // busca letra en avecedario en este caso vocal
                    System.out.println("La letra '" + letra + "' es una consonante.");
                }
                else {
                    System.out.println("'" + letra + "' no es una letra válida.");
                }
            } while (true);
        }
    }


