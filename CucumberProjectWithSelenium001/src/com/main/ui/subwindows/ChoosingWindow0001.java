package com.main.ui.subwindows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChoosingWindow0001 extends JOptionPane implements ActionListener{

	private static final String iconPath="";
	
	public ChoosingWindow0001() {
		// TODO Auto-generated constructor stub
	
	}

	private void setLabel(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object[] possibilities = {"Chrome", "Firefox", "MSEdge"};
		Icon icon = new ImageIcon("E:\\CMS PoCs\\selenium_testing\\logos_images\\more imgs\\iconfortestingapp.jpg");
		String s = (String)JOptionPane.showInputDialog(
		                    this,
		                    "Choose the browser:\n"
		                    + "\"Green eggs and...\"",
		                    "sample", JOptionPane.QUESTION_MESSAGE,
		                    icon,
		                    possibilities,
		                    "Chrome");

		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    setLabel("Green eggs and... " + s + "!");
		    return;
		}
	}

}
