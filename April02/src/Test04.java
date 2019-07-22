
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = new int[20];
//		
//		for (int i = 0 ; i < a.length ; i++) {
//			int r = (int)Math.floor(Math.random() * (93 - 14 + 1)) +14;
//			a[i] = r ;
//		}
//		for(int i = 0 ; i < a.length ; i++) {
//			System.out.println(i + " : "+ a[i]);
//		}
//		int max1 = a[0];
//		int max2 = a[0];
//		int min = a[0];
//		for(int i = 1 ; i < a.length; i++) {
//			
//			//最大和第二大
//			if(a[i] > max1 ) {
//				max2 = max1;
//				max1 = a[i];
//			}else {
//				if(a[i] > max2){
//					max2 = a[i];
//				}
//			}
//			//最小值
//			if(a[i] < min ) {
//				min = a[i];
//			}
//		}
//		System.out.println("max1 = " + max1);
//		System.out.println("max2 = " + max2);
//		System.out.println("min = " + min);
		
		int[] counts = new int[10];
		
		long l = 16666666666661l;
		while(l>0) {
			
			int x = (int)( l % 10) ;
			counts[x]++;
			l /= 10 ;	
		}	
		for(int i = 0 ; i < counts.length ; i++) {
			System.out.println("count"+i+" : "+counts[i]);
		}
	}

}
