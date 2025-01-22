/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad37;

import java.util.Scanner;

/**
 *
 * @author srraz
 */
public class Actividad37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pesos, resultado = 0;
        int moneda;
        System.out.println("Ingresa la cantidad en pesos mexicanos");
        pesos = teclado.nextDouble();
        System.out.println("Selecciona la moneda que deseas convertir");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.println("Ingresa el numero de la moneda que quieras cambiar");
        moneda = teclado.nextInt();     
        switch(moneda){
            case 1:
                resultado = pesos*20.64;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Dolares estadounidenses");
                break;
            case 2:
                resultado = pesos*21.51;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Euros");
                break;
            case 3:
                resultado = pesos*0.61;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Bath");
                break; 
            case 4:
                resultado = pesos*0.13;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Yenes");
                break;
            case 5:
                resultado = pesos*0.014;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Won");
                break;
            case 6:
                resultado = pesos*12.95;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Dolares australiano");
                break;
            case 7:
                resultado = pesos*5.56;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+"   en Soles");
                break;
            case 8:
                resultado = pesos*14.41;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Dolares canadiense");
                break;
            case 9:
                resultado = pesos*0.37750;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Bolivares");
                break;
            case 10:
                resultado = pesos*0.020;
                System.out.println(pesos +" pesos mexicanos son: "+resultado+" en Peso argentino");
                break;
                default:
                System.out.println("Moneda invalida");
        }
    }
}
