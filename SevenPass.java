
public class SevenPass {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			//不能输出100以内7的倍数和含有7的数
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
