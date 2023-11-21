class setge{
    String name;
    int sid;
    void set(String n , int id){
        name = n;
        sid = id;
    }
}

public class aman {
    public static void main(String[] args) {
     setge s1 = new setge();
     s1.set("am", 12);
     System.out.println("The value of name = " + s1.name + ". The value of id = " + s1.sid + ".");   
    }
}