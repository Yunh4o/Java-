@SuppressWarnings("unused")
public class Test01 {
	
	public static void main(String[] args) {
		//������ָ��ջ��ѵõ�ַ
		//������ָ�����εĵ�ַ
		int a = 1;
		a += 100;
		fn1(222);
		
	}
	
	//�ݹ����   	Recursion
	
	public static void fn1(int x) {
		//�����Ǿֲ�����������ʼֵ�ǵ��ô��ݹ�����
		//�ֲ�����  local variable
		int a = 100;
		fn2();
	}
	
	public static void fn2() {
		int a = 200;
	}
	
	
}
