package BilDemoLiveKodad;


public class CarOwner extends Person {
    
    protected Bil minBil;
    
    public CarOwner(String name, String address, int age, Bil bil){
        super(name, address, age);
        minBil = bil;
    }
    
    private void setMinBil(Bil bil){
        minBil = bil;
    }
    
    private Bil sellBil(){
        Bil tempBil = minBil;
        minBil = null;
        return tempBil;
    }
    
    public void försäljning(CarOwner nyaÄgare){
        nyaÄgare.setMinBil(sellBil());
    }
    
    public void printMe(){
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
