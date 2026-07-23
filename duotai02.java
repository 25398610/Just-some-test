package study;
class fu{
    public void one(){
        System.out.println("方法of fu");
    }
    public static void man(){
        System.out.println("kunkun1");
    }
    int a= 10;//父类的成员变量
}
class zi extends fu{

    public void one(){
        System.out.println("方法of zi (重写)");
    }
    public void two(){
        System.out.println("zi自己的方法");
    }
    public static void man(){
        System.out.println("kunkun2");
    }
    int a=20;//子类的成员变量
}
public class duotai02 {
    public static void main(String[]args){
fu fu =new fu();
zi zi1 =new zi();
fu zi2 =new fu();
//zi fu1 =new fu(); 这样是不被允许的，这是一种错误的转型方向。
        zi1.one();
        zi1.two();
        fu.one();
        zi1.man();
        fu.man();//这里这个静态方法的调用，虽然看上去是重写了，实际上只是调用了自己类里面自己的那个静态方法
        System.out.println(fu.a);
        System.out.println(zi1.a);//成员变量并没有被重写，这个操作叫做变量的隐藏，其实是把父类和子类的独立的两个变量储存在了内存中不同的位置罢了
    }
}
/*
	多态的成员访问特点：
		A:成员变量
			编译看左边，运行看左边。
		B:成员方法
			编译看左边，运行看右边。

			为什么呢?
				因为成员方法有重写，而变量没有。
		C:静态方法
			编译看左边，运行看左边。

			静态方法其实没有重写这一说。因为它是跟类相关。 这是别的大佬总结的
*/