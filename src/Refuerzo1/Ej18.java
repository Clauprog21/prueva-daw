package Refuerzo1;
import java.util.Scanner;
public class Ej18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce distancia, velocidad maxima, tiempo");
        double km= sc.nextDouble() / 1000;
        double vx= sc.nextDouble();
        double h= sc.nextDouble() / 3600;
        double v=km/h;
        if (v<=vx) {
            System.out.println("usted no tiene multa");
        }else if(v<=vx *1.2){
            System.out.println("usted tiene una multa");
        }else{
            System.out.println("te quitamos puntos,jefe");
        }

    }
}
