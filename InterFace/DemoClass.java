package InterFace;

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.print("Some text...");
    }
    public void myOtherMethod(){
        System.out.print("some other text...");
    }
}
