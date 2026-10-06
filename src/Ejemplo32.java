import java.util.Scanner;
public class Ejemplo32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int resul=0;
        System.out.println("introduce n1");
        System.out.println("introduce n2");
        for (int i = 0; i < n2; i++) {
            resul+=n1;
            System.out.println("El resultado"+n1+"x"+n2+"es:"+resul);
        }

    }
}
