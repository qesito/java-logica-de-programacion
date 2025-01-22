/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad31;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad31 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double parcial, proyecto, examen, promedio;
      System.out.println("Ingrese la calificacion del parcial:");
      parcial = teclado.nextDouble();
      System.out.println("Ingrese la calificacion del proyecto:");
      proyecto = teclado.nextDouble();
      System.out.println("Ingrese la calificacion del examen:");
      examen = teclado.nextDouble();
      if(parcial > 100 || parcial < 0 || proyecto < 0 || proyecto > 100 || examen < 0 || examen > 100 ){
          System.out.println("La calificacion debe de estar entre 0 y 100");
      }else{
          promedio = parcial * 0.4 + proyecto * 0.3 + examen * 0.3;
      System.out.println("El promedio de calificaciones es: " + promedio);
      }
      
    }
}
