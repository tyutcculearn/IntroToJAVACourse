import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class FrameExample extends JFrame {

	private JLabel label1,label2,label3;
	
	public FrameExample(){
		super("FrameExample");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with Text");
		label1.setToolTipText("label1");
		add(label1);
		
		Icon bug = new ImageIcon(getClass().getResource("bug.png"));
		label2 = new JLabel("Label with text and Icon", bug,SwingConstants.LEFT);
		label2.setToolTipText("label2");
		add(label2);

		label3 = new JLabel();
		label3.setText("Label three");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(label3);
	}
	public static void main(String [] args){
		FrameExample fe = new FrameExample();
		fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fe.setSize(200, 200);
		fe.setVisible(true);
	}
}
