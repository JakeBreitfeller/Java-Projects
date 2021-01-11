package csit112lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



	public class PigLatinGui implements ActionListener
	{
		
	   JFrame frame;
	   JButton button;
	   JLabel label;
	   JTextField text;
	
	
	   PigLatinGui()
	   {
	       frame = new JFrame("Translate to pig latin");
	       
	       text = new JTextField ();
	       text.setBounds(165,65,175,40); 
	       
	       label = new JLabel();
	       label.setBounds(165,140,225,40);
	       
	       button = new JButton("Click to translate");
	       button.setBounds(165,180,195,40);
	
	       button.addActionListener(this);
	
	       frame.add(text);
	       frame.add(label);
	       frame.add(button);
	       
	       frame.setSize(400,400);
	       
	       frame.setLayout(null);
	       frame.setVisible(true);     
	   }
	   
	   
	   
	   public void actionPerformed(ActionEvent a)
	   {
		   
	       if(text.getText().equals(""))
	       	   {
	           		label.setText("");
	           		JOptionPane.showMessageDialog(null, "Please Enter String");
	           }
	       else
	       {
	           String str = text.getText();  
	           final String vowel = "AEIOUaeiou";
	           String beforevowel = "";
	           int x=0;
	           
	           while(x < str.length() && !vowel.contains("" + str.charAt(x)))
	           {
	               beforevowel += str.charAt(x);   
	               x++;
	           }
	           if(x==0)
	           {
	               str += str.charAt(x) + "w";   
	               x++;
	           }
	           String pigLatin1 = str.substring(x) + beforevowel + "ay";   
	           label.setText(pigLatin1);           
	       }      
	   }          
}