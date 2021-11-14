import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Integer resultado = palabras.stream()
                .filter(palabra -> palabra.startsWith("b") || palabra.startsWith("B"))
                .collect(Collectors.toList())
                .toArray().length;
        System.out.println(resultado);
    }
}
