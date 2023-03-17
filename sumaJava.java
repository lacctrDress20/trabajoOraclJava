import java.util.Scanner;
public class sumaJava {
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)) {
            int num,suma_total;
            suma_total=0;
            for (int i=1;i<=10;i++)
            {
            System.out.println("Ingrese los numeros que desea sumar");
            num=teclado.nextInt();
            suma_total=suma_total+num;
            }
        System.out.println("la suma total es de: "+ suma_total);
    }   
    }
}