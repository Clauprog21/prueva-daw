import java.util.Scanner;
public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        int positivos=0;
        System.out.println("Introduce numeros hasta 10 ");
        for (int i = 0; i <= 10; i++) {
            num= sc.nextInt();
            if (num >= 0) {
                positivos++;
            }
        }
        System.out.println("Los positivos son"+positivos);
    }
}
