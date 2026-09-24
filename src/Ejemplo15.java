import java.util.Scanner;
public class Ejemplo15 {
    public static void main(String[] args){
        double precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("El precio es");
        precio = sc.nextDouble();
        if (precio<=6) {
            System.out.println("no tienes descuento");
        } else if (precio>=6) {
            System.out.println("El precio es" +precio*5/100 );

        } else if (precio<=60) {
            System.out.println("El precio es" + precio * 5 / 100);

        }else {
            System.out.println("El precio es"+precio*10/100);



        }
        {

        }
        {

        }
    }
}
