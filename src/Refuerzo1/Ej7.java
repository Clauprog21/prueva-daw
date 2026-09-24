package Refuerzo1;
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("introduce el num");
        if(num%2==0 || num%3==0) {
            System.out.println("Es multiplo de dos y tres");
        }else{
            System.out.println("No es multiplo de dos y de tres");
        }
        {

        }
    }
}
