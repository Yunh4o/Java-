import java.util.Scanner;

public class MaxMinMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numbers = new Scanner(System.in);
		System.out.print("�������һ������");
		int a1 = numbers.nextInt();
		System.out.print("������ڶ�������");
		int a2 = numbers.nextInt();
		System.out.print("���������������");
		int a3 = numbers.nextInt();
		
		int max = a1;
		int min = a1;
		int mid ;		
		int sum = a1 +a2 + a3;
		//���ֵ
		if(a2 > max) {
			max = a2;
		}
		if(a3 > max) {
			max = a3;
		}
		//��Сֵ
		if(a2 < a1) {
			min = a2;
		}
		if(a3 < min) {
			min = a3;
		}
		//�м�ֵ
		mid = sum - max - min;		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("mid:"+mid);

	}

}
