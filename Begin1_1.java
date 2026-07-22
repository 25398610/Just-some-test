class animal {
    public void display() {
        System.out.println("I am just a animal.");
    }
}
class cat extends animal{
    public  void display(){
        System.out.println("I am just a cat.");
    }
}
//对多态认知的小测试
public class Begin1_1 {
    public static void main(String[]args){
        animal a =new animal();
        cat b =new cat();
        animal c = new cat();
        a.display();
        b.display();
        c.display();
    }

}
