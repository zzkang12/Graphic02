package com.ex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx2 extends Frame implements ActionListener{

	
	private Button bt= new Button("종료");
	
	public ActionEventEx2() {
		super("버튼이벤트");
		bt.addActionListener(this);
		setLayout(new FlowLayout());
		add(bt);
		setSize(300, 300);
		setVisible(true);
		
		
	};
	
	
	public static void main(String[] args) {
		new ActionEventEx2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt)
			System.exit(0);;
	}

}
