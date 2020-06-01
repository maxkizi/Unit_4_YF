package abstractEx;

public class Contractor extends Person {
    Contractor (String name, String address, int age){
        super(name, address, age);
    }

    @Override
    boolean increasePay(int percent) {
        if (percent > increaseCap){
            System.out.println("Sorry, we can not increase your hourly rate more than " + increaseCap + " %");
            return false;
        }
        else {
            System.out.println("Increasing hourly rate by " + percent + " %");
            return true;
        }
    }
}
