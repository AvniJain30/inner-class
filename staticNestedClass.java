public class staticNestedClass {
    static int data = 50;
    static class Inner{
        static void msg(){
            System.out.println("data is: " + data);
        }
    }

    public static void main(String[] args){
        staticNestedClass.Inner.msg();
    }
}
