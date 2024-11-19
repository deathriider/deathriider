class inherit {
    void hello(){
        System.out.println("hi muggleborn");
    }
}
class pureblood extends inherit {
    void bye(){
        System.out.println("hi pureblood");
    }
}
public class main{
public static void main(String[] args) {
    pureblood harry = new pureblood();
    harry.hello();
    harry.bye();
}
}
