// class Animal {
//     public void animalSound(){
//         System.out.println("The animal makes a sound");
//     }    
// }

class Pig extends Animal{
    public void animalSound(){
        System.out.println("the animal pig sound: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("the animal dog sound: gaf gad ");
    }
} 

abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZ");
    }
}

// class OuterClass{
//     int x = 10;
//     class InnerClass{
//         public int myInnerMethod(){
//             return x * 2;
//         }
//     }
// }

class Main{
    public static void main(String[] args){
        // OuterClass myOuter = new OuterClass();
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        // System.out.println(myInner.myInnerMethod());    
        Pig myPig = new Pig();
        Dog myDog = new Dog();
        myPig.animalSound();
        myDog.sleep();
        myPig.sleep();
    }

}