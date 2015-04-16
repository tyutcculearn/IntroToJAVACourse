import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TextFieldFrame extends JFrame {

	public static void main(String[] args){
		TextFieldFrame f = new TextFieldFrame();
		f.setVisible(true);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JTextField tf1, tf2, tf3;
	private JPasswordField pf;
	
	public TextFieldFrame(){
		super("Frame Name which won't appear!");
		setLayout( new FlowLayout());
		
		tf1 = new JTextField(10);
		add(tf1);
		
		tf2 = new JTextField("Enter Text here");
		add(tf2);
		
		tf3 = new JTextField("Uneditable JTextField");
		tf3.setEditable(false);
		add(tf3);
		
		pf = new JPasswordField("Enter Password");
		add(pf);
		
		TextFieldHandler h = new TextFieldHandler();
		tf1.addActionListener(h);
		tf2.addActionListener(h);
		tf3.addActionListener(h);
		
		pf.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, e.getActionCommand());
			}
		});
	}
	
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			if(event.getSource() == tf1){
				string = String.format("textField1 %s", event.getActionCommand());
			}else if(event.getSource() == tf2){
				string = String.format("textField2 %s", event.getActionCommand());
			}else if(event.getSource() == tf3){
				string = String.format("textField3 %s", event.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, string);
		}
	}
}