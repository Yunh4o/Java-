
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¿ÕÐÄÈý½Ç
		for(int i = 0 ; i <= 10 ; i++) {
			for(int j = 0 ; j < 10 - i ; j++) {
				System.out.print(" ");	
			}
			for(int j=0;j<2*i+1;j++) {
				if(j == 0 || j == 2 * i || i == 10) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");	
				}	
			}
			System.out.println();
	
		}
		
		
		
		
	}
}
