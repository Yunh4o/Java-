import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1����һ����λ������
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int number = sc.nextInt();
		int qian = number / 1000;
		int ge 	 = number % 10;
		int shi	 = (number % 100 -ge)/10;
		int bai  = number /100 - qian * 10;
		
		System.out.print("�����");
		System.out.print(ge);
		System.out.print(shi);
		System.out.print(bai);
		System.out.println(qian);
		
		int newNum;
		newNum = ge*1000+shi*100+bai*10+qian;
		System.out.println("�����"+newNum);
		
		//2�������ֵ����Сֵ���м�ֵ
		Scanner numbers = new Scanner(System.in);
		System.out.print("�������һ������");
		int firstNum = numbers.nextInt();
		System.out.print("������ڶ�������");
		int secondNum = numbers.nextInt();
		System.out.print("���������������");
		int thirdNum = numbers.nextInt();
		int max;
		int min;
		int mid;
		if(firstNum > secondNum) {
			if(firstNum > thirdNum) {
				max = firstNum;
				if(secondNum > thirdNum) {
					mid = secondNum;
					min = thirdNum;
				}else {
					mid = thirdNum;
					min = secondNum;
				}
			}else {
				max = thirdNum;
				mid = firstNum;
				min = secondNum;
			}
		}else {
			if(firstNum<thirdNum) {
				min = firstNum;
				if(secondNum > thirdNum) {
					max = secondNum;
					mid = thirdNum;
				}else {
					max = thirdNum;
					mid = secondNum;
				}
			}else {
				max = secondNum;
				mid = firstNum;
				min = thirdNum;
			}
			
		}
		System.out.println("���ֵ��" + max);
		System.out.println("�м�ֵ��" + mid);
		System.out.println("��Сֵ��" + min);
		
		//3������������1970/1/1
		Scanner	timeinterval = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = timeinterval.nextInt();
		System.out.print("�������·ݣ�");
		int month = timeinterval.nextInt();
		System.out.print("���������ڣ�");
		int date = timeinterval.nextInt();
		
		int years;
		int months;
		int days ;//������
		int dates;//����ڼ���
		int leapyear=0;//���������
		
		int firstDay1970=4;//1970/1/1
		int week =firstDay1970;
		//��ڼ���
		years = year -1970 + 1;
		
		//��ڼ����� ����*12 �ӵ�ǰ��
		months = (year - 1970)*12 + month ;
		
		//��ڼ���
		for(int i=1970;i<year;i++) {
			//��������� ÿ����+1
			if((i%400==0)||(i%4==0&&i%100!=0)){
				leapyear++;
		//		System.out.println(i+"����");
			}
		}
		
		//System.out.println("�ڼ�"+leapyear+"������");
		//����ڼ���
		if(month==1) {
			dates=date;
		}else if(month==2) {
			dates=31+date;
		}else if(month==3) {
			dates=31+28+date;
		}else if(month==4) {
			dates=31+28+31+date;
		}else if(month==5) {
			dates=31+28+31+30+date;
		}else if(month==6) {
			dates=31+28+31+30+31+date;
		}else if(month==7) {
			dates=31+28+31+30+31+30+date;
		}else if(month==8) {
			dates=31+28+31+30+31+30+31+date;
		}else if(month==9) {
			dates=31+28+31+30+31+30+31+31+date;
		}else if(month==10) {
			dates=31+28+31+30+31+30+31+31+30+date;
		}else if(month==11) {
			dates=31+28+31+30+31+30+31+31+30+31+date;
		}else {
			dates=31+28+31+30+31+30+31+31+30+31+30+date;
		}	
		//������ƽ�����+1
		if(((year%400==0)||(year%4==0&&year%100!=0))&&month>2){
			dates++;
		}
		
		//������=����*365 +�ڼ� ������+ ����ڼ���
		days = (year - 1970) * 365 +leapyear  + dates ;		
		//���ܼ�
		//��	һ	��	��	��	��	��
		//0		1	2	3	4	5	6	
		week = ((days-1)%7+firstDay1970)%7;
		
		System.out.println("��"+years+"��");
		System.out.println("��"+(months)+"��");
		System.out.println("��"+(days)+"��");
		System.out.print("��������Ϊ��"+week);
	}
	
}