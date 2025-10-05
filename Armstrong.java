import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero que usted quiera");
        Integer numero = scanner.nextInt();
        int largo = 0;
        int contar = numero;
        int result = 0;
        int comparable = 0;
        String numL = String.valueOf(numero);
        while (contar > 0) {
            contar = contar / 10;
            largo++;
        }
        for (int i = 0; i <= largo-1; i++) {
            char indiceL = numL.charAt(i);
            int indiceN = Character.getNumericValue(indiceL);
            result = (int) Math.pow(indiceN, largo);
            comparable+=result;
        }
        if(comparable== numero){
            System.out.println("El numero: " + numero + " es armstrong");
        }else{
            System.out.println("El numero: " + numero + " no es armstrong");
        }

        scanner.close();
    }
}