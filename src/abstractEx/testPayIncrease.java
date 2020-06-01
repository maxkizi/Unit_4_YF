package abstractEx;

public class testPayIncrease {
    public static void main(String[] args) {
        Person workers [] = new Person[3];
        workers[0] = new Employee("Max Kizilov", "Kirov", 26);
        workers[1] = new Contractor("Milena Telegina", "Chelyabinsk", 23);
        workers[2] = new Employee("Mary Lubnina", "Moscow", 35);
        workers[0].changeAddress("Saint-Petersburg");

        for (Person p: workers){
           System.out.println(p.getInfo());
           p.promote(30);
        }

    }
}
