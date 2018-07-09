import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;

public class drawing extends JComponent{
	
	public static int[]  a1ref = {350,750,50,0};
	public static int[]  b1ref = {0,325,0,50};
	public static int[]  c1ref = {400,0,50,0};
	public static int[]  d1ref = {800,375,0,50};
	
	public static int[]  selectA1pos = {350,750,50,0};
	public static int[]  selectB1pos = {0,325,0,50};
	public static int[]  selectC1pos = {400,0,50,0};
	public static int[]  selectD1pos = {800,375,0,50};
	
	public static int[]  selectA2pos = {400,750,50,0};
	public static int[]  selectB2pos = {0,375,0,50};
	public static int[]  selectC2pos = {350,0,50,0};
	public static int[]  selectD2pos = {800,325,0,50};
	
	public double time = 10;
	
	public int selector = 10;
	public int a1Cars = 10;
	public int b1Cars = 10;
	public int c1Cars = 10;
	public int d1Cars = 10;
	
	public int a2Cars = 10;
	public int b2Cars = 10;
	public int c2Cars = 10;
	public int d2Cars = 10;
	
	public int a2mode = 10;
	public int b2mode = 10;
	public int c2mode = 10;
	public int d2mode = 10;
	
	public drawing(int node)
	{
		setSelector(node);
	}
	
	public void updatea1(int a1)
	{
		if(a1 >= 0 && a1 <= 20)
		{
			selectA1pos[0] = a1ref[0];
			selectA1pos[1] = a1ref[1]-60;
			selectA1pos[2] = a1ref[2];
			selectA1pos[3] = a1ref[3]+60;
		}
		
		else if(a1 > 20 && a1 <= 40)
		{
			selectA1pos[0] = a1ref[0];
			selectA1pos[1] = a1ref[1]-120;
			selectA1pos[2] = a1ref[2];
			selectA1pos[3] = a1ref[3]+120;
		}
		
		else if(a1 > 40 && a1 <= 60)
		{
			selectA1pos[0] = a1ref[0];
			selectA1pos[1] = a1ref[1]-180;
			selectA1pos[2] = a1ref[2];
			selectA1pos[3] = a1ref[3]+180;
		}
		
		else if(a1 > 60 && a1 <= 80)
		{
			selectA1pos[0] = a1ref[0];
			selectA1pos[1] = a1ref[1]-240;
			selectA1pos[2] = a1ref[2];
			selectA1pos[3] = a1ref[3]+240;
		}
		
		else if(a1 > 80 && a1 <= 100)
		{
			selectA1pos[0] = a1ref[0];
			selectA1pos[1] = a1ref[1]-300;
			selectA1pos[2] = a1ref[2];
			selectA1pos[3] = a1ref[3]+300;
		}
	}
	
	public void updateb1(int b1)
	{
		if(b1 >= 0 && b1 <= 20)
		{
			selectB1pos[0] = b1ref[0];
			selectB1pos[1] = b1ref[1];
			selectB1pos[2] = b1ref[2]+60;
			selectB1pos[3] = b1ref[3];
		}
		
		else if(b1 > 20 && b1 <= 40)
		{
			selectB1pos[0] = b1ref[0];
			selectB1pos[1] = b1ref[1];
			selectB1pos[2] = b1ref[2]+120;
			selectB1pos[3] = b1ref[3];
		}
		
		else if(b1 > 40 && b1 <= 60)
		{
			selectB1pos[0] = b1ref[0];
			selectB1pos[1] = b1ref[1];
			selectB1pos[2] = b1ref[2]+180;
			selectB1pos[3] = b1ref[3];
		}
		
		else if(b1 > 60 && b1 <= 80)
		{
			selectB1pos[0] = b1ref[0];
			selectB1pos[1] = b1ref[1];
			selectB1pos[2] = b1ref[2]+240;
			selectB1pos[3] = b1ref[3];
		}
		
		else if(b1 > 80 && b1 <= 100)
		{
			selectB1pos[0] = b1ref[0];
			selectB1pos[1] = b1ref[1];
			selectB1pos[2] = b1ref[2]+300;
			selectB1pos[3] = b1ref[3];
		}
	}
	
