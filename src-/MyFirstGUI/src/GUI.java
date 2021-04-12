import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	//  Labels 
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
// Project version alpha-0.1
	// This was made by Fossos www.github.com/Fossos-projects
	
	
	public GUI() {
		
		frame = new JFrame();
		
		// Adds the button, and listens for input
		button = new JButton("Click This!");
		button.addActionListener(this);
		
		// The text that shows the amount of clicks
		label = new JLabel("Number of clicks: 0");
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		// Makes the actual Frame
		
		// The title of the window, and the close action.
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Click Counter");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// This was automatically generated by ECLIPSE IDE
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
		// Updates the amount.
	}

	
		{
		// Don't ever do the same as me, it kept showing an error so I went the manual route.
		System.out.println("Click Counter - Version 0,2 -> Build ALPHA");	}
		}

