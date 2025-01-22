/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad32;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Ya puedes votar");
        } else {
            System.out.println("Aun no puedes votar");
        }
    }
}
