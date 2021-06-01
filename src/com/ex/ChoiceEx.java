package com.ex;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceEx extends Frame{

	private Label la = new Label("생일");
	private Choice co = new Choice();
	private Button bt = new Button("확인");
	
	public ChoiceEx() {
		
		super("Choice");
		setLayout(new GridLayout(3, 1));
		add(la);

		for(int i=1; i<=12; i++) {
			co.add(String.valueOf(i)+"월");
		}
		
		add(co);
		add(bt);
		
		
		pack();
		setVisible(true);
		WinEvent we= new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new ChoiceEx();
		
	}
	public class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
