package interfaceEx;

public class TestPayIncrease1 {
    public static void main(String[] args) {
        Payable workers [] = new Payable[3];
        workers [0] = new Employee("Max");
        workers [1] = new Contractor("Mary");
        workers [2] = new Employee("Alex");

        for (Payable p: workers){
            p.increasePay(30);
        }
    }
}
