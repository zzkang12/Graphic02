package com.ex;

import java.awt.*;

public class FileDialogEx extends Frame{

	FileDialog fd = new FileDialog(this, "내 파일 저장", FileDialog.SAVE);
	public FileDialogEx() {
		super("FileDialog");
		setSize(300, 200);
		setVisible(true);
		
		fd.setVisible(true);
	     WinEvent we = new WinEvent();
	     addWindowListener(we);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}
	
	public static void main(String[] args) {
		new FileDialogEx();
		
	}

}
