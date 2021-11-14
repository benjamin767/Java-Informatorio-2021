import java.util.ArrayList;

public class Ejercicios5 {

    public static void main(String[] args) {
        ArrayList<Integer> hrasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorXHra = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<Integer>();
        Integer sueldo = 0;
        loadHrasTrabjadas(hrasTrabajadas);
        loadValorXhra(valorXHra);

        for(int i=0; i<5; i++){
            total.add(hrasTrabajadas.get(i) * valorXHra.get(i));
        }
        System.out.println(total);

        for(int i=0; i<5; i++){
            sueldo = sueldo + total.get(i);
        }

        System.out.println("Total: " + "$" + sueldo);


    }

    public static void loadHrasTrabjadas(ArrayList<Integer> hrasTrabajadas){
        hrasTrabajadas.add(6);
        hrasTrabajadas.add(7);
        hrasTrabajadas.add(8);
        hrasTrabajadas.add(4);
        hrasTrabajadas.add(5);
    }

    public static void loadValorXhra(ArrayList<Integer> valorXHora){
        valorXHora.add(350);
        valorXHora.add(345);
        valorXHora.add(550);
        valorXHora.add(600);
        valorXHora.add(320);
    }
}
