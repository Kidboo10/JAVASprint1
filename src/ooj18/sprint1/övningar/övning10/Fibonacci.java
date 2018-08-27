package ooj18.sprint1.övningar.övning10;

//Fibonacci-sekvensen:
//0,1,1,2,3,5,8,13,21

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args){

        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
    }
}
