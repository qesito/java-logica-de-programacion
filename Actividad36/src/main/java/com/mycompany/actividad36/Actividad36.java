/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad36;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad36 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tem, respuestaf, respuestak;
        int menu;
        System.out.println("Ingresa la temperatura en grados Celsius");
        tem = teclado.nextDouble();
        respuestaf = (tem*1.8)+32;
        respuestak = tem+273.15;
        System.out.println("Escribe 1 si quieres que los convienta a fahrenhei o 2 si quieres kevin");
        menu = teclado.nextInt();
        switch (menu){
            case (1):
            System.out.println("La temperatura en grados Fahrenhei son: " + respuestaf);
            break;
            case (2):
                System.out.println("La tenperatura en grados Kelvin son: " +respuestak);
                break;
            default:
                System.out.println("El numero que ingresaste no exixte");
        }
    }
}
