package ooj.sprint1.demos;

public class RecursionDemo {
   protected static int faculty(int i){
        if ( i == 1){
            return 1;
        }
        else {
            return i * faculty(i-1);
       }
    }
    
    public static void main(String[] args){
        System.out.println(faculty(5));
        System.out.println(faculty(10));
    }
}

