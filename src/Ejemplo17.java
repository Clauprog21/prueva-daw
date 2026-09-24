import java.util.Scanner;
public class Ejemplo17 {
    public static void main (String[] args ){
        double peso;
        System.out.println("ingrese su peso ");
        Scanner sc = new Scanner(System.in);
        peso= sc.nextDouble();
        double altura;
        System.out.println("ingrese su altura ");
        altura= sc.nextDouble();
        double imc;
        imc= peso/altura*altura;
        if (imc<18.5) {
            System.out.println("Bajo Peso");
        } else if (imc == 18.5-24 ) {
            System.out.println("normal");
        } else if (imc > 18.5-24 ) {
            System.out.println("sobrepeso");
        }else{
            System.out.println("tienes sobrepeso");
        }
        {
        }



    }
}
