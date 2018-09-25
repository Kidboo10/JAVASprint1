package BilDemoLiveKodad;


public class CarOwner extends Person {
    
    protected Bil minBil;
    
    //konstruktor
    public CarOwner(String name, String address, int age, Bil bil){
        super(name, address, age);
        minBil = bil;
    }
    
    //private pga att jag bara vill att försäljnings-metoden ska kunna anropa dessa
    private void setMinBil(Bil bil){
        minBil = bil;
    }
    
    //private pga att jag bara vill att försäljnings-metoden ska kunna anropa dessa
    private Bil sellBil(){
        Bil tempBil = minBil;
        minBil = null;
        return tempBil;
    }
    
    //Här sker försäljningen
    public void försäljning(CarOwner nyaÄgare){
        nyaÄgare.setMinBil(sellBil());
    }
    
    //skriver ut carowners data
    public void printMe(){
        //om vi försöker skriva ut variabler från en bil som är null får vi exception
        if (minBil == null){
            System.out.println(name+" "+address+" "
                +age+" har ingen bil" );
        }
        else{
            System.out.println(name+" "+address+" "
                +age+" "+minBil.getRegNr());
        }
    }
}
