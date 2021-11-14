import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("ingre numero para factorial: ");
        int numero = sc.nextInt();
        sc.close();

        for(int i=2; i <= numero; i++){
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + "es: " + factorial);
    }

}
