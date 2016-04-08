
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.*;
public class DiceProgram
{	
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public DiceProgram()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(5);//5 col
		label = new JLabel("Enter a number of sides");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				int numSides = Integer.parseInt(input);//convert String to int
				Random random = new Random();
				int randomNum = random.nextInt(numSides) + 1;
				
				String newText = "You rolled: " + String.format("%1$d",randomNum);//convert int to String and
											       //display first and only argument
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}
