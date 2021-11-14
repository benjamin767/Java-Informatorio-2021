import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String str;
        boolean flag=true;
        String question;

        do {
            System.out.println("add a city: ");
            str = sc.nextLine();
            arrayListString.add(str);

            do {
                System.out.println("you want to add another city? (Yes = y or Y or YES or yes)");
                question = sc.nextLine();

            }while (question.isEmpty());
            if(question.equals("y") || question.equals("Y") ||
            question.equals("yes") || question.equals("YES")){
                flag = true;
            }
            else{
                flag = false;
            }

        }while (flag == true);
        sc.close();
        runArraylist(arrayListString);
    }

    public static void runArraylist(ArrayList<String> arrayList){
        Iterator<String> nameIterator = arrayList.iterator();
        int i= 1;
        while(nameIterator.hasNext()){

            String element = nameIterator.next();
            System.out.println("#" +  i + " - " + element);
            i++;
        }
    }
}
