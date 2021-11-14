import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Name and last name:");
        String nameLastName= sc.nextLine();
        System.out.println("how old are you? " );
        String yearsOld= sc.nextLine();
        System.out.println("What's your address?");
        String address= sc.nextLine();
        System.out.println("In which city do you live?");
        String city= sc.nextLine();
        sc.close();

        Person person = new Person(nameLastName,yearsOld,address,city);

        System.out.println(person);
    }

    static class Person {
        private String nameLastName;
        private String yearsOld;
        private String address;
        private String city;

        Person(String nameLastName, String yearsOld, String address, String city) {
            this.nameLastName = nameLastName;
            this.yearsOld = yearsOld;
            this.address = address;
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getYearsOld() {
            return yearsOld;
        }

        public void setYearsOld(String yearsOld) {
            this.yearsOld = yearsOld;
        }

        public String getNameLastName() {
            return nameLastName;
        }

        public void setNameLastName(String nameLastName) {
            this.nameLastName = nameLastName;
        }

        @Override
        public String toString() {
            return city + " - "+ address +" - "+ yearsOld+" - "+nameLastName;
        }
    }
}
