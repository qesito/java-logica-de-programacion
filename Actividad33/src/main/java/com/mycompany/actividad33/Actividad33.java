/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad33;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad33 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion;
        System.out.println("Ingresa tu calificación:");
        calificacion = teclado.nextInt();
        if (calificacion >=90 && calificacion <= 100 ) {
            System.out.println("A");
        } else if (calificacion >80 && calificacion <= 89) {
            System.out.println("B");
        }else if (calificacion >70 && calificacion <= 79) {
            System.out.println("C");
        }else if (calificacion >60 && calificacion <= 69) {
            System.out.println("D");
        }else{
           System.out.println("F"); 
        }


    }
}
