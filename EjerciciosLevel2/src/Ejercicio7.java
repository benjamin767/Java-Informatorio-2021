
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start number: ");
        int num1 = sc.nextInt();
        System.out.println("enter a number to finish");
        int num2 = sc.nextInt();

        fizzBuzzFunction(num1,num2);

    }
    public static void fizzBuzzFunction (int ini, int finish){
        finish = finish-1;
        String [] array = new String [finish];
        loadArray(array,finish);
        for(int i = 0; i < finish; i++){
            if(Integer.parseInt(array[i]) % 2 == 0 && Integer.parseInt(array[i]) % 3 == 0){
                array[i] = "FizzBuzz";
            }
            else if(Integer.parseInt(array[i]) % 2 == 0){
                array[i] = "Fizz";
            }
            else if(Integer.parseInt(array[i]) % 3 == 0){
                array[i] = "Buzz";
            }
        }
        printArray(array);
    }

    public static void loadArray(String [] array, int finish){

        for(int i = 0; i<finish; i++){
            String value = String.valueOf(i+1);
            array[i] = value;
        }
    }

    public static void printArray(String [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

}
