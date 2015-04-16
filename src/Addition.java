import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;



public class Addition {

	public static void main(String [] args) throws Exception{
		
		try{

			
			for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
				System.out.println(info.getName());
				if("Nimbus".equals(info.getName())){
					UIManager.setLookAndFeel(info.getName());
					break;
				}
			}
		}catch(Exception e){
			//throw new Exception("NIMBUS look and feel not found!");
		}
		
		
		String one = JOptionPane.showInputDialog(null, "Enter a number:");
		String two = JOptionPane.showInputDialog(null,"Enter Second Number");
		
		int nOne = Integer.parseInt(one);
		int nTwo = Integer.parseInt(two);
		
		JOptionPane.showMessageDialog(null,String.format("The sum is: %d", (nOne+nTwo)), "Result", JOptionPane.OK_OPTION);
	}
}