	public void updatec1(int c1)
	{
		if(c1 >= 0 && c1 <= 20)
		{
			selectC1pos[0] = c1ref[0];
			selectC1pos[1] = c1ref[1];
			selectC1pos[2] = c1ref[2];
			selectC1pos[3] = c1ref[3]+60;
		}
		
		else if(c1 > 20 && c1 <= 40)
		{
			selectC1pos[0] = c1ref[0];
			selectC1pos[1] = c1ref[1];
			selectC1pos[2] = c1ref[2];
			selectC1pos[3] = c1ref[3]+120;
		}
		
		else if(c1 > 40 && c1 <= 60)
		{
			selectC1pos[0] = c1ref[0];
			selectC1pos[1] = c1ref[1];
			selectC1pos[2] = c1ref[2];
			selectC1pos[3] = c1ref[3]+180;
		}
		
		else if(c1 > 60 && c1 <= 80)
		{
			selectC1pos[0] = c1ref[0];
			selectC1pos[1] = c1ref[1];
			selectC1pos[2] = c1ref[2];
			selectC1pos[3] = c1ref[3]+240;
		}
		
		else if(c1 > 80 && c1 <= 100)
		{
			selectC1pos[0] = c1ref[0];
			selectC1pos[1] = c1ref[1];
			selectC1pos[2] = c1ref[2];
			selectC1pos[3] = c1ref[3]+300;
		}
	}
	
	public void updated1(int d1)
	{
		if(d1 >= 0 && d1 <= 20)
		{
			selectD1pos[0] = d1ref[0]-60;
			selectD1pos[1] = d1ref[1];
			selectD1pos[2] = d1ref[2]+60;
			selectD1pos[3] = d1ref[3];
		}
		
		else if(d1 > 20 && d1 <= 40)
		{
			selectD1pos[0] = d1ref[0]-120;
			selectD1pos[1] = d1ref[1];
			selectD1pos[2] = d1ref[2]+120;
			selectD1pos[3] = d1ref[3];
		}
		
		else if(d1 > 40 && d1 <= 60)
		{
			selectD1pos[0] = d1ref[0]-180;
			selectD1pos[1] = d1ref[1];
			selectD1pos[2] = d1ref[2]+180;
			selectD1pos[3] = d1ref[3];
		}
		
		else if(d1 > 60 && d1 <= 80)
		{
			selectD1pos[0] = d1ref[0]-240;
			selectD1pos[1] = d1ref[1];
			selectD1pos[2] = d1ref[2]+240;
			selectD1pos[3] = d1ref[3];
		}
		
		else if(d1 > 80 && d1 <= 100)
		{
			selectD1pos[0] = d1ref[0]-300;
			selectD1pos[1] = d1ref[1];
			selectD1pos[2] = d1ref[2]+300;
			selectD1pos[3] = d1ref[3];
		}
	}
	
	public void updatea2(int a1)
	{
		if(a1 >= 0 && a1 <= 20)
		{
			selectA2pos[0] = a1ref[0]+50;
			selectA2pos[1] = a1ref[1]-60;
			selectA2pos[2] = a1ref[2];
			selectA2pos[3] = a1ref[3]+60;
		}
		
		else if(a1 > 20 && a1 <= 40)
		{
			selectA2pos[0] = a1ref[0]+50;
			selectA2pos[1] = a1ref[1]-120;
			selectA2pos[2] = a1ref[2];
			selectA2pos[3] = a1ref[3]+120;
		}
		
		else if(a1 > 40 && a1 <= 60)
		{
			selectA2pos[0] = a1ref[0]+50;
			selectA2pos[1] = a1ref[1]-180;
			selectA2pos[2] = a1ref[2];
			selectA2pos[3] = a1ref[3]+180;
		}
		
		else if(a1 > 60 && a1 <= 80)
		{
			selectA2pos[0] = a1ref[0]+50;
			selectA2pos[1] = a1ref[1]-240;
			selectA2pos[2] = a1ref[2];
			selectA2pos[3] = a1ref[3]+240;
		}
		
		else if(a1 > 80 && a1 <= 100)
		{
			selectA2pos[0] = a1ref[0]+50;
			selectA2pos[1] = a1ref[1]-300;
			selectA2pos[2] = a1ref[2];
			selectA2pos[3] = a1ref[3]+300;
		}
	}
	
