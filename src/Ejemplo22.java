import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
            System.out.println("El año " + anio + " ES bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

    }


}



