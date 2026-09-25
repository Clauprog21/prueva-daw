package Refuerzo1;
import java.util.Scanner;
public class Ej15 {
    public static void main(String[] args) {
        int tiempo, horas, minutos, segundos;
        System.out.println("Introduce el tiempo en segundos:");
        Scanner sc=new Scanner(System.in);
        tiempo= sc.nextInt();
        horas=tiempo/3600;
        tiempo=tiempo%3600;
        minutos=tiempo/60;
        tiempo=tiempo%60;
        segundos=tiempo;
        System.out.println("el tiempoes:"+tiempo);

    }
}
