package abstractEx;

abstract public class Person {
    String name;
    String address;
    int age;
    final int  increaseCap = 20;
    Person(String name, String address, int age){
        this.address = address;
        this.name = name;
        this.age = age;
    }

    String getInfo (){
        return name + " age " + age + " from " + address;
    }

    void changeAddress (String newAddress){
        address = newAddress;
    }

    void ticketToSochi (){
        if (age < 25)
        System.out.println("Congrats, you are getting ticket to Sochi");
        else System.out.println("Congrats, you are getting sweet gift");
    }

    abstract boolean increasePay (int percent);

    void promote (int percent){
        ticketToSochi();
        increasePay(percent);
        System.out.println();
    }


}
