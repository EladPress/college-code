
public class Equation{
	public static double[] root(double a, double b,
			     double c) throws WrongInputException{
		if (a==0) throw new WrongInputException("a can’t be zero");
		double delta=b*b-4*a*c;
		if (delta< 0) throw new WrongInputException("Discriminant < zero");
		double[] x=new double[2];
		x[0] =(-b+Math.sqrt(delta))/(2*a);
		x[1] =(-b-Math.sqrt(delta))/(2*a);
		return x;
	}
}
