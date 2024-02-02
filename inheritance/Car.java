package inheritance;
class Vehicle{//superclass
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!!!");
    }
}
// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from

class Car extends Vehicle{ // subclass
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);    
    }
}