	public void updateb2(int b1)
	{
		if(b1 >= 0 && b1 <= 20)
		{
			selectB2pos[0] = b1ref[0];
			selectB2pos[1] = b1ref[1]+50;
			selectB2pos[2] = b1ref[2]+60;
			selectB2pos[3] = b1ref[3];
		}
		
		else if(b1 > 20 && b1 <= 40)
		{
			selectB2pos[0] = b1ref[0];
			selectB2pos[1] = b1ref[1]+50;
			selectB2pos[2] = b1ref[2]+120;
			selectB2pos[3] = b1ref[3];
		}
		
		else if(b1 > 40 && b1 <= 60)
		{
			selectB2pos[0] = b1ref[0];
			selectB2pos[1] = b1ref[1]+50;
			selectB2pos[2] = b1ref[2]+180;
			selectB2pos[3] = b1ref[3];
		}
		
		else if(b1 > 60 && b1 <= 80)
		{
			selectB2pos[0] = b1ref[0];
			selectB2pos[1] = b1ref[1]+50;
			selectB2pos[2] = b1ref[2]+240;
			selectB2pos[3] = b1ref[3];
		}
		
		else if(b1 > 80 && b1 <= 100)
		{
			selectB2pos[0] = b1ref[0];
			selectB2pos[1] = b1ref[1]+50;
			selectB2pos[2] = b1ref[2]+300;
			selectB2pos[3] = b1ref[3];
		}
	}
	
	public void updatec2(int c1)
	{
		if(c1 >= 0 && c1 <= 20)
		{
			selectC2pos[0] = c1ref[0]-50;
			selectC2pos[1] = c1ref[1];
			selectC2pos[2] = c1ref[2];
			selectC2pos[3] = c1ref[3]+60;
		}
		
		else if(c1 > 20 && c1 <= 40)
		{
			selectC2pos[0] = c1ref[0]-50;
			selectC2pos[1] = c1ref[1];
			selectC2pos[2] = c1ref[2];
			selectC2pos[3] = c1ref[3]+120;
		}
		
		else if(c1 > 40 && c1 <= 60)
		{
			selectC2pos[0] = c1ref[0]-50;
			selectC2pos[1] = c1ref[1];
			selectC2pos[2] = c1ref[2];
			selectC2pos[3] = c1ref[3]+180;
		}
		
		else if(c1 > 60 && c1 <= 80)
		{
			selectC2pos[0] = c1ref[0]-50;
			selectC2pos[1] = c1ref[1];
			selectC2pos[2] = c1ref[2];
			selectC2pos[3] = c1ref[3]+240;
		}
		
		else if(c1 > 80 && c1 <= 100)
		{
			selectC2pos[0] = c1ref[0]-50;
			selectC2pos[1] = c1ref[1];
			selectC2pos[2] = c1ref[2];
			selectC2pos[3] = c1ref[3]+300;
		}
	}
	
