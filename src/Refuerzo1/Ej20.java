package Refuerzo1;
import java.util.Scanner;
public class Ej20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el grosor(micras) y la altura del edificio(m):");
        double grosor=sc.nextDouble()*0.000001;
        double altura =sc.nextDouble();
        double dobleces =sc.nextDouble();
        while (sc.hasNextLong()) {
            while (grosor <= altura) {
                grosor *= 2;
                dobleces++;
            }
            System.out.println(dobleces);
        }
    }
}
