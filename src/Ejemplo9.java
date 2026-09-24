import java.util.Scanner;
public class Ejemplo9 {
    public static void main(String[] args) {
        int numero1;
        Scanner sc = new Scanner(System.in);
        System.out.println("El numero1 es ");
        numero1 = sc.nextInt();
        int numero2;
        System.out.println("El numero2 es ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("Va en orden descendiente");
        }else{
            System.out.println("Va en orden ascendiente");
        }
    }
}
