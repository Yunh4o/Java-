
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ʵ��
		for(int i = 0 ; i <= 10 ; i++) {
			for(int j = 0 ; j < 10 - i ; j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
	
		}
		//����
		for(int i = 9 ; i >= 0 ; i--) {
			for(int j = 0 ; j < 10 - i ; j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<2*i+1;j++) {
					System.out.print("*");	
			}
			System.out.println();
		}
		
		//���� ����
		for(int i = 0 ; i <= 10 ; i++) {
			for(int j = 0 ; j < 10 - i ; j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<2*i+1;j++) {
				if(j == 0 || j == 2 * i ) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");	
				}	
			}
			System.out.println();
	
		}
		//����
		for(int i = 9 ; i >= 0 ; i--) {
			for(int j = 0 ; j < 10 - i ; j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<2*i+1;j++) {
				if(j == 0 || j == 2 * i ) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");	
				}	
			}
			System.out.println();	
		}

	}

}
