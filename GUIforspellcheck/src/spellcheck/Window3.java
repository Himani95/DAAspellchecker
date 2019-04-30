package spellcheck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window3 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window3 window = new Window3();
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
	public Window3() {
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
		
		JLabel lblEnterAWord = new JLabel("Enter a word here");
		lblEnterAWord.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterAWord.setBounds(141, 57, 192, 48);
		frame.getContentPane().add(lblEnterAWord);
		
		textField = new JTextField();
		textField.setBounds(141, 132, 145, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearchTheDictionary = new JButton("Search the dictionary");
		btnSearchTheDictionary.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				//check for the user input word in dictionary
				String userword = textField.getText();
				/*if(dict.contains(userword)){
					JOptionPane.showMessageDialog(null, "Hurrah!!The word exists in the dictionary and is spelled correctly");
				}else{
					JOptionPane.showInputDialog("Sorry the word is spelled wrongly.\nThe nearest match to this is -  with an editDistance of - \nWould you like to add this word to the dictionary?");
				}*/
			}
		});
		btnSearchTheDictionary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSearchTheDictionary.setBounds(138, 208, 158, 25);
		frame.getContentPane().add(btnSearchTheDictionary);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
