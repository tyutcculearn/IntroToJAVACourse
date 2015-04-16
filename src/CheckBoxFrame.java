import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CheckBoxFrame extends JFrame {

	private JTextField tf;
	private JCheckBox boldCheckBox, italicCheckBox;
	
	public CheckBoxFrame(String message){
		super(message);

		setLayout(new FlowLayout());
		
		tf = new JTextField("A sample text here!");
		tf.setFont(new Font("Serif",Font.PLAIN,14));
		tf.setEditable(false);
		add(tf);
		
		boldCheckBox = new JCheckBox("Bold");
		add(boldCheckBox);
		
		italicCheckBox = new JCheckBox("Italic");
		add(italicCheckBox);
		
		Handler h = new Handler();
		boldCheckBox.addItemListener(h);
		italicCheckBox.addItemListener(h);
		
	}
	private class Handler implements ItemListener{
		Font font;
		public void itemStateChanged(ItemEvent e){
			if(boldCheckBox.isSelected() && italicCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD+Font.ITALIC,14);
			}else if(boldCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			}else {
				font = new Font("Serif", Font.ITALIC,14);
			}
			tf.setFont(font);
		}
	}
	public static void main(String [] args){
		CheckBoxFrame cf = new CheckBoxFrame("Text NEVER Shown");
		cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cf.setVisible(true);
		cf.setSize(400,400);
	}
}
