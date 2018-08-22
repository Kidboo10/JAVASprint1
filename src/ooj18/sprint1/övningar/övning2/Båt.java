package ooj18.sprint1.övningar.övning2;

public class Båt extends Fordon implements Printable{
    private int dödvikt;
    
    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }
    
    public void sväng(){}
    
    public void printMe(){
        System.out.println("Båt med hastighet " +getHastighet()+ " km/h, vikt " + getVikt() +" kg och dödvikt: " + dödvikt);
    }
}
