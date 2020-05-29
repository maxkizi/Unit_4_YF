public class Contractor extends Person implements Payable {
    String name;

    Contractor (String name){
    super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent > INCREASE_CAP){
            System.out.println("Sorry, can't increase your hourly rate by more than " + Payable.INCREASE_CAP);
            return false;
        }
        else {
            System.out.println("Increasing hourly rate by " + percent + " for " + getName());
            return true;
        }
    }
}
