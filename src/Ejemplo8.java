import java.util.Scanner;
public class Ejemplo8 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("El numero es ");
        numero =sc.nextInt();
        if (numero>=0){
            System.out.println("El numero es positivo");

        }else{
            System.out.println("El numero es negativo ");
        }
    }
}


