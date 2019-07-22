
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int count = 0;
//		int sum ;
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				for(int k=0;k<10;k++) {
//					sum = i +j +k;
//					if(sum==15) {
//					//	System.out.println(i+"\t"+j+"\t"+k);
//						count ++;
//					}
//					
//				}				
//			}			
//		}	
//		System.out.println("count ="+count);
		
		int a1 = 1234567;
		int a2 = 0;
		while(a1>0) {
			int x= a1%10;
			a2 = a2 *10+x;
			a1/=10;
//			System.out.println(x);
			
		}
		System.out.println(a2);
	}

}
