import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homer", "Simpson", LocalDate.now().minusYears(40)),
                new Alumno("Marge", "Simpson", LocalDate.parse("1989-06-14")),
                new Alumno("Bart", "Simpson", LocalDate.parse("2008-11-14")));

        Map<String, Integer> alumnosMap = alumnos.stream()
                .collect(Collectors.toMap(alumno ->construirClave(alumno), alumno -> calcularEdad(alumno)));
        System.out.println(alumnosMap);
    }
    public static String construirClave(Alumno alumno){
        return alumno.getApellido().concat(" ").concat(alumno.getNombre());
    }

    public static Integer calcularEdad(Alumno alumno){
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }
}

