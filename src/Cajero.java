import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo= sc.nextInt();
        int cantingresar= sc.nextInt();
        int catiretirar= sc.nextInt();
        int ingresar=1;
        int retirar=2;
        int salir=0;
        int opcion= sc.nextInt();
        do {
            ingresar=1;
            retirar=2;
            salir=0;
            if (opcion==1) {
                ingresar= saldo+cantingresar;
                System.out.println("te ingeresamos dinero");
            } else if (opcion==2){
                retirar=saldo-catiretirar;
                System.out.println("te retiramos el dinero");

            }
            {

            }

        }while (opcion != 0);







    }
}