	public void updated2(int d1)
	{
		if(d1 >= 0 && d1 <= 20)
		{
			selectD2pos[0] = d1ref[0]-60;
			selectD2pos[1] = d1ref[1]-50;
			selectD2pos[2] = d1ref[2]+60;
			selectD1pos[3] = d1ref[3];
		}
		
		else if(d1 > 20 && d1 <= 40)
		{
			selectD2pos[0] = d1ref[0]-120;
			selectD2pos[1] = d1ref[1]-50;
			selectD2pos[2] = d1ref[2]+120;
			selectD2pos[3] = d1ref[3];
		}
		
		else if(d1 > 40 && d1 <= 60)
		{
			selectD2pos[0] = d1ref[0]-180;
			selectD2pos[1] = d1ref[1]-50;
			selectD2pos[2] = d1ref[2]+180;
			selectD2pos[3] = d1ref[3];
		}
		
		else if(d1 > 60 && d1 <= 80)
		{
			selectD2pos[0] = d1ref[0]-240;
			selectD2pos[1] = d1ref[1]-50;
			selectD2pos[2] = d1ref[2]+240;
			selectD2pos[3] = d1ref[3];
		}
		
		else if(d1 > 80 && d1 <= 100)
		{
			selectD2pos[0] = d1ref[0]-300;
			selectD2pos[1] = d1ref[1]-50;
			selectD2pos[2] = d1ref[2]+300;
			selectD2pos[3] = d1ref[3];
		}
	}
	
	public void setPrimaryValues(int a1, int b1, int c1, int d1)
	{
		updatea1(a1);
		a1Cars = a1;
		updateb1(b1);
		b1Cars = b1;
		updatec1(c1);
		c1Cars = c1;
		updated1(d1);
		d1Cars = d1;
	}
	
	public void setSecondaryValues(int a1, int b1, int c1, int d1)
	{
		updatea2(a1);
		a2Cars = a1;
		updateb2(b1);
		b2Cars = b1;
		updatec2(c1);
		c2Cars = c1;
		updated2(d1);
		d2Cars = d1;
	}
	
