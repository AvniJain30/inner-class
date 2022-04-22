interface showable{
    void show();
    interface message{
        void msg();
    }
}
public class nestedInterface implements showable.message{
    public void msg(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        showable.message m = new nestedInterface();
        m.msg();
    }
}
