package spellcheck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class Window2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void Newwindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 window = new Window2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChooseOr = new JLabel("Choose 1 or 2 from below:");
		lblChooseOr.setBounds(49, 40, 174, 33);
		frame.getContentPane().add(lblChooseOr);
		
		JLabel lblNewLabel = new JLabel("1. Display dictionary");
		lblNewLabel.setBounds(49, 87, 144, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAddfindWord = new JLabel("2. Add/Find word in dictionary");
		lblAddfindWord.setBounds(49, 142, 157, 25);
		frame.getContentPane().add(lblAddfindWord);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				String input = textField.getText();
				if(input.equals("1")){
					//display dictionary
				}
				else if (input.equals("2")){
					//perform Add/find word in dictionary
					Window3 wd3 = new Window3();
					wd3.NewScreen2();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Option Entered");
				}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(177, 214, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDisplay = new JButton("display");
		btnDisplay.setBounds(257, 88, 89, 23);
		frame.getContentPane().add(btnDisplay);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
