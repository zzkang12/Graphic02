package com.ex;
import java.awt.*;
import java.awt.event.*;

public class GraphicEx extends Frame implements ActionListener {
	
	Point first_point, last_point, old_point;
	MenuItem menu_tool_pen, menu_tool_line, menu_tool_circle, menu_tool_rect;
	String str = "펜";
	
	
	
	
	public GraphicEx() {
		super("GraphicEx");
		MenuBar mb = new MenuBar();
		Menu menu_tool = new Menu("도구");
		
		menu_tool_pen = new MenuItem("펜");
		menu_tool_line = new MenuItem("선");
		menu_tool_circle = new MenuItem("원");
		menu_tool_rect = new MenuItem("사각형");
		
		menu_tool.add(menu_tool_pen);
		menu_tool.add(menu_tool_line);
		menu_tool.add(menu_tool_circle);
		menu_tool.add(menu_tool_rect);
		
		mb.add(menu_tool);
		setMenuBar(mb);
		
		setBounds(200, 200, 400, 400);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		menu_tool_pen.addActionListener(this);
		menu_tool_line.addActionListener(this);
		menu_tool_circle.addActionListener(this);
		menu_tool_rect.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem selected_menu = (MenuItem)e.getSource();
		
		if(selected_menu.equals(menu_tool_pen)) {
			str=menu_tool_pen.getLabel();
		}else if(selected_menu.equals(menu_tool_line)) {
			str=menu_tool_line.getLabel();
		}else if(selected_menu.equals(menu_tool_circle)) {
			str=menu_tool_circle.getLabel();
		}else if(selected_menu.equals(menu_tool_rect)) {
			str=menu_tool_rect.getLabel();
		}
			
		
	}

	public static void main(String[] args) {
		new GraphicEx();

	}

	class GrimPanCanvas extends Canvas implements MouseMotionListener, MouseListener{

		
		public GrimPanCanvas() {
		
		
		}
		
		@Override
		public void paint(Graphics g) {
		
		}
		
		@Override
		public void update(Graphics g) {
		
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
