
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//正向实心
//		for(int i = 0 ; i <= 10 ; i++) {
//			for(int j = 0 ; j < 10 - i ; j++) {
//				System.out.print(" ");	
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//	
//		}
//		//反向
//		for(int i = 9 ; i >= 0 ; i--) {
//			for(int j = 0 ; j < 10 - i ; j++) {
//				System.out.print(" ");	
//			}
//			for(int j=0;j<2*i+1;j++) {
//					System.out.print("*");	
//			}
//			System.out.println();
//		}
//		
//		//正向 空心
//		for(int i = 0 ; i <= 10 ; i++) {
//			for(int j = 0 ; j < 10 - i ; j++) {
//				System.out.print(" ");	
//			}
//			for(int j=0;j<2*i+1;j++) {
//				if(j == 0 || j == 2 * i ) {
//					System.out.print("*");
//					
//				}else {
//					System.out.print(" ");	
//				}	
//			}
//			System.out.println();
//	
//		}
//		//反向
//		for(int i = 9 ; i >= 0 ; i--) {
//			for(int j = 0 ; j < 10 - i ; j++) {
//				System.out.print(" ");	
//			}
//			for(int j=0;j<2*i+1;j++) {
//				if(j == 0 || j == 2 * i ) {
//					System.out.print("*");
//					
//				}else {
//					System.out.print(" ");	
//				}	
//			}
//			System.out.println();	
//		}
		//实心菱形
		int lineCount = 17 ;
		for(int i = 0 ; i < lineCount; i++) {
			//空格数量
			int spaceCount = Math.abs(lineCount/ 2 - i) ;
			for(int j = 0 ; j < spaceCount ; j++) {
				System.out.print(" ");
			}
			//*的数量
			int starCount = (  lineCount / 2 - spaceCount ) * 2 + 1;
			for(int j = 0 ; j < starCount ; j++) {
					System.out.print("*");	
			}
			System.out.println();
			
		}
		//空心菱形
		int lineCountKong = 17 ;
		for(int i = 0 ; i < lineCountKong; i++) {
			//空格数量
			int spaceCount = Math.abs(lineCountKong/ 2 - i) ;
			for(int j = 0 ; j < spaceCount ; j++) {
				System.out.print(" ");
			}
			
			//*的数量
			int starCount = (  lineCountKong / 2 - spaceCount ) * 2 + 1;
			for(int j = 0 ; j < starCount ; j++) {
				if(j == 0 || j == starCount -1) {
					//边界打印*
					System.out.print("*");
				}else {
					//内部打印空格
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
		

	}

}
