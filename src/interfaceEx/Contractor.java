package interfaceEx;

public class Contractor extends Person implements Payable {

    Contractor (String name){
    super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent > Payable.INCREASE_CAP){
            System.out.println("Sorry, " + name + ", can't increase your hourly rate by more than " + Payable.INCREASE_CAP);
            return false;
        }
        else {
            System.out.println("Increasing hourly rate by " + percent + " for " + getName());
            return true;
        }
    }
}
