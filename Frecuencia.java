import java.util.Scanner;

public class Frecuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite el numero que usted desee: ");
            Integer num = scanner.nextInt();
            array [i] = num;
        }
        for (int i = 0; i <= 9; i++) {
            int acomulador=0;
            for (int j = 0; j <= 9; j++) {
                if(array[i] == array[j]){
                    acomulador+=1;
                }
            }
            System.out.println("El numero: " + array[i] + " aparece: " + acomulador);
        }
        scanner.close();
    }
}