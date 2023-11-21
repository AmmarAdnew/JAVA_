// Access modifier (private)
class A{
    private int x = 2;
    public String display(){
        // System.out.println("Hi" + x);
        return "Hi" + x;
    }
}


public class access {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);  
        // String x = ;
        System.out.println(obj.display());
    }
}
