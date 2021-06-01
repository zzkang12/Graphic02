package com.ex;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class DialogEx extends Frame{
  private Dialog d = new Dialog(this, "방금 왔지만 집에 가고 싶은 사람들의 모임", false);
  //private Dialog d = new Dialog(null, getTitle(), getFocusTraversalKeysEnabled());
  private Label dlb = new Label("이름과 주민번호로 집 갈 사람 찾기");
  private Label dlb1 = new Label("이름 : ", Label.RIGHT);
  private Label dlb2 = new Label("주민번호 : ", Label.RIGHT);
  private Label dlb3 = new Label("-", Label.CENTER);
 
  private TextField dtf = new TextField(20);
  private TextField dtf1 = new TextField(6);
  private TextField dtf2 = new TextField(7);
 
  private Button dbt = new Button("찾기");
  private Button dbt1 = new Button("취소");
 
  public DialogEx() {
     super("덥다 더워 집에 가자");
     setDialog();
     
     setSize(720,480);
     setVisible(true);
     setResizable(false);
     d.setVisible(true);
     WinEvent we = new WinEvent();
     addWindowListener(we);
  }
 
  private void setDialog() {
     d.setLayout(new BorderLayout());
     d.add("North",dlb);
     
     // 패널 설정
     Panel p1 = new Panel(new BorderLayout());
     Panel p2 = new Panel(new GridLayout(2,1));
     p2.add(dlb1);
     p2.add(dlb2);
     p1.add("West",p2);
     
     Panel p3 = new Panel(new GridLayout(2,1));
     Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
     tfPanel.add(dtf);
     p3.add(tfPanel);
     
     Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
     p4.add(dtf1);
     p4.add(dlb3);
     p4.add(dtf2);
     p3.add(p4);
     
     p1.add("Center",p3);
     d.add("Center", p1);
     
     Panel p = new Panel(new FlowLayout());
     p.add(dbt);
     p.add(dbt1);
     d.add("South", p);
     
     d.setSize(300, 140);
     d.setResizable(false);
  }
 
  public static void main(String[] args) {
     new DialogEx();
  }
}

	class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
}