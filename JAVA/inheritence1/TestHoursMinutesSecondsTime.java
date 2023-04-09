
public class TestHoursMinutesSecondsTime {

	public static void main(String[] args) {
		HoursMinutesSecondsTime hmst1= new HoursMinutesSecondsTime(true,12,5,33);
		HoursMinutesSecondsTime hmst2= new HoursMinutesSecondsTime(false,12,5,33);
		
		hmst1.showTime();
		System.out.println();
		hmst2.showTime();
		System.out.println();
		
		System.out.println(hmst1==hmst2);	
		System.out.println(hmst1.equals(hmst2));
		
		HoursMinutesSecondsTime hmst3 = new HoursMinutesSecondsTime(hmst1);
		hmst3.showTime();	
	}
}
/*
 output:PM 12:05:33
12:05:33
false
true
PM 12:05:33
 */
