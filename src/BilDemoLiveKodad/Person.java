package BilDemoLiveKodad;


public class Person {

    protected String name;
    protected String address;
    protected int age;
    
    //dafault-konstruktor, måste ha denna eftersom den implicita försvinner så fort vi 
    //lägger till en egen konstruktor
    //anropas av super-konstruktorn i CarOwner
    public Person(){};
    
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
