package Refuerzo1;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("introduce num1");
        System.out.println("introduce num2");
        if(num1==num2) {
            System.out.println("Son iguales");
        }else if(num1>num2) {
            System.out.println("n1>n2");
        }else {
            System.out.println("n1<n2");
        }
    }
}
