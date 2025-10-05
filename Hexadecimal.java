import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mensaje = "";
        System.out.println("Digite el decimal");
        int numero = scanner.nextInt();
        while (numero>0) {
            int residuo = numero%16;
            numero=numero/16;
            switch (residuo) {
                case 10:
                    mensaje += "A";
                    break;
                case 11:
                    mensaje += "B";
                    break;
                case 12:
                    mensaje += "C";
                    break;
                case 13:
                    mensaje += "D";
                    break;
                case 14:
                    mensaje += "E";
                    break;
                case 15:
                    mensaje += "F";
                    break;
                default:
                    mensaje+=numero;
                    break;
                }
            }
            System.out.println(mensaje);
            scanner.close();
    }
}
