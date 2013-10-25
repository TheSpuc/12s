package opg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonTestFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnName;
	private JTextField textField_1;
	private JButton btnAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonTestFrame frame = new PersonTestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonTestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(125, 113, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnName = new JButton("Name");
		btnName.addActionListener(new BtnAlderActionListener());
		btnName.setBounds(221, 112, 89, 23);
		contentPane.add(btnName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 153, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnAddress = new JButton("Address");
		btnAddress.setBounds(221, 152, 89, 23);
		contentPane.add(btnAddress);
	}
	private class BtnAlderActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
}
