package Refuerzo1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("el num1 es ");
        System.out.println("el num2 es " );
        num1= sc.nextInt();
        num2= sc.nextInt();
        if (num1%num2==0) {
            System.out.println("es multiplo");
        }else{
            System.out.println("no es multiplo");
        }
    }
}
