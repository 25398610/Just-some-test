package study;
/*我觉得接口可以算是DLC，因为这是对一些内容的补充，比如狗，天生会呼吸，会拉屎（这可以算作狗这一个类的继承中），但是某些狗可以倒立
 拉屎，但是并不是所有的都会，所以这相当于给它自己上了一个新技能，可以相当于DLC，因为这个技能是狗一个类的本体中所没有的技能，这时就不能只用继承了，得用接口来表示这一类
因为狗继承于动物类，动物类中不具备这一技能，而这个技能不在狗这一类中是具备的，所以算DLC，也就是可以算作接口，这就是接口的作用。

接口的特点：
		A:接口用关键字interface表示
			格式：interface 接口名 {}
		B:类实现接口用implements表示
			格式：class 类名 implements 接口名 {}
		C:接口不能实例化
			接口多态。
		D:接口的子类
			a:要么是抽象类
			b:要么重写接口中的所有的抽象方法
 */
interface animal{
    public void breathe();
}
class dog implements animal{
    public void breathe(){
        System.out.println("I am dog ,I can breathe");
    }
}
abstract class cat implements animal{}
public class Interface01 {
public static void main(String[]args){
    animal a =new dog();//我多态
    a.breathe();
    //animal b =new cat();依旧抽象类无法实例化这一块 抽象方法不能有方法体，但是你抽象类中还是可以有的
}
}
