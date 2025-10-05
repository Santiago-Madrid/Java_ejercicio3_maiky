import java.util.Scanner;

public class MinimoMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        Integer num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero: ");
        Integer num2 = scanner.nextInt();
        String mensaje = "  ";
        String mensaje2 = "  ";
        for (int i = 1; i <= num1; i++) {
            if(num1%i == 0){
                mensaje+= " + " + i;
            }
            
        }
        System.out.println("LOS MCD DE: " + num1);
        System.out.println(mensaje);
        for (int i = 1; i <= num2; i++) {
            if(num2%i == 0){
                mensaje2+= " + " + i;
            }
        }
        System.out.println("LOS MCD DE: " + num2);
        System.out.println(mensaje2);


        boolean veri = true;
        int result = 0;
        int sumador = 1;
        while (veri) {
            result = num1 * sumador; 
            if(result%num2 == 0){
                System.out.println("EL MCM DE: " + num1 + " Y " + num2 + " ES: " + result);
                veri=false;
            }else{
                sumador++;
            }
        }

        scanner.close();
    }
}
