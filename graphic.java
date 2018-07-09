import javax.swing.JFrame;
import java.awt.Rectangle;

public class graphic{
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setSize(800,800);
		window.setTitle("Traffic Control");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		drawing dc = new drawing(10);
		window.add(dc);
	}
}