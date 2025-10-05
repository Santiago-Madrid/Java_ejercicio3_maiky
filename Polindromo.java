import java.util.Scanner;

public class Polindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese una palabra: ");
        String palabra = scanner.nextLine();
        boolean verificacion = true;
        int i =0;
        int j = palabra.length()-1;
        while (verificacion) {
            if(palabra.charAt(i)==palabra.charAt(j)){
                 if(i==palabra.length()/2){
                    System.out.println("ES POLINDROMO");
                    verificacion = false;
                }

            }else{
                System.out.println("ERROR MH");
                verificacion = false;
            }

            i+=1;
            j-=1;
        }

        
        scanner.close();
    }
}
