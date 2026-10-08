import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("introduce num");
        if (num <= 0) {
            System.out.println("Por favor, introduce un número válido mayor que 0.");
            return;
        }
             int iteracciones=0;
            System.out.print("Secuencia: " + num);
            while (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }
                iteracciones++;
                System.out.print(" -> " + num);
            }
            System.out.println("\nProceso terminado.");
            System.out.println("Total de iteraciones necesarias: " + iteracciones);
        }
    }

