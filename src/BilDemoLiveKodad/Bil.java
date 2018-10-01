package BilDemoLiveKodad;


public class Bil {
    
    //test
    
    protected String regNr;
    protected String model;
    protected String label;
    
    public Bil(String regNr, String model, String label){
        this.regNr = regNr;
        this.model = model;
        this.label = label;
    }
    
    public String getRegNr(){
        return regNr;
    }

}
