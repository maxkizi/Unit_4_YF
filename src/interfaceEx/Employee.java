package interfaceEx;

public class Employee extends Person implements Payable {
    Employee (String name){
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + " %. " + getName());
        return true;
    }
}
