import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo= sc.nextInt();
        System.out.println("ingrese saldo");
        int cantingresar= sc.nextInt();
        System.out.println("ingrese cantingresar");
        int catiretirar= sc.nextInt();
        System.out.println("ingrese cantiretirar");
        int ingresar=1;
        int retirar=2;
        int salir=0;
        int opcion;
        do {
            System.out.println("1. igresar 2. retirar 0. salir");
            opcion= sc.nextInt();
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
