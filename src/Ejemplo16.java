import java.util.Scanner;
public class Ejemplo16 {
    public static void main (String[] args){
        int horas;
        double precioHora;
        double salarioBruto;
        double impuestos;
        System.out.println("ingrese horas y precio");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();
        precioHora= sc.nextDouble();
        salarioBruto=sc.nextDouble();
        impuestos= sc.nextDouble();
        if (horas<=35) {
            salarioBruto = precioHora * horas;
        }else {
            salarioBruto= precioHora* 1.5;
            salarioBruto = salarioBruto + horas - 35;
        }
        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto<=900) {
            impuestos = (salarioBruto - 500) * 0.25;
        }else{
            impuestos= (400 * 0.25) + ( (salarioBruto - 500) * 0.45);


        }
        {
        }
    }
}
