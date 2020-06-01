package interfaceEx;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers [] = new Person[3];
        workers [0] = new Employee("Mary");
        workers [1] = new Contractor("Max");
        workers [2] = new Employee(" John");

        for (Person p: workers){

            if (p instanceof Employee){
              ((Employee) p).increasePay(30);
            }
            if (p instanceof Contractor){
                ((Contractor) p).increasePay(30);
            }
        }
    }
}
