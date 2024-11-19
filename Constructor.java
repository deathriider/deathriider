 class Construct {
    public Construct() {
   System.out.println("constructor has been called");
   
    }
    public Construct(int a){
        int n = a ;
        System.out.println(n);
    }
     void hello(){
        System.out.println("hello i am ai");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Construct obj = new Construct();
        Construct obj2 = new Construct(5); 
        obj.hello();
        obj2.hello();   
    }
    
}
