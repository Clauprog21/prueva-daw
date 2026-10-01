import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        String resul="";
        System.out.println("introduce num");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
        resul=resul+ " " +i;
            System.out.println(resul);

        }
    }
}
