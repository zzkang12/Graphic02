package com.ex;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx4 extends Frame implements ActionListener{

	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = 
		{Color.red, Color.green, Color.blue, Color.yellow};
	private CardLayout card = new CardLayout();
	private Panel pptop;// 카드 레이아
 	
	public ActionEventEx4() {
		super("ActionEvent");
		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));
		for(int i =0; i<bt.length; i++) {
			bt[i] = new Button(i+1+"번 버튼");
			// 이벤트 등록
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		
		add("North", p);
		pptop = new Panel(card);
		for(int i =0; i<pp.length; i++) {
			pp[i]= new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i, pp[i]);
		}
		
		add("Center", pptop);
		
		card.show(pptop, "0");
		
		setSize(300, 200);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new ActionEventEx4();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<4;i++) {
			if(e.getSource() == bt[i]) {
				card.show(pptop, ""+i);
			}
		}
	}

}
