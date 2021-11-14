import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        loadStudents(students);
        List<String> curso1 = students.subList(0,4);
        List<String> curso2 = students.subList(4,8);
        List<String> curso3 = students.subList(8,12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);

    }
    public static void loadStudents(ArrayList<String> students) {
        students.add("Luffy");
        students.add("Akagami Shanks");
        students.add("Usopp");
        students.add("Nami");
        students.add("Zoro");
        students.add("Franky");
        students.add("Sanji");
        students.add("Nico Robbin");
        students.add("Chopper");
        students.add("Soge King");
        students.add("Brook");
        students.add("Jimbe");
    }
}
