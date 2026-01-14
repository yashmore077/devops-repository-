package com.gui;
import java.awt.*;

import javax.swing.JTextField;

public class loginDemo extends JFrame implements ActionListener 
{
		Jlabel l1=new Jlabel("Enter username");
		Jlabel l1=new Jlabel("Enter Password");
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JButton b1=new JButton("login");
		loginDemo
		{
			setvisible(true);
			setTitle("login form");
			setSize(250,200);
			add(l1); add(t1);
			add(l2); add(t1);
			add(b1)
			SetLayout(new FlowLayout());
			b1.addAcionListener(this);
		}
		

	public static void main(String[] args) {
		
		loginDemo f1=new loginDemo();
		
	}
	@override
	public void actionPerformed(ActionEvent e)
	{
		String user=t1.getText();
		String user=t2.getText();
		if(user.equals(pass))
		{
			JOptionPane.ShowMessageDialog(null,"login succesfull");
		}
		else
		{
			JOptionPane.ShowMessageDialog(null,"login Failed");
		}
	}
	
	

}
