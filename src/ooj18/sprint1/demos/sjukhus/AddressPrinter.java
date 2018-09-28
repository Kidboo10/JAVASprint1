package ooj18.sprint1.demos.sjukhus;

import java.util.ArrayList;
import java.util.List;

public class AddressPrinter {
    
    public void printAddress(IAddressee a){
           System.out.println(a.getName());
           System.out.println(a.getAddress());
           System.out.println();
    }
    
    public AddressPrinter(){
    
        Backend backend = new Backend();
        List <IAddressee> addressees = backend.getAllAdressees();
        
        for (IAddressee a : addressees){
            printAddress(a);
        }
    }
    
    public static void main(String[] args){
        AddressPrinter addressPrinter = new AddressPrinter();
    }

}