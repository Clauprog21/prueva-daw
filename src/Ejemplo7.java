import java.util.Scanner;
public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("La edad es ");
        edad =sc.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad ");
        }
    }
}
