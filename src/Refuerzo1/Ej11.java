package Refuerzo1;
import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("introduce num1");
        System.out.println("introduce num2");
        if(num1%2==0 && num2%2==0) {
            System.out.println("Los dos son pares");
        }else{
            System.out.println("Los dos no son pares");
        }
    }
}
