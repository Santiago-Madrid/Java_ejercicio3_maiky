import java.util.Scanner;

public class OrdenadosN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int guarda = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = guarda;
                }
            }
        }

        System.out.println("Arreglo ordenado :");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
