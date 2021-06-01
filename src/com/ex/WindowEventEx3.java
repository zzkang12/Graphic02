package com.ex;

import java.awt.*;
import java.awt.Event;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventEx3 extends Frame{
	
	public WindowEventEx3() {
		super("이벤트 3");
		addWindowListener(new WinEventEx());
		setSize(300, 300);
		setVisible(true);
	}
	
	class WinEventEx extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new WindowEventEx3();
		
	}

}
