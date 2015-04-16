import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class RadioButtonFrame extends JFrame{

	private JTextField tf;
	private Font plain, bold, italic, boldItalic;
	private JRadioButton bBtn, iBtn, pBtn, biBtn;
	private ButtonGroup radioGroup;
	
	public RadioButtonFrame(){
		super();
		
		setLayout(new FlowLayout());
		
		tf = new JTextField("Sample Text Here To Demonstrate RadioButtons");
		tf.setFont(plain);
		add(tf);
		
		plain = new Font("Serif", Font.PLAIN, 14);
		bold = new Font("Serif", Font.BOLD, 14);
		italic = new Font("Serif", Font.ITALIC, 14);
		boldItalic = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
		
		pBtn = new JRadioButton("Plain",true);
		bBtn = new JRadioButton("Bold", false);
		iBtn = new JRadioButton("Italic", false);
		biBtn = new JRadioButton("Italic and Bold", false);
		add(pBtn);
		add(bBtn);
		add(iBtn);
		add(biBtn);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(pBtn);
		radioGroup.add(bBtn);
		radioGroup.add(iBtn);
		radioGroup.add(biBtn);
		
		pBtn.addItemListener(new ButtonHandler(plain));
		bBtn.addItemListener(new ButtonHandler(bold));
		iBtn.addItemListener(new ButtonHandler(italic));
		biBtn.addItemListener(new ButtonHandler(boldItalic));
		
	}
	private class ButtonHandler implements ItemListener{
		Font font = null;
		public ButtonHandler(Font f){
			font = f;
		}
		public void itemStateChanged(ItemEvent e){
			tf.setFont(font);
		}
	}
	
	public static void main(String [] args){
		
		RadioButtonFrame rbf = new RadioButtonFrame();
		rbf.setVisible(true);
		rbf.setSize(200, 300);
		rbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
