import java.util.Scanner;

public class SalonNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de estudiantes: ");
        int numeroE = scanner.nextInt();
        int promedioG = 0;
        int notaMayor = 0;
        int notaMenor = 5;
        int suma = 0;
        for (int i = 0; i < numeroE; i++) {
            System.out.print("Ingrese su nota: ");
            int nota = scanner.nextInt();
            suma+=nota;
            if (nota > notaMayor) {
                notaMayor=nota;
            }

            if (nota<notaMenor) {
                notaMenor = nota;
            }
        }
        promedioG = suma/numeroE;
        System.out.println("SU PROMEDIO ES: " + promedioG);
        System.out.println("LA NOTA MAYOR ES: " + notaMayor);
        System.out.println("LA NOTA MENOR ES: " + notaMenor);
        scanner.close();
    }

}
