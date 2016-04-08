import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class SafeConverter 
{
	private JPanel panel;
	private JButton F_to_C;
	private JButton F_to_K;
	private JButton C_to_K;
	private JButton C_to_F;
	private JButton K_to_F;
	private JButton K_to_C;
	
	private JTextField text;
	private JLabel label;
	
	public SafeConverter()
	{
		panel = new JPanel();
		F_to_C = new JButton("F to C");
		F_to_K = new JButton("F to K");
		C_to_F = new JButton("C to F");
		C_to_K = new JButton("C to K");
		K_to_F = new JButton("K to F");
		K_to_C = new JButton("K to C");
		
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter a temperature and convert");
		
		//Load the listener
		F_to_C.addActionListener(FCAction());
		F_to_K.addActionListener(FKAction());
		C_to_F.addActionListener(CFAction());
		C_to_K.addActionListener(CKAction());
		K_to_F.addActionListener(KFAction());
		K_to_C.addActionListener(KCAction());
		
		//load the panel
		panel.add(text);
		panel.add(F_to_C);
		panel.add(F_to_K);
		panel.add(C_to_F);
		panel.add(C_to_K);
		panel.add(K_to_F);
		panel.add(K_to_C);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private boolean Parsing(String input)
	{
		//regex from http://www.regular-expressions.info/floatingpoint.html
		if (!input.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"))
		{
			System.out.println("Invalid input");
			return false;
		}
		return true;
	}
	
	private ActionListener FCAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	private ActionListener FKAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInK = (tempInF + 459.67)*(5.0/9.0); //convert F to K
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	private ActionListener CFAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInF = (tempInC*(9.0/5.0))+32; //convert C to F
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	private ActionListener CKAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInK = (tempInC+273.15); //convert C to K
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	private ActionListener KFAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInF = (tempInK*(9.0/5.0))-459.67; //convert K to F
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	private ActionListener KCAction()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				
				if (Parsing(input))
				{
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInC = (tempInK-273.15); //convert K to C
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					label.setText(newText);
					System.out.println(newText);
				}
			}
		};
		return listener;
	}	
	
}