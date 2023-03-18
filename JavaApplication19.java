/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        int n = teclado.nextInt();
        
        int suma= 0;
        
        for (int i=1;i<=n;i++){
            suma = suma + i;
        }  
        System.out.println("El resultado es: "  + suma);
    }
// TODO code application logic her}
}
