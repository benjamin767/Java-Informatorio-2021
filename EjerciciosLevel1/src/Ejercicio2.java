import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese dos numeros para operar");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
    }
}
