
public class TestCar {
public static void main(String[] args) {
	Car c=new Car(240);
	
	// c.drive(300);
	 
    try{
    	 c.drive(100);
    	}
    
        catch(TooLargeVelocityException e1){
    	System.out.println(e1);
    	}
    
       catch(NegativeVelocityException e2){
    		System.out.println(e2);
    	}
    
      System.out.println("End of main");
	}

 
}
