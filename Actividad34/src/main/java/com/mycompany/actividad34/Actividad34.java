/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad34;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad34 {

    public static void main(String[] args) {
                double compra, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de la compra");
        compra = teclado.nextDouble();
        if (compra >=100 && compra <= 200){
            resultado = compra * .10;
            compra = compra - resultado;
            System.out.println("El total es: " + compra);
        }else if(compra > 200 && compra <= 500 ){
            resultado = compra * .20;
            compra = compra - resultado;
            System.out.println("El total de la compra es:" +compra);
        }else if (compra > 500) {
            resultado = compra * .25;
            compra = compra - resultado;
            System.out.println("El total de la compra es: " + compra);
        }else{
            System.out.println("No aplica ");
        }
    }
}
