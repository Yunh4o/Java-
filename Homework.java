import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1、对一个四位数求反序
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个四位数：");
		int number = sc.nextInt();
		int qian = number / 1000;
		int ge 	 = number % 10;
		int shi	 = (number % 100 -ge)/10;
		int bai  = number /100 - qian * 10;
		
		System.out.print("反序后：");
		System.out.print(ge);
		System.out.print(shi);
		System.out.print(bai);
		System.out.println(qian);
		
		int newNum;
		newNum = ge*1000+shi*100+bai*10+qian;
		System.out.println("反序后："+newNum);
		
		//2、求最大值、最小值和中间值
		Scanner numbers = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int firstNum = numbers.nextInt();
		System.out.print("请输入第二个数：");
		int secondNum = numbers.nextInt();
		System.out.print("请输入第三个数：");
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
		System.out.println("最大值：" + max);
		System.out.println("中间值：" + mid);
		System.out.println("最小值：" + min);
		
		//3、输入日期求到1970/1/1
		Scanner	timeinterval = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = timeinterval.nextInt();
		System.out.print("请输入月份：");
		int month = timeinterval.nextInt();
		System.out.print("请输入日期：");
		int date = timeinterval.nextInt();
		
		int years;
		int months;
		int days ;//总天数
		int dates;//当年第几天
		int leapyear=0;//闰年计数器
		
		int firstDay1970=4;//1970/1/1
		int week =firstDay1970;
		//求第几年
		years = year -1970 + 1;
		
		//求第几个月 几年*12 加当前月
		months = (year - 1970)*12 + month ;
		
		//求第几天
		for(int i=1970;i<year;i++) {
			//闰年计数器 每闰年+1
			if((i%400==0)||(i%4==0&&i%100!=0)){
				leapyear++;
		//		System.out.println(i+"闰年");
			}
		}
		
		//System.out.println("期间"+leapyear+"个闰年");
		//求当年第几天
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
		//闰年在平年基础+1
		if(((year%400==0)||(year%4==0&&year%100!=0))&&month>2){
			dates++;
		}
		
		//总天数=几年*365 +期间 闰年数+ 当年第几天
		days = (year - 1970) * 365 +leapyear  + dates ;		
		//求周几
		//日	一	二	三	四	五	六
		//0		1	2	3	4	5	6	
		week = ((days-1)%7+firstDay1970)%7;
		
		System.out.println("第"+years+"年");
		System.out.println("第"+(months)+"月");
		System.out.println("第"+(days)+"天");
		System.out.print("输入日期为周"+week);
	}
	
}