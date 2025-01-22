/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad38;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad38 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int serie;
        System.out.println("Selecciona la moneda que deseas convertir");
        System.out.println("1. Around 40 Otoko no Isekai Tsuuhan");
        System.out.println("2. Akuyaku Reijou Tensei Ojisan");
        System.out.println("3. Salaryman ga Isekai ni Ittara Shitennou ni Natta Hanashi");
        System.out.println("4. Overlord");
        System.out.println("5. Fuguushoku \"Kanteishi\" ga Jitsu wa Saikyou Datta");
        System.out.println("Ingresa el numero de la sere de anime que quiereas ver la sinopsis");
        serie = teclado.nextInt();     
        switch(serie){
            case 1:
                System.out.println("La historia de un hombre de mediana edad que hace lo que quiere con el poder de las compras en línea con 1 clic. Kenichi, "
                        + "un hombre soltero de unos 40 años, es transportado a otro mundo sin motivo aparente. Mientras intenta escapar de un peligroso bosque "
                        + "plagado de monstruos, se da cuenta de que tiene el poder de acceder a una enorme tienda online. Utilizando este poder para intercambiar "
                        + "por dinero en efectivo los productos que encuentra en este nuevo mundo, y comprando luego otros más modernos en Internet, "
                        + "es capaz de crear rápidamente un negocio muy popular. Sin embargo, su objetivo es tener una vida lenta y pausada. "
                        + "En lugar de hacer crecer aún más su negocio, decide sentar la cabeza y vivir del poder de Jeff Bezos. "
                        + "¡La vida por correspondencia de un hombre de mediana edad en otro mundo comienza ahora!\n");
                break;
            case 2:
                System.out.println("Después de un accidente de tránsito, el oficinista de 52 años Kenzaburou Tondabayashi despertó para descubrir que "
                        + "se había convertido en Grace Auvergne, la hija del Duque, y más importante aún, la villana de un juego otome. "
                        + "Sin desear entrometerse en los finales felices de los jóvenes personajes a su alrededor, Grace se propone cumplir el rol "
                        + "de la villana, pero cuando lo intenta las memorias de Kenzaburou como un padre afectuoso se interponen o derechamente "
                        + "no es capaz de recordar correctamente esos pomposos nombres extranjeros, al parecer esto va a ser mucho más difícil "
                        + "de lo que esperaba\n");
                break;
            case 3:
                System.out.println("El Rey Demonio recluta a un asalariado común y corriente para convertirse en uno de sus Cuatro Reyes Celestiales en otro mundo. ¿Qué podría salir mal? Uchimura Denosuke es un asalariado normal y corriente que intenta ascender en la escala corporativa. Pero entonces es convocado a un terrorífico mundo de fantasía por el Demon Overlord, ");
                break; 
            case 4:
                System.out.println("La historia da comienzo cuando Yggdrasil, un popular juego online, es cerrado un día sin previo aviso. Sin embargo, el protagonista, Momonga, decide no salir del juego. Momonga así se transforma y se convierte en “el mago más poderoso”. El mundo sigue cambiando con él dentro, ");
                break;
            case 5:
                System.out.println("En un mundo de fantasía donde los \"trabajos\" son dados por Dios desde el nacimiento, los héroes nacen, no se hacen... y el trabajo de Ein como \"Tasador\" lo ha alejado lo más posible del pedestal de \"héroe\".");
                break;
                default:
                System.out.println("Numero de saerie no valido");
        }

    }
}
