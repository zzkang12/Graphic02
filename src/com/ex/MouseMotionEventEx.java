package com.ex;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionEventEx extends Frame implements MouseMotionListener{

	public MouseMotionEventEx() {
		super("MouseMotion");
		
		addMouseMotionListener(this);
		
		setSize(1000, 800);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new MouseMotionEventEx();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==this) 
			System.out.println("X="+e.getX()+", Y="+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource()==this) 
			System.out.println("X="+e.getX()+", Y="+e.getY());		
	}

}
