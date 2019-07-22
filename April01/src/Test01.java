
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  year = 1970;
		int oYear = 1900;
		int firstDay = 1;
		int days;
		int week;
		int leapYearCount=0;
		for(int i=oYear;i<=year;i++) {
			if((i%4==0 && i%100!=0)||i%400==0) {
				leapYearCount++;
			}
		}
		days = (year - oYear + 1) * 365 + leapYearCount;		
		week = ((days-1) % 7 + firstDay) % 7; 
		System.out.println(week);
	}
	
}
