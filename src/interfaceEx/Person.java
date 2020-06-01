package interfaceEx;

public class Person {
    public String name;
    Person(String name){
        this.name = name;
    }
    public String getName(){
        return "Person's name is " + name;
    }
}
