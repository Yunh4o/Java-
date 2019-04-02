
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		
		long a1 = 12345679890l;
		while(a1 > 0) {
			int x = (int) (a1 % 10);
		
			switch(x) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;	
			case 5:
				count5++;
				break;	
			case 6:
				count6++;
				break;	
			case 7:
				count7++;
				break;	
			case 8:
				count8++;
				break;	
			case 9:
				count9++;
				break;
			}
			a1 /= 10; 
		}
		System.out.println("count0 = " + count0);
		System.out.println("count1 = " + count1);
		System.out.println("count2 = " + count2);
		System.out.println("count3 = " + count3);
		System.out.println("count4 = " + count4);
		System.out.println("count5 = " + count5);
		System.out.println("count6 = " + count6);
		System.out.println("count7 = " + count7);
		System.out.println("count8 = " + count8);
		System.out.println("count9 = " + count9);
	}

}
