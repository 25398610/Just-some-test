package study;
/*
	接口的成员特点：
		A:成员变量
			是常量，并且是静态的修饰的。
			默认的修饰符：public static final
		B:构造方法
			没有构造方法
		C:成员方法
			只能是抽象方法。
			默认的修饰符：public abstract

		建议：
			自己写接口的内容的时候，把这些默认修饰符加上。
*/
interface Animal{
    //int num =1;
    //final int num1 =10;这些是可以用的
public static final int num = 10;//我综合

        //public Animal(){} 构造方法是不被允许的

    public abstract void show();

    //public void method(){} 除了抽象方法之外的方法是不被允许的
void method();//这种抽象方法的一个声明
}
class Dog implements Animal{
    public void show(){
        System.out.println("Dog");
    }
    public  void method(){}
    //这里得实现接口中的两个抽象方法才行

}

public class Interface02 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.show();
        Animal d1 =new Dog();
        d1.show();//还是能用多态，这是一种向上转型
        System.out.println(d.num);
        System.out.println(Animal.num);
    }
}
