import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text;
        char character;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            text = sc.nextLine();
        } while (text.isEmpty());
        System.out.print("Introduce un carácter: ");
        character = (char) System.in.read();
        numeroDeVeces = countLetters(text, character);
        System.out.println("El caracter " + character + " aparece " + numeroDeVeces + " veces");
    }

    //método para calcular el número de veces que se repite un carácter en un String
    public static int countLetters(String str, char letter) {
        //se busca la primera vez que aparece
        int posicion = str.indexOf(letter);
        int count = 0;
        while (posicion != -1) { //mientras se encuentre el caracter
            count++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = str.indexOf(letter, posicion + 1);
        }
        return count;

    }
}