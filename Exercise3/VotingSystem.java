import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;

public class VotingSystem 
{
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JTextField firstName;
	private JTextField lastName;
	private JLabel label;
	private JLabel first;
	private JLabel last;
	
	public VotingSystem()
	{
		panel = new JPanel();
		button1 = new JButton("Bob The First");
		button2 = new JButton("Bob The Second");
		button3 = new JButton("Bob The Third");
		button4 = new JButton("Bob The Fourth");
		firstName = new JTextField(5);
		lastName = new JTextField(5);
		first = new JLabel("First Name");
		last = new JLabel("Last Name");
		label = new JLabel("Vote for your candidate");
		
		//Load the listener
		button1.addActionListener(buttonListener1());	
		button2.addActionListener(buttonListener2());
		button3.addActionListener(buttonListener3());
		button4.addActionListener(buttonListener4());
		
		//load the panel
		panel.add(first);
		panel.add(firstName);
		panel.add(last);
		panel.add(lastName);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	public boolean writeBallot(String FName,String LName,String vote)
	{
		
		String ballotName = LName+"_"+FName+"_"+"ballot.txt";
		File ballot = new File(ballotName);
		if (ballot.exists())
		{
			return false;
		}
		try 
		{
			FileWriter fileWrite = new FileWriter(ballotName);
			BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
			bufferedWrite.write(vote);
			bufferedWrite.close();
			return true;
		}
		catch (IOException e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	private ActionListener buttonListener1()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String fn = firstName.getText();
				String ln = lastName.getText();
				String Bob = "Bob The First";
				
				if (!fn.equals("") && !ln.equals(""))
				{
					String FName = String.valueOf(Character.toUpperCase(fn.charAt(0)))+fn.substring(1).toLowerCase(); 
					String LName = String.valueOf(Character.toUpperCase(ln.charAt(0)))+ln.substring(1).toLowerCase(); 
					String newText = FName + " " + LName + " ";
					if (writeBallot(FName,LName,Bob))
					{
						newText += "has voted for " + Bob;
						
					}
					else
					{
						newText += "has already voted.";
					}
					System.out.println(newText);
				}
				else
				{
					System.out.println("Must enter a first and last name");
				}
			}
		};
		
		return listener;
	}
	private ActionListener buttonListener2()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fn = firstName.getText();
				String ln = lastName.getText();
				String Bob = "Bob The Second";
				
				if (!fn.equals("") && !ln.equals(""))
				{
					String FName = String.valueOf(Character.toUpperCase(fn.charAt(0)))+fn.substring(1).toLowerCase(); 
					String LName = String.valueOf(Character.toUpperCase(ln.charAt(0)))+ln.substring(1).toLowerCase(); 
					String newText = FName + " " + LName + " ";
					if (writeBallot(FName,LName,Bob))
					{
						newText += "has voted for " + Bob;
						
					}
					else
					{
						newText += "has already voted.";
					}
					System.out.println(newText);
				}
				else
				{
					System.out.println("Must enter a first and last name");
				}
			}
		};
		
		return listener;
	}	
	private ActionListener buttonListener3()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fn = firstName.getText();
				String ln = lastName.getText();
				String Bob = "Bob The Third";
			
				if (!fn.equals("") && !ln.equals(""))
				{
					String FName = String.valueOf(Character.toUpperCase(fn.charAt(0)))+fn.substring(1).toLowerCase(); 
					String LName = String.valueOf(Character.toUpperCase(ln.charAt(0)))+ln.substring(1).toLowerCase(); 
					String newText = FName + " " + LName + " ";
					if (writeBallot(FName,LName,Bob))
					{
						newText += "has voted for " + Bob;
						
					}
					else
					{
						newText += "has already voted.";
					}
					System.out.println(newText);
				}
				else
				{
					System.out.println("Must enter a first and last name");
				}
			}
		};
		
		return listener;
	}	
	
	private ActionListener buttonListener4()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fn = firstName.getText();
				String ln = lastName.getText();
				String Bob = "Bob The Fourth";
				
				if (!fn.equals("") && !ln.equals(""))
				{
					String FName = String.valueOf(Character.toUpperCase(fn.charAt(0)))+fn.substring(1).toLowerCase(); 
					String LName = String.valueOf(Character.toUpperCase(ln.charAt(0)))+ln.substring(1).toLowerCase(); 
					String newText = FName + " " + LName + " ";
					if (writeBallot(FName,LName,Bob))
					{
						newText += "has voted for " + Bob;
						
					}
					else
					{
						newText += "has already voted.";
					}
					System.out.println(newText);
				}
				else
				{
					System.out.println("Must enter a first and last name");
				}
			}
		};
		
		return listener;
	}	
}
