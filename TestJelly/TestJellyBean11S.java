package TestJelly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class TestJellyBean11S extends JFrame {

	private JPanel contentPane;
	private JellyBean jellyBean;
	private JButton btnBl;
	private JButton btnRd;
	private JButton btnOrange;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJellyBean11S frame = new TestJellyBean11S();
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
	public TestJellyBean11S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jellyBean = new JellyBean();
		jellyBean.addPropertyChangeListener(new JellyBeanPropertyChangeListener());
		jellyBean.setBounds(290, 49, 60, 40);
		contentPane.add(jellyBean);

		btnBl = new JButton("Bl\u00E5");
		btnBl.addActionListener(new BtnBlActionListener());
		btnBl.setBounds(24, 35, 89, 23);
		contentPane.add(btnBl);

		btnRd = new JButton("R\u00F8d");
		btnRd.addActionListener(new BtnRdActionListener());
		btnRd.setBounds(24, 69, 89, 23);
		contentPane.add(btnRd);

		btnOrange = new JButton("Orange");
		btnOrange.addActionListener(new BtnOrangeActionListener());
		btnOrange.setBounds(24, 103, 89, 23);
		contentPane.add(btnOrange);

		textField = new JTextField();
		textField.setBounds(203, 128, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	private class BtnBlActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			jellyBean.setColor(Color.BLUE);
		}
	}

	private class BtnRdActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jellyBean.setColor(Color.RED);
		}
	}

	private class BtnOrangeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jellyBean.setColor(Color.ORANGE);
		}
	}

	private class JellyBeanPropertyChangeListener implements PropertyChangeListener {
		public void propertyChange(PropertyChangeEvent arg0) {
			if (arg0.getPropertyName().equals("color")) {
				System.out.println(arg0.getPropertyName());
				textField.setText("Ny farve " + jellyBean.getColor().toString());
			}
		}
	}
}
