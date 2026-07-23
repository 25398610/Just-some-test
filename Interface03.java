package study;
interface A{}
interface B{}
class C{}
class D extends C implements A,B{}
interface E extends A,B{}
/* 这里没有报错，说明了
	类与类：
		继承关系，只能单继承。可以多层继承。
	类与接口：
		实现关系，可以单实现，也可以多实现。
		还可以在继承一个类的同时实现多个接口。
	接口与接口：
		继承关系，可以单继承，也可以多继承。
*/
public class Interface03 {
    public static void main(String[]args){

    }
}
/*我提问，
类与类：
继承关系，只能单继承。可以多层继承。，比如interface E extends A,B。
假设我A和B中都有相同的成员方法或者成员变量，那么这个E继承A和B中的成员变量或方法是继承的在extends 中位置在后面的B中的，还是在代码中位置在B后面的A的？

首先，这种写法在java中是允许的，但是仅限于接口才能这么写，类是不行的 即不能class E extends A,B这么写


譬如此代码
interface A {
    int num = 10;        // 常量
    void show();         // 抽象方法
}

interface B {
    int num = 20;        // 同名的常量
    void show();         // 同名的抽象方法
}

interface E extends A, B {
    // 此时 E 中有两个 num 吗？有两个 show() 吗？
}
不，不过在E中访问的时候得明确指定是哪个接口，否则会编译错误
// System.out.println(E.num);  // ❌ 编译报错！num 不明确
        System.out.println(A.num);     // ✅ 输出：10
        System.out.println(B.num);     // ✅ 输出：20
        就是类似这样
        但是如果你的方法（方法签名，即参数列表（即（）里面的东西）一样，即便方法体不一样）一样的话（但是接口里面只能是抽象方法，没有方法体，所以不管
        只用方法一样即可），即比如上面那个一样，此时就会把这两个抽象方法合为一个抽象方法，此时调用的时候直接E.num就行了

对于所谓的是继承在 extends 中位置在后面的 B 中的，还是在代码中位置在 B 后面的 A 的问题
接口的多继承不存在"按位置优先"的规则
但是你访问这个常量的话你得明确指定是访问的哪个接口中的
 */