import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("introduce un numero");
        do {
            num = sc.nextInt();
            if (num >= 0) {
                num++;
            }
        }while (num != 0);

    }
}
