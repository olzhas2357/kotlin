package innerClass;
class OuterClass {
  int x = 10;

  class InnerClass { // private class InnerClass an error occurs 
    int y = 5;
  }
}

class outerClass{
  int z = 11;
  static class innerClass{
    int w = 12;
  }
  static void mymethod(){
    System.out.println("test worked");
  }
}

class outer1{
  int d = 10;
  class inner1{
      public int myInnerMethod(){
        return d;
      }
  }
}


public class Main2 {

  int x = 2;
  static int foo(){
     return 3; 
  }

  public static void main(String[] args) {

    Main2 main2 = new Main2();  
    System.out.println(Main2.foo() + main2.x);


    // OuterClass myOuter = new OuterClass();
    // OuterClass.InnerClass myInner = myOuter.new InnerClass();
    // System.out.println(myInner.y + myOuter.x);
    
    outerClass.innerClass inner = new outerClass.innerClass();
    System.out.print(inner.w);
    
    // outer1 myOuter = new outer1();

    // outer1.inner1 myInner = myOuter.new inner1();
    // System.out.println(myInner.myInnerMethod() + myOuter.d);
  }
}
