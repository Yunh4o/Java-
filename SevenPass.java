
public class SevenPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++) {
			
			if(!(i%7==0 || i%10==7 || i/10==7)) {
				System.out.print(i+"\t");
				sum++;
			}else {
				System.out.print("\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		System.out.print("\n"+sum+"¸ö");
	}

}
