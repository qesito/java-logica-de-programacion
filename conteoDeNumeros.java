import java.util.Scanner;

public class conteoDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidadNum = teclado.nextInt();

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;
        for (int i = 0; i < cantidadNum; i++) {
            System.out.println("ingrese el numero:" + (i + 1) + ":" );
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayoresCero++;
            }else if (numero < 0) {
                menoresCero++;
            }else {
                igualesCero++;
            }
        }
        System.out.println("los resultados son");
        System.out.println("mayores que 0:  " + mayoresCero);
        System.out.println("menores que 0:  " + menoresCero);
        System.out.println("iguales que 0:  " + igualesCero);

    }
}
