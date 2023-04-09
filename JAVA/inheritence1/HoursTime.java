
public class HoursTime{ 

	private boolean pmflag;
	private int hours ;
	
	
	public HoursTime(boolean pmflag, int hours) {
		
		if(!setHours(hours)){
			setDefaultTime();
		}
		else
			setPmflag(pmflag);
	}
	
	public HoursTime() {
		setDefaultTime();
	}
	
	public HoursTime( HoursTime ht)
	{
		hours=ht.hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public boolean getPmflag() {
		return pmflag;
	}
	
	public boolean setHours(int hours) {
		
		if( hours >=0 && hours<24){
			this.hours=hours;
			return true;
		}
		return false;
	}
	
	public void setPmflag(boolean pmflag) {
		this.pmflag = pmflag;
	}
	
	public void setDefaultTime() {
		hours=0;
		pmflag=false;
	}
	
	void showTime() {
		if( pmflag){
			if( hours <12)
				System.out.printf("AM %d",hours);
			else if(hours==12)
				System.out.printf("PM %d",hours);
			   else
				   System.out.printf("PM %d",hours-12);
		}
		else
		   System.out.printf("%d",hours);
	}
	
	public boolean equals( HoursTime ht){
		
		 return ( hours==ht.hours);
	}	

}
