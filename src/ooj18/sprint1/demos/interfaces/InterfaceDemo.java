package ooj18.sprint1.demos.interfaces;


public class InterfaceDemo {
    
    public static void main (String[] args){
        
        Student s = new Student ("Sanna", "JavaOO");
        System.out.println(s.getName()+" "+s.getFavouriteDrink());
        
        Teacher t = new Teacher("Sigrun");
        System.out.println(t.getName() + " " + t.getFavoriteDrink());
        
        IPartyAnimal m = new Student ("Mimmi", "JavaOO");
        System.out.println(m.getFavouriteDrink());
        
        IPartyAnimal t2 = t;
        System.out.println(t2.getFavouriteDrink());
        
        
        //Varför funkar inte detta?
        //System.out.println(m.getName());
        

    }

}