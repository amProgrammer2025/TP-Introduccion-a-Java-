/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05_unidad01;

import java.util.Scanner;

/**
 *
 * @author gauta
 */
public class Ejercicio05_Unidad01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = "+ (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
    
}
