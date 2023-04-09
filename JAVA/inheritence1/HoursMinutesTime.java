
public class HoursMinutesTime extends HoursTime {

	private int minutes;
	

	public HoursMinutesTime(boolean pmflag, int hours, int minutes) {
		super(pmflag,hours);
		if( !setMinutes(minutes))
			setDefaultTime();
			
	}
	
	public HoursMinutesTime(){
		setDefaultTime();
	}
	
	public HoursMinutesTime( HoursMinutesTime hmt)
	{
		super(hmt.getPmflag(), hmt.getHours());
		minutes=hmt.minutes;	
	}

	public int getMinutes() {
		return minutes;
	}

	public boolean setMinutes(int minutes) {
		if( minutes>=0 && minutes<60){
			this.minutes = minutes;
			return true;
		}
		return false;	
	}
	
	public void setDefaultTime() {
		super.setDefaultTime();
		minutes=0;
	}
	
	void showTime() {
		super.showTime();
		System.out.printf(":%02d",minutes);
	}
	
	public boolean equals( HoursMinutesTime hmt){
		//////////////
		return (super.equals(hmt)&& minutes==hmt.minutes);
}
	
}
