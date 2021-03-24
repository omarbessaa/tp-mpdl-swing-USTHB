package com.obessaa.usthb.mpdl.tp1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tester {

	public static void main(String[] args) {
		class trtListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Click");
			}
			
		}// inner class
		
		// the main window
		JFrame wind = new JFrame();
		wind.setTitle("tp1");
		wind.setBounds(10, 40, 700, 500);
		wind.setVisible(true);
		wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//get the container of the frame 
		Container con = wind.getContentPane();
		
		// the layout manager
		FlowLayout lay = new FlowLayout(FlowLayout.CENTER);
		//set the layout manger of our container (of the frame ) to our new LM that we just created
 		con.setLayout(lay);
 		
 		// create a button and add it to the frame
 		JButton btn1 = new JButton();
 		btn1.setPreferredSize(new Dimension(100,50));
 		//add it to the container
 		con.add(btn1);
 		
 		//**************** add the listener on the event click
 		ActionListener lsnr = new trtListener();
 		btn1.addActionListener(lsnr);
		
	}
	
	
	

}
