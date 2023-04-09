
import java.awt.*;
import java.io.Serializable;
import java.util.Date;

// MS: Must implement Serializable in order to be sent
// otherwise  Exception in thread "main" java.io.WriteAbortedException:
// writing aborted; java.io.NotSerializableException: MyPoint

public class MyPoint implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	Point point;
	Date date;
	
	public MyPoint ( int x, int y)
	{
		point = new Point(x,y);
		date = new Date();
	}
	
	public String toString()
	{
		return point.toString() + " " + date.toString();
	}

}
