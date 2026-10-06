import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña = "1";
        String cU;
        int max = 3;
        int cI = 0;
        do {
            System.out.println("Contraseña:");
            cU = sc.next();
            cI++;
            if (cU.equals(contraseña)){
                System.out.println("Acceso concedido");
            }
            if (cI >= max){
                System.out.println("Acceso denegado");
            }
        } while (cI < max);
    }
}