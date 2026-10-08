package Refuerzo1;
import java.util.Scanner;
public class Ej20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLong()) {
            long gMic = sc.nextLong();
            double aE = sc.nextDouble();
            double gM = gMic * 1e-6;
            int dobleces = 0;
            double grosorActual = gM;
            while (grosorActual <= aE) {
                grosorActual *= 2;
                dobleces++;
            }
            System.out.println(dobleces);
        }
    }
}
