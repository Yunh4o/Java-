import java.text.NumberFormat;
import java.util.Scanner;

public class D3lotteryticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入和： (0~27)");
		int sum = sc.nextInt();
		float Probability;
		
		//所有结果
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				for(int k=0;k<10;k++) {				
//						System.out.println(i+"\t"+j+"\t"+k);
//						count ++;
//					
//				}				
//			}			
//		}
		
		//和值概率
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
	
					if(i + j + k == sum) {
					//	System.out.println(i+"\t"+j+"\t"+k);
						count ++;
					}
					
				}				
			}			
		}	
		NumberFormat numberFormat = NumberFormat.getPercentInstance();  
        //设置百分数精确度2即保留两位小数  
		numberFormat.setMinimumFractionDigits(2);  
        Probability = (float)count/1000;  

		System.out.println("count = "+count);
        System.out.println("Probability = " + numberFormat.format(Probability));  
        

		

		
	}

}
