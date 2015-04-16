import javax.swing.JOptionPane;

public class Exercise317 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "My First JOptionPane Experience" );
		String name = JOptionPane.showInputDialog("Enter Your Name: ");
		String message = String.format("Hello %s", name);
		JOptionPane.showMessageDialog(null,message, "Window Title", JOptionPane.INFORMATION_MESSAGE,null);
	}

}
