import java.util.Scanner;
public class Ejemplo11 {
    public static void main(String[] args) {
       int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("El numero1 es ");
        nota = sc.nextInt();
        if (nota < 3){
            System.out.println(" Muy Deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 7) {
            System.out.println("Suficiente");
        } else if (nota <=7) {
            System.out.println("bien");
        } else if (nota <= 9) {
            System.out.println("notable");
        }else {
            System.out.println("sobresaliente");





        }
    }
}
