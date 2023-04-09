import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double [] coeff = new double[3];
		Scanner input=new Scanner(System.in);
		String s;
		try{
			for( int i=0; i<3; i++ ){
				System.out.printf("enter %c: ", 'a'+i);
				s=input.next();
				coeff[i]=Double.parseDouble(s);
			}
		
	
			double[] x=Equation.root(coeff[0],coeff[1],coeff[2]);
			System.out.println(x[0]+" "+x[1]);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Wrong Input");
		}
		catch(WrongInputException e){
			System.out.println(e);
		}
		
		System.out.println("End of main");
	}

}
