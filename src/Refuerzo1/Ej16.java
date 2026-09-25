package Refuerzo1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        System.out.println("introduce num1");
        System.out.println("introduce num2");
        System.out.println("introduce num3");
        if((num1=num2)<num3) {
            System.out.println("num3 es mayor");
        }else if(num1>(num3=num2)) {
            System.out.println("Num1 es mayor");
        }else {
            System.out.println("num2 es mayor");
        }
    }
}
