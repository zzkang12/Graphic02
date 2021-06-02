package com.ex;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicEx extends Frame implements ActionListener {
	
	Point first_point, last_point, old_point;
	MenuItem menu_tool_pen, menu_tool_line, menu_tool_circle, menu_tool_rect;
	String str = "펜";
	
	
	
	
	public GraphicEx() {
		
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
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
