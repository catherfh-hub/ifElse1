import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        // Retiro de cajeo
        Scanner leer = new Scanner(System.in);
        double saldo = 4000.0,retiro;
        System.out.println("No lo haga joven: cuanto va retirar :(");
        retiro = leer.nextDouble();

        if(retiro <=saldo && retiro > 0){
            saldo = saldo -retiro;

            System.out.println("Saldo nuevo pobre es:"+saldo);
        }else{
            System.out.println("Pobre saldo insuficiente, trabaja");
        }


        System.exit(0);
        int edad = 19;
        if(edad >= 18){
            System.out.println("GTA6 and left for dead , con el ingeniero oh la ingeniera :D");
        }else{
            System.out.println("Uno, Minecraft, Barbies, Carritos, Tazos ");
        }
    }
}