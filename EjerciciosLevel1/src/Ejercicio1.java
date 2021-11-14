import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese usuario: ");
        String usuario = sc.nextLine();
        sc.close();

        System.out.println("HOLA "+usuario);
    }

}
