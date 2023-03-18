/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class JavaApplication18 {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num,sumatotal;
        
        sumatotal= 0;
        
        for (int i=1;i<=5;i++)
        {
        System.out.println("Ingrese los numeros que desea sumar");
        num = teclado.nextInt();
        
        sumatotal = sumatotal + num;
        }
        System.out.println("la suma total es de: "+ sumatotal);
    }   
}

