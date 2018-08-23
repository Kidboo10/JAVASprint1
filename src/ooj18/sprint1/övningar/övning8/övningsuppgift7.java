package ooj18.sprint1.övningar.övning8;

import java.util.LinkedList;
import java.util.List;


public class övningsuppgift7 {

    public övningsuppgift7(){
        
        FigurFabrik fabrik = new FigurFabrik();
        
        List<Figur> figurlista = new LinkedList<>();
        figurlista.add(fabrik.getFigur("rund"));
        figurlista.add(fabrik.getFigur("trekantig"));
        figurlista.add(fabrik.getFigur("fyrkantig"));
        
        for (Figur f : figurlista){
            System.out.println("En " + f.getClass().getSimpleName() + " med area " + f.area() );
        }
        
    }
    
    public static void main(String[] args){
        övningsuppgift7 ö = new övningsuppgift7();
    }
    
}
