import java.util.Scanner;

public class SumaJava {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num , sumatotal;
        sumatotal = 0;
        for (int i=1;i<=3;i++)
        {
        System.out.print("Ingrese los numeros que desea sumar");
        num = teclado.nextInt();
        sumatotal = sumatotal + num;
        }
        System.out.println("la suma de los numeros es: "+sumatotal);

    }   
}
