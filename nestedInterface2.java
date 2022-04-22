class A{
    interface message{
        void msg();
    }
}
public class nestedInterface2 implements A.message{
    public void msg(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        A.message m = new nestedInterface2();
        m.msg();
    }
}
