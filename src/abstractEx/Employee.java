package abstractEx;

public class Employee extends Person {
    Employee (String name, String address, int age){
        super(name, address, age);
    }

    @Override
    boolean increasePay(int percent) {
        System.out.println("Increasing hourly rate by " + percent);
        return true;
    }
}

