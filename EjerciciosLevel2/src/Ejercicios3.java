import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicios3 {
    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<String>();
        frenchDeck(deck);
        System.out.println(deck);

        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(deck, comparator);
        System.out.println(deck);

        Collections.shuffle(deck);
        System.out.println(deck);


    }

    public static void frenchDeck(ArrayList<String> deck){
        deck.add("A");
        deck.add("2");
        deck.add("3");
        deck.add("4");
        deck.add("5");
        deck.add("6");
        deck.add("7");
        deck.add("8");
        deck.add("9");
        deck.add("10");
        deck.add("J");
        deck.add("Q");
        deck.add("K");

    }
}
