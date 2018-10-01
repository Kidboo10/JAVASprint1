package ooj18.sprint1.övningar.övning9;

public class ÖvningsuppgiftEnum {
    
    public static void main(String[] args){
        for (RomerskaSiffror r : RomerskaSiffror.values()){
                System.out.println(r.toString() + " is " 
                        + r.digit );
        }
    }
}
