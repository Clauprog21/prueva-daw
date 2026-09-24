import java.util.Scanner;
public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe, descuento ,importefinal;
        System.out.println("ingrese el importe");
        importe= sc.nextDouble();
        descuento= sc.nextDouble();
        importefinal = sc.nextDouble();
        System.out.println("¿eres socio?(si/no)");
        String socio= sc.next();
        if(socio.equals("si")){
            if(importe>=100) {
                descuento =0.1;
            } else if (importe>=50) {
                descuento= 0.15;

            }

        }else{
            if(importe>=50){
                descuento= 0.05;
            }


            }
        importefinal=importe-(importe*descuento);
        System.out.println("el importefinal"+importefinal);
        }

    }

