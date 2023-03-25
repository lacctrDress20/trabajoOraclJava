/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        int PrimNum = scanner.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        int SeconNum = scanner.nextInt();
        
        System.out.println("los numero impares de " +PrimNum+ " hasta "+SeconNum+ " son:");
        for(int i=PrimNum; i<=SeconNum; i++)
            if (i%2 != 0){
                System.out.println(i);
            }
        

    }
}

