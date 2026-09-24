package Refuerzo1;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        System.out.println("introduce el numero");
        numero=sc.nextInt();
        if(numero%2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("el numero es impar");

        }
        System.out.println("el numero es"+numero);
    }
}
