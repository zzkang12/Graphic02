package com.ex;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class ActionEventEx1 extends Frame implements ActionListener{
	
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx1() {
		super("ActionEvent");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		setSize(300, 200);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new ActionEventEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String imsi = tf.getText();
			System.out.println("메시지 :"+imsi);
			tf.setText("");
		}
	}

}
