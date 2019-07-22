import java.text.NumberFormat;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float Probability=0;
		
		NumberFormat numberFormat = NumberFormat.getPercentInstance();  
		//设置百分数精确度2即保留两位小数  
		numberFormat.setMinimumFractionDigits(2);
		//和值概率
		for (int sum = 0 ; sum <= 27 ; sum++) {
			int count = 0;
			for(int i=0;i<10;i++) {
				
				for(int j=0;j<10;j++) {
					for(int k=0;k<10;k++) {
			
						if(i + j + k == sum) {
						//	System.out.println(i+"\t"+j+"\t"+k);
							System.out.println("sum = "+sum);
							count ++;
							Probability = (float)count/1000;  
						}	
						System.out.println("Probability = " + numberFormat.format(Probability)); 
					}				
				}	
				
						
				
						
				
			}	
			System.out.println("count = "+count);
		}	
		
				
	}

}
