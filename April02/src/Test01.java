
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0 ; i < 10 ; i++) {
//			for(int j = 0 ; j < 10 - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < (i + 1 ) * 2 - 1; j++) {
//				if(j == 0 || j == 2 * i || i == 9) {
//					System.out.print("*");
//					
//				}else {
//					System.out.print(" ");	
//				}
//							
//			}
//			System.out.println();
//			
//		}
		
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
