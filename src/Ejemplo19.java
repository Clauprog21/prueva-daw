import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String[] args) {
        double lado1,lado2, lado3;
        System.out.println("Los lados son");
        Scanner sc= new Scanner (System.in);
        lado1= sc.nextDouble();
        lado2= sc.nextDouble();
        lado3= sc.nextDouble();
        if ((lado1+lado2>lado3) && (lado1+lado3>lado2) && (lado2+lado3>lado1) ) {
            System.out.println("Triangulo");
            if(lado1 == (lado2 = lado3)) {
                System.out.println("equlatero");
            } else if (lado1==lado2||lado3==lado2||lado1==lado3) {
                System.out.println("escaleno");
            }else {
                System.out.println("isosceles");
                
            }
            {
                
            }
        }else {
            System.out.println("imposible");
            
        }
        
    }
}
