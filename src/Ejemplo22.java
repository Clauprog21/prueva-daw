import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int año = sc.nextInt();
        if ((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0))) {
            System.out.println("El año " + año + " ES bisiesto.");
        } else {
            System.out.println("El año " + año + " NO es bisiesto.");
        }

    }


}



