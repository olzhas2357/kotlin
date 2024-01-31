package encapsulation;

public class Main {
    public static void main(String[] args){
        person myObj = new person();
        myObj.setName("Olzhas");
        System.out.println(myObj.getName());
    }    
}


// Class attributes can be made read-only (if you only use the get method),
//  or write-only (if you only use the set method)