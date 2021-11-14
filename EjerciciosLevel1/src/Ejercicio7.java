import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< str.length(); i++) {
            char caracter = str.charAt(i);

            if (caracter==' ') {
                sb.append(' ');
            }
            if (122 >= caracter && caracter >=97)
            {
                caracter = (char)( (caracter - 32) );
                sb.append(caracter);
            }else  {
                sb.append(caracter);
            }
        }
        System.out.println(sb);

        in.close();
    }
}