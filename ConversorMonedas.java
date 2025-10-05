import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos pesos : ");
        double colombiano = scanner.nextDouble(); 
        double euros = colombiano/4500;
        double dolares = colombiano/3900;
        System.out.println("El dinero en dolares es : " + dolares);
        System.out.println("El dinero en euros es : " + euros);
        scanner.close();
    }
}
