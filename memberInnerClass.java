public class memberInnerClass {
    private int data = 50;
    class Inner{
        void msg(){
            System.out.println("data is: " + data);
        }
    }
    public static void main(String[] args){
        memberInnerClass s = new memberInnerClass();
        memberInnerClass.Inner a = s.new Inner();
        a.msg();
    }
}
