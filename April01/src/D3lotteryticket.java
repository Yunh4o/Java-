import java.text.NumberFormat;
import java.util.Scanner;

public class D3lotteryticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����ͣ� (0~27)");
//		int sum = sc.nextInt();
//		float Probability;
		
		//���н��
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				for(int k=0;k<10;k++) {				
//						System.out.println(i+"\t"+j+"\t"+k);
//						count ++;
//					
//				}				
//			}			
//		}
		//��ֵ����
//		for(int sum = 0 ; sum <= 27 ; sum++) {
//			int count = 0;
//			for(int i=0;i<10;i++) {
//				for(int j=0;j<10;j++) {
//					for(int k=0;k<10;k++) {
//						
//						if(i + j + k == sum) {
//							//	System.out.println(i+"\t"+j+"\t"+k);
//							count ++;
//						}
//					
//					}				
//				}			
//			}	
//			NumberFormat numberFormat = NumberFormat.getPercentInstance();  
//			//���ðٷ�����ȷ��2��������λС��  
//			numberFormat.setMinimumFractionDigits(2);  
//			Probability = (float)count/1000;  
//			
//			System.out.println("sum = " + sum +"\t" + "count = "+ count);
//			System.out.println("Probability = " + numberFormat.format(Probability));  
//			System.out.println("--------------------------");
//		}
		//�������
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
