import java.util.Scanner;

public class Ejemplo33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo= sc.nextInt();
        int divisor= sc.nextInt();
        do {
            dividendo = dividendo - divisor;
        }while (dividendo>=divisor);
            System.out.println("el dividendo"+dividendo);


        }
    }

