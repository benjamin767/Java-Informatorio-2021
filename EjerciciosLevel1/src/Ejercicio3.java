import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        sc.close();

        secuencia(num);

    }
    public static void secuencia (int num){
        if(num <= 0){
            System.out.println("el numero no puede ser 0 o menor a 0.");
            return ;
        }
        int aux = 1;

        for(int i =0; i < num; i++ ){
            for(int j = 1; j <= aux; j++){
                System.out.print(j);
            }
            aux++;
            System.out.println();
        }
    }
}
