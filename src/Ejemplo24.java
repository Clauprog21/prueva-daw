import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int positivos=0;
        System.out.println("introduce un numero");
        do {
            num = sc.nextInt();
            if (num >= 0) {
                positivos++;
            }
        }while (num != 0);

    }
}
