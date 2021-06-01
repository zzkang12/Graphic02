package com.ex;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx4 extends Frame {

	public WindowEventEx4() {

		super("창 이벤트4");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new WindowEventEx4();
	}

}
