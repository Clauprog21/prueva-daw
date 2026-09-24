package Refuerzo1;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("El num 1 es");
        System.out.println("El num2 es");
        num1= sc.nextInt();
        num2= sc.nextInt();
        if(num1%10==0){
            System.out.println("Es múltiplo ");
            if (num2%10==0) {
                System.out.println("Es multiplo");
        }else {
                System.out.println("no es multiplo");
            }

        }

    }
}
