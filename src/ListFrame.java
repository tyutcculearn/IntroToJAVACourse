import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ListFrame extends JFrame {

	private JList list;
	private final String [] names = {"Red", "Black", "Blue"};
	private final Color [] color = {Color.red, Color.black, Color.blue};
	
	public ListFrame(){
		super();
		setLayout(new FlowLayout());
		
		list = new JList(names);
		list.setVisibleRowCount(3);
		add(list);
		list.addListSelectionListener(new ListSelectionListener(){
			
			public void valueChanged(ListSelectionEvent event){
				
				getContentPane().setBackground(color[list.getSelectedIndex()]);
			}
		});
		
		
	}
	
	public static void main(String [] args){
		ListFrame lf = new ListFrame();
		lf.setVisible(true);
		lf.setSize(200,200);
		lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
