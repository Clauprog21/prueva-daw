package Refuerzo1;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("introduce num");
        if (num % 2 != 0 && num % 3 != 0) {
            System.out.println("no multiplo de 2 ni de 3");
        } else {
            System.out.println("Es multiplo de 3 y de 2");

        }
    }
}