//25-10-2020
public class TestHoursTime {
	
	public static void main(String[] args) {
		HoursTime ht1= new HoursTime(true,14);
		HoursTime ht2= new HoursTime(false,15);
		ht1.showTime();
		System.out.println();
		ht2.showTime();
		System.out.println();
		ht2.setHours(14);
		ht1.showTime();
		System.out.println();
		ht2.showTime();
		System.out.println();
		System.out.println(ht1.equals(ht2));
		HoursTime ht3= new HoursTime(ht1);
		ht3.showTime();
		
		
	}
}

/*
 output:
 PM 2
 15
 PM 2
 14
 true
 14
 */
