package Refuerzo1;
import java.util.Scanner;
public class Ej19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca si, ce");
        double si = sc.nextDouble();
        double ce = sc.nextDouble();
        double sf = si + ce;
        if (sf>=0) {
            System.out.println(" voy bien");
        } else {
            System.out.println(" voy fatal");
        }
        System.out.println("El sf es"+sf);
    }
}
