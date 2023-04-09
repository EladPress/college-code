
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class BallsPanel extends JPanel
{
	private Ball[] balls = new Ball[5];
	private Random rand = new Random();
	public BallsPanel()
	{
	    //balls[0] = new Ball(12, 20, 30, Color.RED, this);
		//balls[1] = new Ball(123, 50, 40, Color.ORANGE, this);
		for(int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball(rand.nextInt(500), rand.nextInt(620), rand.nextInt(100), Color.RED, this);
			balls[i].start();
		}
		//balls[0].start();
		//balls[1].start();
		setBackground(Color.GREEN);
		//balls[0].run();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}
		//balls[0].draw(g);
		//balls[1].draw(g);
	}
	public Ball[] getBalls()
	{
		return balls;
	}
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		BallsPanel bp = new BallsPanel();
		f.add(bp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 620);
		f.setVisible(true);
		f.setResizable(false);
	}

}
