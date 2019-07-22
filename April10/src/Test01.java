@SuppressWarnings("unused")
public class Test01 {
	
	public static void main(String[] args) {
		//变量名指向栈或堆得地址
		//函数名指向代码段的地址
		int a = 1;
		a += 100;
		fn1(222);
		
	}
	
	//递归调用   	Recursion
	
	public static void fn1(int x) {
		//参数是局部变量，但初始值是调用传递过来的
		//局部变量  local variable
		int a = 100;
		fn2();
	}
	
	public static void fn2() {
		int a = 200;
	}
	
	
}
