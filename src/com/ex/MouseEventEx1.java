package com.ex;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx1 extends Frame implements MouseListener{
	
	private Button bt = new Button("확인");
	private Button bt1 = new Button("취소");
	
	public MouseEventEx1() {
		super("Mouse");
		setLayout(new FlowLayout());
		add(bt);add(bt1);
		setEvent();
		setSize(300, 200);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
	
	}
	
	public void setEvent() {
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
	}
	
	
	public static void main(String[] args) {

		new MouseEventEx1();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==bt)
			System.out.println("확인 버튼");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==bt || e.getSource()==bt1)
			System.out.println("마우스가 버튼 위에 있음....");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt || e.getSource()==bt1)
			System.out.println("마우스가 버튼에서 내려왔음....");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bt1)
			System.out.println("취소버튼을 눌렀습니다.");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
