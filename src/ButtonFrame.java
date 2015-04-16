import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ButtonFrame extends JFrame {

	private JButton btn1, btn2;
	
	public ButtonFrame(){
		
		super("Button Frame");
		setLayout(new FlowLayout());
		
		btn1 = new JButton("Plain Button");
		add(btn1);
		
		
		btn2 = new JButton("Fancy Button");
		add(btn2);
		
		btn1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(ButtonFrame.this, "You clicked plain button");
			}
		});
		
		btn2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				Icon bug = new ImageIcon( getClass().getResource("bug.png"));
				btn2.setIcon(bug);
			}
			
		});
	}
	public static void main(String [] args){
		ButtonFrame bf = new ButtonFrame();
		bf.setVisible(true);
		bf.setSize(200,200);
		bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
