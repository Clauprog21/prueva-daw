import java.util.Scanner;
public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nota;
        System.out.println("tu nota es ");
        nota= sc.nextInt();
        System.out.println("¿todo esta entregado?(si/no)");
        String entregas= sc.next();
        if (entregas.equals("si")){
            if(nota<5) {
                System.out.println("suspendido");
            } else if (nota ==5 && nota==6) {
                System.out.println("aprovado");
            } else if (nota ==7 && nota==8) {
                System.out.println("notable");
            } else if (nota ==9 && nota==10) {
                System.out.println("sobresaliente");
            }else{
                System.out.println("suspendio por no entregar todas las practicas");
            }
            {

            }
        }

    }
}