	public void setSelector(int node)
	{
		selector = node;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		//C
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("C2 density: "+c2Cars,150,50);
		
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("C1: "+c1Cars,500,50);
		
		//C2
		Rectangle rect1 = new Rectangle(350,0,50,300);
		g2.setColor(new Color(255,255,0));
		g2.draw(rect1);
		Rectangle rectC2 = new Rectangle(selectC2pos[0],selectC2pos[1],selectC2pos[2],selectC2pos[3]);
		if(c2mode == 0)
		{
			g2.setColor(new Color(0,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(GO)",150,100);
		}
		else if(c2mode == 1)
		{
			g2.setColor(new Color(255,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(WAIT)",150,100);
		}
		else
		{
			g2.setColor(new Color(255,0,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Don't Care)",150,100);
		}
		g2.fill(rectC2);
		
		//C1
		Rectangle rectC1 = new Rectangle(400,0,50,300);
		g2.setColor(new Color(0,0,255));
		g2.draw(rectC1);
		if(selector == 2)
		{
			Rectangle rect2 = new Rectangle(selectC1pos[0],selectC1pos[1],selectC1pos[2],selectC1pos[3]);
			g2.setColor(new Color(0,0,255));
			g2.fill(rect2);	
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Active "+time+"S)",500,100);
		}
		else
		{
			Rectangle rect2 = new Rectangle(selectC1pos[0],selectC1pos[1],selectC1pos[2],selectC1pos[3]);
			g2.setColor(new Color(255,0,0));
			g2.fill(rect2);		
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Inactive)",500,100);
		}
		
		
		//A
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("A1: "+a1Cars,150,700);
		
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("A2 density: "+a2Cars,500,700);
		
		//A2
		Rectangle rect3 = new Rectangle(350,450,50,300);
		g2.setColor(new Color(0,0,255));
		g2.draw(rect3);
		Rectangle rectA2 = new Rectangle(selectA2pos[0],selectA2pos[1],selectA2pos[2],selectA2pos[3]);
		if(a2mode == 0)
		{
			g2.setColor(new Color(0,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(GO)",500,750);
		}
		else if(a2mode == 1)
		{
			g2.setColor(new Color(255,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(WAIT)",500,750);
		}
		else
		{
			g2.setColor(new Color(255,0,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Don't Care)",500,750);
		}
		g2.fill(rectA2);
		
		//A1
		Rectangle rectA1 = new Rectangle(400,450,50,300);
		g2.setColor(new Color(255,255,0));
		g2.draw(rectA1);
		if(selector == 0)
		{
			Rectangle rect4 = new Rectangle(selectA1pos[0],selectA1pos[1],selectA1pos[2],selectA1pos[3]);
			g2.setColor(new Color(0,0,255));
			g2.fill(rect4);		
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Active "+time+"S)",150,750);
		}
		else
		{
			Rectangle rect4 = new Rectangle(selectA1pos[0],selectA1pos[1],selectA1pos[2],selectA1pos[3]);
			g2.setColor(new Color(255,0,0));
			g2.fill(rect4);		
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Inactive)",150,750);
		}
		
		
		//B
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("B1: "+b1Cars,5,250);
		
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("B2 density: "+b2Cars,5,500);
		
		//B2
		Rectangle rect5 = new Rectangle(0,325,300,50);
		g2.setColor(new Color(0,0,255));
		g2.draw(rect5);
		Rectangle rectB2 = new Rectangle(selectB2pos[0],selectB2pos[1],selectB2pos[2],selectB2pos[3]);
		if(b2mode == 0)
		{
			g2.setColor(new Color(0,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(GO)",5,550);
		}
		else if(b2mode == 1)
		{
			g2.setColor(new Color(255,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(WAIT)",5,550);
		}
		else
		{
			g2.setColor(new Color(255,0,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Don't Care)",5,550);
		}
		g2.fill(rectB2);
		
		//B1
		Rectangle rectB1 = new Rectangle(0,375,300,50);
		g2.setColor(new Color(255,255,0));
		g2.draw(rectB1);
		if(selector == 1)
		{
			Rectangle rect6 = new Rectangle(selectB1pos[0],selectB1pos[1],selectB1pos[2],selectB1pos[3]);
			g2.setColor(new Color(0,0,255));
			g2.fill(rect6);		
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Active "+time+"S)",5,300);
		}
		else
		{
			Rectangle rect6 = new Rectangle(selectB1pos[0],selectB1pos[1],selectB1pos[2],selectB1pos[3]);
			g2.setColor(new Color(255,0,0));
			g2.fill(rect6);	
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Inactive)",5,300);
		}
		
		
		//D
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("D2 density: "+d2Cars,600,250);
		
		g2.setFont(new Font("serif", Font.BOLD, 30));
		g2.setColor(new Color(0,0,0));
		g2.drawString("D1: "+d1Cars,600,500);
		
		//D2
		Rectangle rect7 = new Rectangle(500,325,300,50);
		g2.setColor(new Color(255,255,0));
		g2.draw(rect7);
		Rectangle rectD2 = new Rectangle(selectD2pos[0],selectD2pos[1],selectD2pos[2],selectD2pos[3]);
		if(d2mode == 0)
		{
			g2.setColor(new Color(0,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(GO)",600,300);
		}
		else if(d2mode == 1)
		{
			g2.setColor(new Color(255,255,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(WAIT)",600,300);
		}
		else
		{
			g2.setColor(new Color(255,0,0));
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Don't Care)",600,300);
		}
		g2.fill(rectD2);
		
		//D1
		Rectangle rectD1 = new Rectangle(500,375,300,50);
		g2.setColor(new Color(0,0,255));
		g2.draw(rectD1);
		if(selector == 3)
		{
			Rectangle rect8 = new Rectangle(selectD1pos[0],selectD1pos[1],selectD1pos[2],selectD1pos[3]);
			g2.setColor(new Color(0,0,255));
			g2.fill(rect8);	
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Active "+time+"S)",600,550);
		}
		else
		{
			Rectangle rect8 = new Rectangle(selectD1pos[0],selectD1pos[1],selectD1pos[2],selectD1pos[3]);
			g2.setColor(new Color(255,0,0));
			g2.fill(rect8);	
			g2.setFont(new Font("serif", Font.BOLD, 30));
			g2.drawString("(Inactive)",600,550);
		}
		
		
	}
}