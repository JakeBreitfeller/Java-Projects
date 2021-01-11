//********************************************************************
//  LayoutDemo.java       Authors: Lewis/Loftus
//
//  Demonstrates the use of flow, border, grid, and box layouts.
//********************************************************************

import javax.swing.*;

public class LayoutDemo
{
   //-----------------------------------------------------------------
   //  Sets up a frame containing a tabbed pane. The panel on each
   //  tab demonstrates a different layout manager.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Layout Manager Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      JTabbedPane tp = new JTabbedPane();
      tp.addTab ("Intro", new IntroPanel());   // IntroPanel object created, added to tp
      tp.addTab ("Flow", new FlowPanel());     // FlowPanel object created
      tp.addTab ("Border", new BorderPanel()); // BorderPanel object created
      tp.addTab ("Grid", new GridPanel());     // GridPanel object created
      tp.addTab ("Box", new BoxPanel());       // BoxPanel object created

      frame.getContentPane().add(tp);
      frame.pack();
      frame.setVisible(true);
   }
}
