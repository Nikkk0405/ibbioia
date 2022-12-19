
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;



public class math {
	timer timer;
	Action upAction;
	Action oneAction;
	Action twoAction;
	Action threeAction;
	Action fourAction;
	Action fiveAction;
	Action sixAction;
	Action sevenAction;
	Action eightAction;
	Action nineAction;
	JFrame frame;
	JTextField label;
	JButton button;
	Long initial;
	Long after;
	int checknum = 0;
	String num1;
	String num2;

	int testnum	=	0;
	int whilenum = 0;
	
	
	
	math() {
		frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		//label1 = new JLabel("7"); // odd
	///	label1.setBounds(0, 0, 1600, 1000);
	//	label1.setFont(new Font("Serif", Font.PLAIN, 230));
		
	
		
		
		
		
	
		
		button = new JButton("start");
		button.setBounds(50, 20, 70, 30);
		frame.add(button);
		
		oneAction = new OneAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("1"), "OneAction");
		button.getActionMap().put("OneAction", oneAction);
		
		twoAction = new TwoAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("2"), "TwoAction");
		button.getActionMap().put("TwoAction", twoAction);	
		
		threeAction = new ThreeAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("3"), "ThreeAction");
		button.getActionMap().put("ThreeAction", threeAction);	
		
		fourAction = new FourAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("4"), "FourAction");
		button.getActionMap().put("FourAction", fourAction);	
		
		fiveAction = new FiveAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("5"), "FiveAction");
		button.getActionMap().put("FiveAction", fiveAction);
		
		sixAction = new SixAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("6"), "SixAction");
		button.getActionMap().put("SixAction", sixAction);
		
		sevenAction = new SevenAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("7"), "SevenAction");
		button.getActionMap().put("SevenAction", sevenAction);
		
		eightAction = new EightAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("8"), "EightAction");
		button.getActionMap().put("EightAction", eightAction);
		
		nineAction = new NineAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("9"), "NineAction");
		button.getActionMap().put("NineAction", nineAction);
		
		upAction = new UpAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "upAction");
		button.getActionMap().put("upAction", upAction);
		
		 File singlecolordata = new File("singlecolordata.txt");
	        try {
	        	 
	        	singlecolordata.createNewFile();
	        }
	        catch (IOException e){
	        	
	        }
		
	 
		button.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent p) { 
				  System.out.println("button");
				  
			//	  ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
				  	
				  	 	
				  	/*	 double RanNum = Math.random();
						 long time1 = (long) (RanNum * 10000);
						 long redtime = time1+4000;
						 label.setBackground(Color.red);
						 
						 executorService.schedule(new RedTask(),0, TimeUnit.MILLISECONDS);
						 executorService.schedule(new blue(), 5000, TimeUnit.MILLISECONDS);
						 label.setBackground(Color.red);
						 
						 
						  		 double RanNum = Math.random();
						 long time1 = (long) (RanNum * 10000);
						 long redtime = time1+4000;
						 label.setBackground(Color.red);
						 executorService.schedule(new RedTask(), 5000+3000, TimeUnit.MILLISECONDS);
						 executorService.schedule(new RedtextTask(), 5000+3000+3000, TimeUnit.MILLISECONDS);
						
						 executorService.schedule(new RedTask(), 5000+3000+3000+3000, TimeUnit.MILLISECONDS);
						 executorService.schedule(new GreenTask(), 5000+3000+3000+3000+7000, TimeUnit.MILLISECONDS);
						 */
						 
						
			  } 
	  });
}
	 

	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
		//	after = System.currentTimeMillis();
			label = new JTextField("");
			//label.setBackground(Color.gray);
			label.setFont(new Font("Serif", Font.PLAIN, 230));
			label.setBounds(400, 0, 1600, 1000);
			label.setOpaque(true);
			frame.add(label);
			
			initial = System.currentTimeMillis();
					//label.setText("2");
		 
		    if (whilenum ==0) {
		    	//label1();
		    	label.setText("3 x 2"); //6
		    	
		    }
		   if (whilenum ==1) {
			   label.setText("2 + 1"); // 3
		    	
		    }
		   
		    if (whilenum ==2) {
		    	 label.setText("4 x 2"); //8
		    	
		    }
		    if (whilenum ==3) {
		    	label.setText("6 x 1"); //6
		    	
		    }
		    if (whilenum ==4) {
		    	label.setText("5 + 2"); //7
		    	
		    	
		    }
		    if (whilenum ==5) {
		    	label.setText("3 + 6 "); //9
		    
		    }
		    
		    if (whilenum ==6) {
		    	label.setText("9 / 3"); //3
		    
		    }
		    if (whilenum ==7) {
		    	label.setText("3 - 1"); //2
		    
		    }
		    if (whilenum ==8) {
		    	label.setText("6 - 1"); //5
		    
		    }
		    if (whilenum ==9) {
		    	label.setText("3 / 3"); //1
		    
		    }
		    if (whilenum ==10) {
		    	label.setText("finished"); 
		    
		    }
		    whilenum = whilenum+1;
		  
		    
		    
		    
		    
		    
	
		}

	
		
		
	}
	public class OneAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 1");
			
			
		}
		
	}
	
	public class TwoAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 2");
			
			
		}
		
	}
	public class ThreeAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 3");
			
			
		}
		
	}
	public class FourAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 4");
			
			
		}
		
	}
	public class FiveAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 5");
			
			
		}
		
	}
	public class SixAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 6");
			
			
		}
		
	}
	public class SevenAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 7");
			
			
		}
		
	}
	public class EightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 8");
			
			
		}
		
	}
	public class NineAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms   Ans: 9");
			
			
		}
		
	}
	public class EAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms Even");
			
			
		}
		
	}
	public class OAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms Odd");
			
			
		}
		
	}
}
	

