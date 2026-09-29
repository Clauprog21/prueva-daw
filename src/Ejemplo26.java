import java.util.Scanner;
public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        long factorial=1;
        num= sc.nextInt();
        System.out.println("el num es");
        for (int i=1;i<=  num;i++){
                factorial=factorial*i;

            }
        System.out.println("El factorial es"+factorial);
        }
    }

