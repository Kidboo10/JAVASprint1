package ooj18.sprint1.övningar.övning10;

//lösning från boken
public class Backwards {
    
    String str;
    
    Backwards (String s){
        str = s;
    }
    
    void backward (int i){
        if (i != str.length() -1 ){
            //System.out.println("iterating "+i+" "+str.charAt(i));
            backward(i+1);
        }
        System.out.println(str.charAt(i));
    }
}

class BWDemo{
    public static void main(String args[]){
        Backwards s = new Backwards("hej");
        
        s.backward(0);
        System.out.println("");
    }
}
