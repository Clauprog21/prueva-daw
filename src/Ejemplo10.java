import java.util.Scanner;
public class Ejemplo10 {
    public static void main(String[] args) {
        int numero1;
        Scanner sc = new Scanner(System.in);
        System.out.println("El numero1 es ");
        numero1 = sc.nextInt();
        int numero2;
        System.out.println("El numero2 es ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero1 es el mas grande que el numero2");
        }else{
            System.out.println("El numero2 es el mas grande que el numero1");
        }
    }
}

