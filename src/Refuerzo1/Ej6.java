package Refuerzo1;
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2, resultado;
        System.out.println("introduce el num1");
        System.out.println("introduce el num2");
        System.out.println("el resultado es");
        num1= sc.nextInt();
        num2= sc.nextInt();
        resultado= sc.nextInt();
        if(num2!=0) {
            resultado = num1 / num2;
        }else{
            System.out.println("error");
        }
        System.out.println("el resultado es" + resultado);
    }
}
