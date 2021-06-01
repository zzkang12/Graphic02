package com.ex;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx3 extends Frame implements ActionListener {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("file");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Exit");

	public ActionEventEx3() {
		super("ActionEventEx");

		setMenuBar(mb);
		mb.add(file);
		file.add(now);
		file.addSeparator();
		file.add(exit);

		setSize(300, 200);
		setVisible(true);
		
		now.addActionListener(this);
		exit.addActionListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
	}

	public static void main(String[] args) {
		new ActionEventEx3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == now) {
			System.out.println("지금 이시각>");
		} else if (e.getSource() == exit) {
			System.exit(0);
		}
	}

}
