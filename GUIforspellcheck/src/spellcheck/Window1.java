package spellcheck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Window1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 window = new Window1();
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
	public Window1() {
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
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window2 w2 = new Window2();
				w2.Newwindow();
			}
		});
		btnContinue.setBounds(182, 188, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		JLabel lblWelcomeToSpellchecker = new JLabel("Welcome to SpellChecker");
		lblWelcomeToSpellchecker.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblWelcomeToSpellchecker.setBounds(143, 78, 173, 23);
		frame.getContentPane().add(lblWelcomeToSpellchecker);
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
