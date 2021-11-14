import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int acu = 0;
        sc.close();

        for(int i=1; i < num2; i++){
            acu = acu + num1;
        }

        System.out.println("the result of the multiplication is: " + acu);
    }
}
