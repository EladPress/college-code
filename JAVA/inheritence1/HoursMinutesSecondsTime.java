
public class HoursMinutesSecondsTime extends HoursMinutesTime {

	private int seconds;
	
	public HoursMinutesSecondsTime(boolean pmflag, int hours, int minutes, int seconds) {
		super(pmflag, hours, minutes);
		if( !setSeconds(seconds))
			setDefaultTime();
	}

	public HoursMinutesSecondsTime() {
		setDefaultTime();
	}
	
	public HoursMinutesSecondsTime( HoursMinutesSecondsTime hms)
	{
		super(hms.getPmflag(), hms.getHours(), hms.getMinutes());
		seconds= hms.seconds;
	}


	public int getSeconds() {
		return seconds;
	}


	public boolean setSeconds(int seconds) {
		if( seconds>=0 && seconds<=59){
			this.seconds = seconds;
			return true;
		}
		return false;
	}
	
	public void setDefaultTime() {
		super.setDefaultTime();
		seconds=0;
	}
	
	void showTime() {
		super.showTime();
		System.out.printf(":%02d",seconds);
	}
	
	public boolean equals( HoursMinutesSecondsTime hmst){
		
			return (super.equals(hmst)&& seconds==hmst.seconds);
		}
	
}		

