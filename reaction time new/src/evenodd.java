
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



public class evenodd {
	timer timer;
	Action upAction;
	Action oAction;
	Action eAction;
	JFrame frame;
	JTextField label;
	JButton button;
	Long initial;
	Long after;
	int checknum = 0;
	String num1;
	String num2;
/*	JLabel label1;//        odd
	JLabel label2;//        even
	JLabel label3;//     	even
	JLabel label4;// 		odd
	JLabel label5; // 	    even
	JLabel label6; //  	    odd
	JLabel label7; //       odd
	JLabel label8; // 		odd
	JLabel label9; //		even
	JLabel label10;//	*/ //	even
	int testnum	=	0;
	int whilenum = 0;
	
	
	
	evenodd() {
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
		
		eAction = new EAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("E"), "EAction");
		button.getActionMap().put("EAction", eAction);
		
		oAction = new OAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("O"), "OAction");
		button.getActionMap().put("OAction", oAction);	
		
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
			label.setBounds(700, 0, 1600, 1000);
			label.setOpaque(true);
			frame.add(label);
			
			initial = System.currentTimeMillis();
					//label.setText("2");
		 
		    if (whilenum ==0) {
		    	//label1();
		    	label.setText("7"); //odd
		    	
		    }
		   if (whilenum ==1) {
			   label.setText("4"); // even
		    	
		    }
		   
		    if (whilenum ==2) {
		    	 label.setText("10"); //even
		    	
		    }
		    if (whilenum ==3) {
		    	label.setText("15"); //odd
		    	
		    }
		    if (whilenum ==4) {
		    	label.setText("12"); //even
		    	
		    	label5();
		    }
		    if (whilenum ==5) {
		    	label.setText("3"); //odd
		    
		    }
		    
		    if (whilenum ==6) {
		    	label.setText("13"); //odd
		    
		    }
		    if (whilenum ==7) {
		    	label.setText("17"); //odd
		    
		    }
		    if (whilenum ==8) {
		    	label.setText("6"); //even
		    
		    }
		    if (whilenum ==9) {
		    	label.setText("16"); //even
		    
		    }
		    whilenum = whilenum+1;
		  
		    
		    
		    
		    
		    
	
		}

		public void label1() {
			// TODO Auto-generated method stub

			//label.add(label1);
			
			
			
		}
		public void label2() {
			// TODO Auto-generated method stub

		//	label.add(label2);
			
			
			
		}
		public void label3() {
			//label.remove(labelgreen);
		//	label.add(label3);
			
			
			
		}
		public void label4() {
		//	label.add(label4);
			

				
		}
		public void label5() {
		//	label.add(label5);
		
			
					}
		public void label6() {
		//	label.add(label6);
		
		}
		public void label7() {
		//	label.add(label7);
			
			
			
		}
		public void label8() {
			//label.add(label8);
			
			
		
		}
		public void reset() {
			
			
		}
		public void label9() {
			//label.add(label9);
						
		}
		public void label10() {
		//	label.add(label10);
		
			
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
	

