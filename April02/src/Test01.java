
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
			//�ո�����
			int spaceCount = Math.abs(lineCount/ 2 - i) ;
			for(int j = 0 ; j < spaceCount ; j++) {
				System.out.print(" ");
			}
			
			//*������
			int starCount = (  lineCount / 2 - spaceCount ) * 2 + 1;
			for(int j = 0 ; j < starCount ; j++) {
				if(j == 0 || j == starCount -1) {
					//�߽��ӡ*
					System.out.print("*");
				}else {
					//�ڲ���ӡ�ո�
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
