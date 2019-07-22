
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[0,1)
//		for(int i=0;i<6;i++) {
//			int red = (int)Math.floor(Math.random()*33) + 1;
//			System.err.println(red);
//		}
//		int blue = (int)Math.floor(Math.random()*16) + 1;
//		System.out.println(blue);
		int max = 0;
		int max2 = 0 ;

		for(int i = 0;i < 20;i++) {
			int x;
			x = (int)Math.floor(Math.random()* (85-10+1) ) + 10;
			System.out.println(x);

			if(x>max) {
				max=x;
			}
			
			System.out.println("max = " + max);
		}
//		System.out.println("max = " + max);
		System.out.println("max2 = " + max2);
	}
}
