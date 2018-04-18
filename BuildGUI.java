/*
 * File: BuildGUI.java
 * Author: Carrie Miles
 * Date: 4/17/18
 * Purpose: Build GUI/Main/constructors to build the GUI for Project 3
 */

package project;




	 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class BuildGUI implements ActionListener {
	public static JRadioButton iterative = new JRadioButton("Iterative   ");
    public static JRadioButton recursive = new JRadioButton("Recursive");
    public static JTextArea writeEnter = new JTextArea ("Enter n : \t");
    public static JTextField enter = new JTextField (10);
    public static JButton comp = new JButton("Compute");
    public static JTextArea writeResult = new JTextArea("Result: \t");
    public static JTextField result = new JTextField(10);
    public static JTextArea writeEfficiency = new JTextArea("Efficiency: \t");
    public static JTextField efficiency = new JTextField(10);
    public int userEntry;
    
 
    public void addComponentsToPane(Container pane)  {
    	
    pane.setLayout(new GridBagLayout());
    pane.setBackground(Color.WHITE);
    
    //RadioButtons
    GridBagConstraints rb = new GridBagConstraints();
    ButtonGroup group = new ButtonGroup();
    group.add(recursive);
    group.add(iterative);
    rb.weightx =0.5;
    rb.gridx=3;
    rb.gridy=0;
    iterative.setSelected(true);
    
    pane.add(iterative,rb);
    rb.gridx=3;
    rb.gridy=1;
    pane.add(recursive,rb);
    
    //Text for Enter n:
    GridBagConstraints ent = new GridBagConstraints();
    ent.weightx = 1.0;
    ent.gridx=0;
    ent.gridy=2;
    pane.add(writeEnter, ent);
    
    GridBagConstraints tEnt = new GridBagConstraints();
    tEnt.weightx = 1.0;
    tEnt.gridx=2;
    tEnt.gridwidth=2;
    tEnt.gridy=2;
    enter.addActionListener(this);
    pane.add(enter, tEnt);
    //COmpute Button
    GridBagConstraints btn = new GridBagConstraints();
    btn.weightx=0.5;
    btn.gridx=3;
    btn.gridy=3;
    comp.addActionListener(this);
    pane.add(comp, btn);
    //Text for Result
    GridBagConstraints res = new GridBagConstraints();
    res.weightx=0.5;
    res.gridx=0;
    res.gridy=4;
    pane.add(writeResult, res);
    
    GridBagConstraints tRes = new GridBagConstraints();
    tRes.weightx=0.5;
    tRes.gridx=2;
    tRes.gridwidth=2;
    tRes.gridy=4;
    result.setEditable(false);
    pane.add(result, tRes);
    //Text for Efficiency
    GridBagConstraints eff = new GridBagConstraints();
    eff.weightx=0.5;
    eff.gridx=0;
    eff.gridy=5;
    pane.add(writeEfficiency, eff);
    
    GridBagConstraints tEff = new GridBagConstraints();
    tEff.weightx=0.5;
    tEff.gridx=2;
    tEff.gridwidth=2;
    tEff.gridy=5;
    efficiency.setEditable(false);
    pane.add(efficiency, tEff);
    
    }//end addComponents
    
    public void actionPerformed(ActionEvent evt) {
    	//Ensure that the entry is only integers
    	String text = enter.getText();
    	try {
    	userEntry = Integer.parseInt(text);   //tries to convert to int-- used to check if entry is numeric		
    	
    	}catch(NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "Please enter only integers");
    		
    	}catch (NullPointerException e) {
    		JOptionPane.showMessageDialog(null, "Error: Please make your entry again");
    	}
    	//If Iterative is selected
    	if(iterative.isSelected()) {
    		//TODO -- run script from 2nd class to do this
    		JOptionPane.showMessageDialog(null, "Interative is selected");
    	}
    	//If recursive is selected
    	if(recursive.isSelected()) {
    		//TODO -- run script from 2nd class to do this
    		JOptionPane.showMessageDialog(null, "Recursive is selected");
    	}
    }
    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Project 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	BuildGUI gui = new BuildGUI();
            	
                gui.createAndShowGUI();
            }
        });
    }
}
