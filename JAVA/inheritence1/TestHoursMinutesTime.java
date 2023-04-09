
public class TestHoursMinutesTime {

	
	public static void main(String[] args) {
		HoursMinutesTime hmt1= new HoursMinutesTime(true,17,5);
		hmt1.showTime();
		System.out.println();
		HoursMinutesTime hmt2= new HoursMinutesTime(false,17,5);
		hmt2.showTime();
		System.out.println();
		System.out.println(hmt1.equals(hmt2));
		HoursMinutesTime hmt3 = new HoursMinutesTime(hmt1); 
		hmt3.showTime();
		HoursMinutesTime hmt4 = new HoursMinutesTime(hmt1);
		System.out.println();
		hmt4.showTime();
		
	}
}
/*
 output:
 PM 5:05
17:05
true
PM 5:05
PM 5:05
 */

