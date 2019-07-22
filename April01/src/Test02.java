import java.text.NumberFormat;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
			float Probability;	
			int [] counts = new int[28];
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					for(int k=0;k<10;k++) {	
						int sum = i + j + k;
						counts[sum]++;
					
					}							
				}
			}
			
			NumberFormat numberFormat = NumberFormat.getPercentInstance();  
			numberFormat.setMinimumFractionDigits(2);  //���ðٷ�����ȷ��2��������λС��
			for(int i = 0 ; i < counts.length; i++) {
				System.out.println("sum = "+ i +"    ���ִ���: "+counts[i]);
				Probability = (float)counts[i]/1000; 
				System.out.println("Probability = " + numberFormat.format(Probability)); 
				System.out.println("----------------------");
			}
				
	}

}
