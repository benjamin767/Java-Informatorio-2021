import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num = sc.nextInt();
        int power = sc.nextInt();
        int acu= num;
        sc.close();

        for(int i=1; i < power; i++){
            acu = acu * num;
        }

        System.out.println("the result of the power is: " + acu);
    }
}
