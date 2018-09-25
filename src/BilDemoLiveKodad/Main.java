package BilDemoLiveKodad;


public class Main {
    
    public static void main(String[] args){
        
        Bil saaben = new Bil("qwe123", "combi", "saab");
        Bil volvo = new Bil("rty456", "240", "volvo");
        
        CarOwner anna = new CarOwner("Anna","Stockholm",23, saaben);
        CarOwner bertil = new CarOwner("Bertil","Göteborg",32, null);
        
        anna.printMe();
        bertil.printMe();
        
        System.out.println("");
        anna.försäljning(bertil);
        System.out.println("");
        
        anna.printMe();
        bertil.printMe();
    }

}
