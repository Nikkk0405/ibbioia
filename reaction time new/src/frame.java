import java.awt.Color;
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



public class frame {
	timer timer;
	Action upAction;
	JFrame frame;
	JLabel label;
	JButton button;
	Long initial;
	Long after;
	int checknum = 0;
	String num1;
	String num2;
	int testnum;

	
	
	
	frame() {
		frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		label = new JLabel();
		label.setBackground(Color.gray);
		label.setBounds(0, 0, 1600, 1000);
		label.setOpaque(true);
		frame.add(label);
		
		button = new JButton("start");
		button.setBounds(50, 20, 70, 30);
		label.add(button);
		
		
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
				  
				  ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
				  	
				  	 	
				  
						 label.setBackground(Color.red);
						 
						  executorService.schedule(new RedTask(),0, TimeUnit.SECONDS);
					   executorService.schedule(new GreenTask(), 5, TimeUnit.SECONDS); // 5sec 
						
						 executorService.schedule(new RedTask(), 5+5, TimeUnit.SECONDS); //5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3, TimeUnit.SECONDS);//3 sec
						
						 executorService.schedule(new RedTask(), 5+5+3+5, TimeUnit.SECONDS); //5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7, TimeUnit.SECONDS); //7 sec
						 
						 executorService.schedule(new RedTask(), 5+5+3+5+7+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4, TimeUnit.SECONDS); //4 sec
						
						 executorService.schedule(new RedTask(), 5+5+3+5+7+5+4+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12, TimeUnit.SECONDS); //12 sec
					   
					     executorService.schedule(new RedTask(), 5+5+3+5+7+5+4+5+12+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12+5+6, TimeUnit.SECONDS); //6 sec
					   
					     executorService.schedule(new RedTask(), 5+5+3+5+7+5+4+5+12+5+6+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8, TimeUnit.SECONDS); //8 sec
					   
					     executorService.schedule(new RedTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5+17, TimeUnit.SECONDS); //17 sec
					   
					     executorService.schedule(new RedTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5+17+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5+17+5+3, TimeUnit.SECONDS); //3 sec
					   
					    executorService.schedule(new RedTask(),  5+5+3+5+7+5+4+5+12+5+6+5+8+5+17+5+3+5, TimeUnit.SECONDS);//5 sec break
					   executorService.schedule(new GreenTask(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5+17+5+3+5+6, TimeUnit.SECONDS); //6 sec
					   executorService.schedule(new blue(), 5+5+3+5+7+5+4+5+12+5+6+5+8+5+17+5+3+5+6+3, TimeUnit.SECONDS); //6 sec
						 
						
			  } 
	  });
}
	 

	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			after = System.currentTimeMillis();
			testnum = testnum +1;
			System.out.print("test #"+testnum+": ");
		    System.out.println(after-initial);
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
		
	}
	


	
	class GreenTask implements Runnable {

		@Override
		public void run() {
			
			
			label.setBackground(Color.green);
			//System.out.println("green");
			initial = System.currentTimeMillis();
		//	System.out.println(initial);
			
			
			
		}

	}
	class RedTask implements Runnable {

		@Override
		public void run() {
			label.setBackground(Color.red);
			//System.out.println("red");
		}

	}
	class blue implements Runnable {

		@Override
		public void run() {
			label.setBackground(Color.blue);
			//System.out.println("red");
		}

	}
	
}
