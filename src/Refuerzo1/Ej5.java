package Refuerzo1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        System.out.println("introduce el num1 ");
        num1= sc.nextInt();
        if(num1==0){
            System.out.println("El producto de 0 por cualquier número es 0");
        }else{
            System.out.println("introduce el num2");
            int num2;
            num2= sc.nextInt();
            int producto = num1 * num2;
            System.out.println("El producto de "+num1+"por"+num2+"es:"+producto);
        }




    }
}
