import javax.swing.JFrame;


public class DiceProgramDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		DiceProgram driver = new DiceProgram();
		
		frame.getContentPane().add(driver.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}