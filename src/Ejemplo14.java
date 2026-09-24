import java.util.Scanner;
public class Ejemplo14 {
    public static void main(String[] args) {
        int  segundos, minutos, horas;
         System.out.println("Los segundos son ");
        Scanner sc = new Scanner(System.in);
        segundos= sc.nextInt();

        System.out.println("Los minutos son ");
        minutos= sc.nextInt();

        System.out.println("Las horas son ");
        horas= sc.nextInt();
        segundos++;

        if (segundos>60){
            segundos=minutos++;
            if (minutos==60){
                minutos=0;
                horas++;

                System.out.println("horas" + "minutos"+  "Segundos" );
            }
        }


    }
}
