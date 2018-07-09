import java.util.Arrays;
import java.util.Random;
import java.lang.*;
import javax.swing.JFrame;
import java.awt.Rectangle;


//Index 0 A, 1 B, 2 C, 3 D
//Population 100

public class traffic{
	
	static drawing dc = new drawing(10);
	static JFrame window = new JFrame();
	
	public static int[] primaryNode= {61,91,33,33};
	public static int[] secondaryNode = {30,20,40,70};
	public static int[] selectedNode = {0,0,0,0};
	public static int[] priority = {10000,15000,20000,25000,30000};
	
	static public boolean a2Wait = false;
	static public boolean b2Wait = false;
	static public boolean c2Wait = false;
	static public boolean d2Wait = false;
	static public boolean forceStop = false;
	
	static public double A2timeNode;
	static public double B2timeNode;
	static public double C2timeNode;
	static public double D2timeNode;
	
	static public int DelayReference = 5000;
	static public int TokenPassDelayTime = 3000;
	
	static public int dar, dbr, dcr, ddr = 0;
	static public double dart, dbrt, dcrt, ddrt = 0;
	
	static public boolean a2delayLimit = false;
	static public boolean b2delayLimit = false;
	static public boolean c2delayLimit = false;
	static public boolean d2delayLimit = false;


static void updatePrimaryNode()
{
	Random random = new Random();
	int a = random.nextInt(100 - 0 + 1) + 0;
	primaryNode[0] = a;
	int b = random.nextInt(100 - 0 + 1) + 0;
	primaryNode[1] = b;
	int c = random.nextInt(100 - 0 + 1) + 0;
	primaryNode[2] = c;
	int d = random.nextInt(100 - 0 + 1) + 0;
	primaryNode[3] = d;
}	

static void updateSecondaryNode()
{
	Random random = new Random();
	int a = random.nextInt(100 - 0 + 1) + 0;
	secondaryNode[0] = a;
	int b = random.nextInt(100 - 0 + 1) + 0;
	secondaryNode[1] = b;
	int c = random.nextInt(100 - 0 + 1) + 0;
	secondaryNode[2] = c;
	int d = random.nextInt(100 - 0 + 1) + 0;
	secondaryNode[3] = d;
}

static void secondaryA2(int node, double end)
{
	dc.time = (end - System.currentTimeMillis())/1000.00;
	if(node==1)
	{
		if(secondaryNode[0]<60)
		{
			System.out.println("from"+node+"to A2 #go "+ secondaryNode[0]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.a2mode = 0;
			window.repaint();
			a2Wait = false;	
			dar = 0;
			a2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to A2 #Waiting "+ secondaryNode[0]);
			a2Wait = true;
			A2timeNode = System.currentTimeMillis();
			dc.a2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
			
	}
	
	else if(node==2)
	{
		if(secondaryNode[0]<20)
		{
			System.out.println("from"+node+"to A2 #go "+ secondaryNode[0]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.a2mode = 0;
			window.repaint();
			a2Wait = false;
			dar = 0;
			a2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to A2 #Waiting "+ secondaryNode[0]);
			a2Wait = true;
			A2timeNode = System.currentTimeMillis();
			dc.a2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	
	else
	{
		dc.a2mode = 10;
	}
}

static void secondaryB2(int node, double end)
{
	dc.time = (end - System.currentTimeMillis())/1000.00;
	if(node==2)
	{
		if(secondaryNode[1]<60)
		{
			System.out.println("from"+node+"to B2 #go "+ secondaryNode[1]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.b2mode = 0;
			window.repaint();
			b2Wait = false;	
			dbr = 0;
			b2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to B2 #Waiting "+ secondaryNode[0]);
			b2Wait = true;
			B2timeNode = System.currentTimeMillis();
			dc.b2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	
	else if(node==3)
	{
		if(secondaryNode[1]<20)
		{
			System.out.println("from"+node+"to B2 #go "+ secondaryNode[1]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.b2mode = 0;
			window.repaint();
			b2Wait = false;	
			dbr = 0;
			b2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to B2 #Waiting "+ secondaryNode[0]);
			b2Wait = true;
			B2timeNode = System.currentTimeMillis();
			dc.b2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	else
	{
		dc.b2mode = 10;
	}
}

static void secondaryC2(int node, double end)
{
	dc.time = (end - System.currentTimeMillis())/1000.00;
	if(node==3)
	{
		if(secondaryNode[2]<60)
		{
			System.out.println("from"+node+"to C2 #go "+ secondaryNode[2]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.c2mode = 0;
			window.repaint();
			c2Wait = false;	
			dcr = 0;
			c2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to C2 #Waiting "+ secondaryNode[0]);
			c2Wait = true;
			C2timeNode = System.currentTimeMillis();
			dc.c2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	
	else if(node==0)
	{
		if(secondaryNode[2]<20)
		{
			System.out.println("from"+node+"to C2 #go "+ secondaryNode[2]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.c2mode = 0;
			window.repaint();
			c2Wait = false;	
			dcr = 0;
			c2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to C2 #Waiting "+ secondaryNode[0]);
			c2Wait = true;
			C2timeNode = System.currentTimeMillis();
			dc.c2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}	
	
	else
	{
		dc.c2mode = 10;
	}
}

static void secondaryD2(int node, double end)
{
	dc.time = (end - System.currentTimeMillis())/1000.00;
	if(node==0)
	{
		if(secondaryNode[3]<60)
		{
			System.out.println("from"+ node +"to D2 #go "+ secondaryNode[3]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.d2mode = 0;
			window.repaint();
			d2Wait = false;	
			ddr = 0;
			d2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to D2 #Waiting "+ secondaryNode[0]);
			d2Wait = true;
			D2timeNode = System.currentTimeMillis();
			dc.d2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	
	else if(node==1)
	{
		if(secondaryNode[3]<20)
		{
			System.out.println("from"+ node +"to D2 #go "+ secondaryNode[3]);
			updateSecondaryNode();
			dc.setSecondaryValues(secondaryNode[0],secondaryNode[1],secondaryNode[2],secondaryNode[3]);
			dc.d2mode = 0;
			window.repaint();
			d2Wait = false;	
			ddr = 0;
			d2delayLimit = false;
		}
		else
		{
			System.out.println("from"+node+"to D2 #Waiting "+ secondaryNode[0]);
			d2Wait = true;
			D2timeNode = System.currentTimeMillis();
			dc.d2mode = 1;
			dc.time = (end - System.currentTimeMillis())/1000.00;
			window.repaint();
		}
	}
	
	else
	{
		dc.d2mode = 10;
	}
}

void loop(double end, int node)
{
	//starting of a new node
	a2Wait = false;
	b2Wait = false;
	c2Wait = false;
	d2Wait = false;
	a2delayLimit = false;
	b2delayLimit = false;
	c2delayLimit = false;
	d2delayLimit = false;
	dar = 0;
	dbr = 0;
	dcr = 0;
	ddr = 0;
	while(System.currentTimeMillis() < end && forceStop != true)
		{
			window.repaint();
			//dc.time = (end - System.currentTimeMillis())/1000.00;
			if(a2Wait == true && System.currentTimeMillis() < (A2timeNode+DelayReference))
			{
				System.out.println("Delay A2");
				if(dar == 0)
				{
					dar = 1;
					dart = System.currentTimeMillis();
				}
				else
				{
					if(System.currentTimeMillis() - dart > 6000)
					{
						a2delayLimit = true;
					}
				}
				
			}
			else
			{
				dc.time = (end - System.currentTimeMillis())/1000.00;
				traffic.secondaryA2(node, end);
			}
			if(b2Wait == true && System.currentTimeMillis() < (B2timeNode+DelayReference))
			{
				System.out.println("Delay B2");
				if(dbr == 0)
				{
					dbr = 1;
					dbrt = System.currentTimeMillis();
				}
				else
				{
					if(System.currentTimeMillis() - dbrt > 6000)
					{
						b2delayLimit = true;
					}
				}
			}
			else
			{
				dc.time = (end - System.currentTimeMillis())/1000.00;
				traffic.secondaryB2(node, end);
			}
			if(c2Wait == true && System.currentTimeMillis() < (C2timeNode+DelayReference))
			{
				System.out.println("Delay C2");
				if(dcr == 0)
				{
					dcr = 1;
					dcrt = System.currentTimeMillis();
				}
				else
				{
					if(System.currentTimeMillis() - dcrt > 6000)
					{
						c2delayLimit = true;
					}
				}
			}
			else
			{
				dc.time = (end - System.currentTimeMillis())/1000.00;
				traffic.secondaryC2(node, end);
			}
			if(d2Wait == true && System.currentTimeMillis() < (D2timeNode+DelayReference))
			{
				System.out.println("Delay D2");
				if(ddr == 0)
				{
					ddr = 1;
					ddrt = System.currentTimeMillis();
				}
				else
				{
					if(System.currentTimeMillis() - ddrt > 6000)
					{
						d2delayLimit = true;
					}
				}
			}
			else
			{
				dc.time = (end - System.currentTimeMillis())/1000.00;
				traffic.secondaryD2(node, end);
			}
			if(node == 0)
			{
				if(c2delayLimit == true && d2delayLimit == true)
				{	
					forceStop = true;
					dar = 0; dbr = 0; dcr = 0; ddr = 0;
					dc.c2mode = 10;
					dc.d2mode = 10;
				}
				else							
					forceStop = false;
			}
			if(node == 1)
			{
				if(a2delayLimit == true && d2delayLimit == true)
				{	
					forceStop = true;
					dar = 0; dbr = 0; dcr = 0; ddr = 0;
					dc.a2mode = 10;
					dc.d2mode = 10;
				}
				else
					forceStop = false;
			}
			if(node == 2)
			{
				if(a2delayLimit == true && b2delayLimit == true)
				{	
					forceStop = true;
					dar = 0; dbr = 0; dcr = 0; ddr = 0;
					dc.a2mode = 10;
					dc.b2mode = 10;
				}
				else
					forceStop = false;
			}
			if(node == 3)
			{
				if(c2delayLimit == true && b2delayLimit == true)
				{	
					forceStop = true;
					dar = 0; dbr = 0; dcr = 0; ddr = 0;
					dc.b2mode = 10;
					dc.c2mode = 10;
				}
				else
					forceStop = false;
			}
			try{Thread.sleep(1000);} catch(Exception e){}
		}
}

void calculation(int node)
{
	if(primaryNode[node]>=0 && primaryNode[node]<20 )
	{
		long current=System.currentTimeMillis();
		long end=current+priority[0];
		dc.time = 10;	
		loop(end,node);
		System.out.println("from"+node+"to All #stop");
	}
	
	else if(primaryNode[node]>=20 && primaryNode[node]<40 )
	{
		long current=System.currentTimeMillis();
		long end=current+priority[1];
		dc.time = 15;	
		loop(end,node);
		System.out.println("from"+node+"to All #stop");
	}
	
	else if(primaryNode[node]>=40 && primaryNode[node]<60 )
	{
		long current=System.currentTimeMillis();
		long end=current+priority[2];
		dc.time = 20;	
		loop(end,node);
		System.out.println("from"+node+"to All #stop");
	}
	
	else if(primaryNode[node]>=60 && primaryNode[node]<20 )
	{
		long current=System.currentTimeMillis();
		long end=current+priority[3];
		dc.time = 25;	
		loop(end,node);
		System.out.println("from"+node+"to All #stop");
	}
	
	else if(primaryNode[node]>=20 && primaryNode[node]<100 )
	{
		long current=System.currentTimeMillis();
		long end=current+priority[4];
		dc.time = 30;	
		loop(end,node);
		System.out.println("from"+node+"to All #stop");
	}
		

	System.out.println("Passing token from node "+node);
}

void MainLoop()
{
	int[] a={0,0,0,0};
	int[] aflag = {0,0,0,0};
	int[] CopyPrimaryNode=new int[4];
	System.arraycopy( primaryNode, 0,CopyPrimaryNode, 0, primaryNode.length );
	Arrays.sort(CopyPrimaryNode);
	
	dc.setPrimaryValues(primaryNode[0],primaryNode[1],primaryNode[2],primaryNode[3]);
	
	for(int i=0;i<4;i++){
				for(int j=3;j>=0;j--)
				{					
					if(CopyPrimaryNode[j] == primaryNode[i] && aflag[j] != 1)
						{	
							
							a[3-j] = i;
							aflag[j] = 1;
							break;
						}
				}
			}
	System.out.println("Visiting Sequence:");
	for(int j=0;j<4;j++)
	{
		System.out.println(a[j]+" ");
	}
			
	for(int j=0;j<4;j++)
	{
		if(selectedNode[a[j]] != 1)
		{
			System.out.println("Starting from "+a[j]+" Value: "+primaryNode[a[j]]);
			dc.setSelector(a[j]);
			window.repaint();
			selectedNode[a[j]] = 1;
			calculation(a[j]);
			forceStop = false;
		}
	}
}

public static void main(String[] args)
{
	window.setSize(820,800);
	window.setTitle("Traffic Control");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	window.add(dc);
		
	traffic obj = new traffic();
	int k = 0;
	
	while( k < 3)
	{
		obj.MainLoop();

		selectedNode[0] = 0;
		selectedNode[1] = 0;
		selectedNode[2] = 0;
		selectedNode[3] = 0;

		updatePrimaryNode();
		
		k++;
	}
	
}

}
