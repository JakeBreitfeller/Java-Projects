//********************************************************************
//  IntroPanel.java       Authors: Lewis/Loftus
//
//  Represents the introduction panel for the LayoutDemo program.
//********************************************************************

import java.awt.*;
import javax.swing.*;
import javax.swing.Box;

public class IntroPanel extends JPanel
{
   //-----------------------------------------------------------------
   //  Sets up this panel with two labels.
   //-----------------------------------------------------------------
   public IntroPanel()
   {
      setBackground (Color.blue);
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

      JLabel l1 = new JLabel ("Layout Manager Demonstration");
      JLabel l2 = new JLabel ("Choose a tab to see an example of " +
                              "a layout manager.");
      add(Box.createRigidArea(new Dimension(50,50)));
      add (l1);
      add(Box.createRigidArea(new Dimension(50,50)));
      add (l2);
   }
}
