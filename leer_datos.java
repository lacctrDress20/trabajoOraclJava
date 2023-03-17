import java.util.Scanner;

import javax.sound.midi.SysexMessage;
/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/reactjs.jsx to edit this template
 */
public class leer_datos{
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println(nombre + "Bienvenido");
        
        try (Scanner leer = new Scanner(System.in)) {
          int numero;
        System.out.println("ingrese el numero");
        numero = leer.nextInt(); 
        if(numero>=10){
            System.out.println(nombre+(", el numero que ingreso es mayor que 10"));
        }
        else{
            System.out.println(nombre+(", el numero que ingreso es menor que 10"));
        }
        leer.close();
        }
    }
}