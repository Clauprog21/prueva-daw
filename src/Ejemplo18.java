import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String[] args){
        double consumohoras;
        System.out.println("el consumo mensual es");
        Scanner sc= new Scanner(System.in);
        consumohoras= sc.nextDouble();
        double precio;
        System.out.println("El precio es");
        precio= sc.nextDouble();
        if (consumohoras<=100) {
            precio = consumohoras* 0.10;
        } else if (consumohoras<=300) {
            precio =consumohoras* 0.15;
        }else{
            precio=consumohoras*0.20;

        }
        System.out.println("la tarifa es");
        {
        }

    }
}
