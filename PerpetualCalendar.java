import java.util.Scanner;

public class PerpetualCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	timeinterval = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = timeinterval.nextInt();
		System.out.print("�������·ݣ�");
		int month = timeinterval.nextInt();
//		int years;
		int months;//��������
		int date=1; //����1��
		int days ;//������
		int dates;//����ڼ���
		int leapyear=0;//���������
		
		int firstDay1970=4;//1970/1/1
		int week =firstDay1970;
		
		
		
		//���������
		for(int i=1970;i<year;i++) {
			//��������� ÿ����+1
			if((i%400==0)||(i%4==0&&i%100!=0)){
				leapyear++;
		//		System.out.println(i+"����");
			}
		}
		//���¶�����
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			months=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			months=30;
			break;
		default :
			if((year%400==0)||(year%4==0&&year%100!=0)) {
				months=29;
			}else {
				months=28;
			}
		
		}
		System.out.println(months+"��");
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
		if(((year%400==0)||(year%4==0&&year%100!=0))&&month>2){
			dates++;
		}	
		//������=����*365 +�ڼ� ������+ ����ڼ���
		days = (year - 1970) * 365 +leapyear  + dates ;		
		//���ܼ�
		//��	һ	��	��	��	��	��
		//0		1	2	3	4	5	6	
		
		week = ((days-1)%7+firstDay1970)%7;
		
//		System.out.println("��"+(days)+"��");
		System.out.println("����1��Ϊ��"+week);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
		for(int m=0;m<week;m++) {
			System.out.print("\t");
		}
		for (int i=1;i<=months;i++) {
			System.out.print(i+"\t");
			if((i+week)%7==0) {
				System.out.println();
			}
			
		}
		
	}

}
