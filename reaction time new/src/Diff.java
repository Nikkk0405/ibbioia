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

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.*;



public class Diff {
	timer timer;
	Action upAction;
	Action dAction;
	Action sAction;
	JFrame frame;
	JLabel label;
	JButton button;
	Long initial;
	Long after;
	int checknum = 0;
	String num1;
	String num2;
	JLabel labelblue;//"blue" and blue              same
	JLabel labelred;// "red" and yellow   	        diff
	JLabel labelgreen;//"green" and purple	     	diff
	JLabel labelorange;//"orange" and green			diff
	JLabel labelpink; // "pink" and pink		    same
	JLabel labelyellow; //"yellow" and blue			diff
	JLabel labelcyan; //"cyan" and cyan	            same
	JLabel labelgreen2; //" green" and green 		same
	JLabel labelblue2; // "blue"  and pink			diff
	JLabel labelwhite;// "white"  and white 		same
	int testnum	=	0;
	int whilenum = 0;
	
	
	
	Diff() {
		frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		labelblue = new JLabel("blue"); 
		labelblue.setBounds(550, 300, 500, 300);
		labelblue.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelred = new JLabel("Red"); 
		labelred.setBounds(550, 300, 500, 300);
		labelred.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelgreen = new JLabel("Green"); 
		labelgreen.setBounds(500, 300, 600, 300);
		labelgreen.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelpink = new JLabel("Pink"); 
		labelpink.setBounds(500, 300, 600, 300);
		labelpink.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelorange = new JLabel("Orange"); 
		labelorange.setBounds(500, 300, 700, 300);
		labelorange.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelyellow = new JLabel("Yellow"); 
		labelyellow.setBounds(500, 300, 700, 300);
		labelyellow.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelcyan = new JLabel("cyan"); 
		labelcyan.setBounds(500, 300, 700, 300);
		labelcyan.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelgreen2 = new JLabel("Green"); 
		labelgreen2.setBounds(500, 300, 600, 300);
		labelgreen2.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelblue2 = new JLabel("Blue"); 
		labelblue2.setBounds(500, 300, 600, 300);
		labelblue2.setFont(new Font("Serif", Font.PLAIN, 230));
		
		labelwhite = new JLabel("White"); 
		labelwhite.setBounds(500, 300, 600, 300);
		labelwhite.setFont(new Font("Serif", Font.PLAIN, 230));
		
		
		
		label = new JLabel();
		label.setBackground(Color.gray);
		
		label.setBounds(0, 0, 1600, 1000);
		label.setOpaque(true);
		frame.add(label);
		
		button = new JButton("start");
		button.setBounds(50, 20, 70, 30);
		label.add(button);
		
		sAction = new SAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("S"), "SAction");
		button.getActionMap().put("SAction", sAction);
		
		dAction = new DAction();
		
		button.getInputMap().put(KeyStroke.getKeyStroke("D"), "DAction");
		button.getActionMap().put("DAction", dAction);	
		
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

			initial = System.currentTimeMillis();
			
		
		   
		  
		    if (whilenum ==0) {
		    	blue();
		    	
		    }
		   if (whilenum ==1) {
		    	reset();
		    	red();
		    	
		    }
		   
		    if (whilenum ==2) {
		    	reset();
		    	green();
		    	
		    }
		    if (whilenum ==3) {
		    	reset();
		    	orange();
		    	
		    }
		    if (whilenum ==4) {
		    	reset();
		    	
		    	pink();
		    }
		    if (whilenum ==5) {
		    	reset();
		    	yellow();
		    
		    }
		    
		    if (whilenum ==6) {
		    	reset();
		    	cyan();
		    
		    }
		    if (whilenum ==7) {
		    	reset();
		    	green2();
		    
		    }
		    if (whilenum ==8) {
		    	reset();
		    	blue2();
		    
		    }
		    if (whilenum ==9) {
		    	reset();
		    	white();
		    
		    }
		    whilenum = whilenum+1;
		  
		    
		    
		    
		    
		    
		    
	/*
			try {
				FileWriter fw = new FileWriter("singlecolordata.txt");
				fw.write(num1);
				fw.write(num2);
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}    */
		}

		public void blue() {
			// TODO Auto-generated method stub

			label.add(labelblue);
			label.setBackground(Color.blue);
			
			//initial = System.currentTimeMillis();
		}
		public void cyan() {
			// TODO Auto-generated method stub

			label.add(labelcyan);
			label.setBackground(Color.cyan);
			
			//initial = System.currentTimeMillis();
		}
		public void pink() {
			label.remove(labelgreen);
			label.add(labelpink);
			label.setBackground(Color.pink);
			
			
		}
		public void orange() {
			label.add(labelorange);
			label.setBackground(Color.green);
			
			//initial = System.currentTimeMillis();	
		}
		public void green2() {
			label.add(labelgreen2);
			label.setBackground(Color.green);
			
		//	initial = System.currentTimeMillis();
		}
		public void blue2() {
			label.add(labelblue2);
			label.setBackground(Color.pink);
			
			//initial = System.currentTimeMillis();
		}
		public void white() {
			label.add(labelwhite);
			label.setBackground(Color.white);
			
			//initial = System.currentTimeMillis();
		}
		public void yellow() {
			label.add(labelyellow);
			label.setBackground(Color.blue);
			
		//	initial = System.currentTimeMillis();
		}
		public void reset() {
			label.remove(labelblue);
			label.remove(labelred);
			label.remove(labelgreen);
			label.remove(labelpink);
			label.remove(labelorange);
			label.remove(labelyellow);
			label.remove(labelcyan);
			label.remove(labelgreen2);
			label.remove(labelblue2);
			label.remove(labelwhite);
			
		}
		public void red() {
			label.add(labelred);
			label.setBackground(Color.yellow);
			
		}
		public void green() {
			label.add(labelgreen);
			label.setBackground(Color.pink);
			
		}
		
		
	}
	public class SAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
		
			
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms Same");
			
			
		}
		
	}
	public class DAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial +"ms Different");
			
			
		}
		
	}
}
	
