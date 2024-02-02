package enumpractice;

public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    } 
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        // System.out.println(myVar);

        switch(myVar){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Meduim level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
        for(Level myVar1 : Level.values()){
            System.out.println(myVar1);
        }
    }
}
