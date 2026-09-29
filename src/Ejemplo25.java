import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double sumaNotas=-1;
        int cuantasNotas=-1;
        double medianota=0;
        System.out.println("itroduzca una nota");
        do {
            nota= sc.nextDouble();
            if (nota >= -1) {
               sumaNotas=sumaNotas+nota;
               cuantasNotas++;
               if(nota==10) {
                   System.out.println("la nota es 10");
               }else {
                   System.out.println("La nota no es 10");
               }
            }
        }while (nota != -1);
        medianota= sumaNotas/cuantasNotas;
        System.out.println("medianota: %2f\n es" + medianota);
    }
}
