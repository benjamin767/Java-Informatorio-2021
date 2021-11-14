import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        numeros = numeros.stream()
                .distinct()
                .map(n -> factorial(n))
                .collect(Collectors.toList());
        System.out.println(numeros);
    }

    private static Integer factorial (Integer numero) {
        if (numero==0) {
            return 1;
        }
        else
            return numero * factorial(numero-1);
    }
}
