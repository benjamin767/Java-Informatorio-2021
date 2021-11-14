import java.util.ArrayList;


public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("add 5 integers to the array");
        for (int i=1; i<=5; i++) {
            array.add(i);
        }

        //print array before change
        runArray(array);
        System.out.println("-------- change");
        array.remove(0);
        array.add(0,10);
        array.remove(4);
        array.add(4,50);

        //print array after change
        runArray(array);

    }
    public static void runArray(ArrayList<Integer> array){
        for(int i=0; i< array.size(); i++){
            System.out.println(array.get(i));
        }
    }

}
