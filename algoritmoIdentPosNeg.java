import java.util.Scanner;
public class algoritmoIdentPosNeg{
    public static void main(String[] agrs)
    {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        double numero = numero1.nextDouble();
        if(numero==0){
            System.out.println("El numero que ingresaste es neutro");
        }else if (numero>0){
            System.out.println("El numero que ingresaste es positivo");
        }else {
            System.out.println("El numero que ingresaste es negativo");
        }
        numero1.close();
        }

    }