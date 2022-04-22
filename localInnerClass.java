public class localInnerClass {
    private int data = 30;
    void display(){
        class local{
            void msg(){
                System.out.println("data: " + data);
            }
        }
        local l = new local();
        l.msg();
    }

    public static void main(String[] args){
        localInnerClass s = new localInnerClass();
        s.display();
    }
}
