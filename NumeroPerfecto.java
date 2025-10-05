import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero que quiere verificar");
        Integer num = scanner.nextInt();
        boolean veri = true;
        int suma = 0;
        String mensaje = " ";
        while (veri) {
            for (int i = 1; i < num-1; i++) {              
                if (num%i==0) {
                    if (i==num-1){
                        suma+=0;
                    }else{
                        suma+=i;
                        mensaje += i + " + ";   
                    }
                }
            }
            mensaje += " = " + suma;  

            if(suma == num){
                System.out.println("Su numero es perfecto ");
            }else{
                System.out.println("No es perfecto ");
            }
            veri=false;
        }
        System.out.println(mensaje);
        scanner.close();
    }
}
